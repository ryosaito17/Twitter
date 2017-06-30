

/* Create Tables */

CREATE TABLE GOOD
(
	GOOD_ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'いいねID',
	USER_ID BIGINT NOT NULL COMMENT 'いいね会員ID : いいねをした会員のID',
	MUTTER_ID BIGINT NOT NULL COMMENT 'つぶやきID : いいねをした対象のつぶやきのID',
	GOOD_FLG BOOLEAN COMMENT 'いいね有無 : trueの場合はいいねをしている状態。
nullもしくはfalseの場合はいいねをしていない状態。',
	PRIMARY KEY (GOOD_ID),
	CONSTRAINT UQ_LIKE_MUTTER UNIQUE (MUTTER_ID, USER_ID)
) COMMENT = 'いいね';


CREATE TABLE LOGIN
(
	LOGIN_FLG BOOLEAN COMMENT 'ログイン有無 : trueの場合はログインしている。falseの場合はログアウトしている。',
	USER_ID BIGINT NOT NULL UNIQUE COMMENT 'ユーザーID : ユーザーのID。連番で一意なデータ。',
	LAST_LOGIN_DATETIME DATETIME COMMENT '最終ログイン日時 : 最後にログインした日時を格納する。
* このデータを使って、1週間以上ログインがない場合は通知をするなどの機能を実装する。
新規登録した時点で登録される。それまではnull',
	LAST_LOGOUT_DATETIME DATETIME COMMENT '最終ログアウト日時 : 最終ログアウト日時。このデータを使って、最後にログアウトしてから1週間でメール通知するなどの施策を行う。
初めてログアウトした時点で登録される。初期値はnull'
) COMMENT = 'ログイン';


CREATE TABLE MUTTER
(
	MUTTER_ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'つぶやきID',
	USER_ID BIGINT NOT NULL UNIQUE COMMENT 'ユーザーID : ユーザーのID。連番で一意なデータ。',
	MUTTER_DATETIME DATETIME NOT NULL COMMENT 'つぶやき日時 : つぶやきの行われた日時。
（あぷりで、このデータを使い、地図上に表示するツイートを消すタイミングを決定する。）',
	MUTTER_TEXT TEXT NOT NULL COMMENT 'つぶやき内容 : つぶやき内容。
アプリ側で「140文字以内」「不適切な文字列」「空白」のバリデーションをする。',
	MUTTER_IMAGE BLOB COMMENT 'つぶやき画像 : つぶやきの画像を格納する。
64KBの画像しかいけないのかどうか、検証する必要あり。',
	MUTTER_LATITUDE DOUBLE COMMENT 'つぶやき緯度 : つぶやきを実施した時のユーザの位置情報：緯度
位置情報設定をOFFにしていた場合にはnullが入る。',
	MUTTER_LONGITUDE DOUBLE COMMENT 'つぶやき経度 : つぶやきを実施した時のユーザの位置情報：経度
位置情報設定をOFFにしていた場合にはnullが入る。',
	EDIT_DATETIME DATETIME COMMENT '編集日時 : つぶやきの編集日時
一度も編集していない場合はnull',
	PRIMARY KEY (MUTTER_ID)
) COMMENT = 'つぶやき';


CREATE TABLE RELATION
(
	RELATION_ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'フォロー関係ID',
	USER_ID BIGINT NOT NULL UNIQUE COMMENT '会員ID : ユーザーのID。連番で一意なデータ。',
	FOLLOW_USER_ID BIGINT NOT NULL COMMENT 'フォロー会員ID : フォローしている会員のID。
フォローしている会員がいない場合にはnullになる。',
	FOLLOW_APPROVAL_DATETIME DATETIME COMMENT 'フォロー承認日時 : フォローを承認された日時。
初期値はnullで、ここが設定されていればフォローが承認されていることを意味する。
ブロックされると、ここが再度nullになる。',
	PRIMARY KEY (RELATION_ID)
) COMMENT = 'フォロー関係';


CREATE TABLE USER
(
	USER_ID BIGINT NOT NULL UNIQUE AUTO_INCREMENT COMMENT 'ユーザーID',
	ACCOUNT_ID VARCHAR(30) NOT NULL UNIQUE COMMENT 'アカウントID',
	REGISTER_DATETIME DATETIME NOT NULL COMMENT '登録日時',
	PASSWORD VARCHAR(30) NOT NULL COMMENT 'パスワード',
	MAIL_ADDRESS VARCHAR(100) COMMENT 'メールアドレス',
	FOLLOW_ACCEPT_FLG BOOLEAN COMMENT 'フォロー承認設定',
	GEOLOCATION_FLG BOOLEAN COMMENT '位置情報設定',
	PRIMARY KEY (USER_ID)
) COMMENT = 'ユーザー';



/* Create Foreign Keys */

ALTER TABLE GOOD
	ADD CONSTRAINT FK_GOOD_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE LOGIN
	ADD CONSTRAINT FK_LOGIN_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE MUTTER
	ADD CONSTRAINT FK_MUTTER_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE RELATION
	ADD CONSTRAINT FK_RELATION_USER FOREIGN KEY (USER_ID)
	REFERENCES USER (USER_ID)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



