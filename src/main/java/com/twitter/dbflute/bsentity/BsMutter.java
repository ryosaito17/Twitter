package com.twitter.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.twitter.dbflute.allcommon.DBMetaInstanceHandler;
import com.twitter.dbflute.exentity.*;

/**
 * The entity of MUTTER as TABLE. <br>
 * つぶやき
 * <pre>
 * [primary-key]
 *     MUTTER_ID
 * 
 * [column]
 *     MUTTER_ID, USER_ID, MUTTER_DATETIME, MUTTER_TEXT, MUTTER_IMAGE, MUTTER_LATITUDE, MUTTER_LONGITUDE, EDIT_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     MUTTER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     USER
 * 
 * [referrer table]
 *     
 * 
 * [foreign property]
 *     user
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long mutterId = entity.getMutterId();
 * Long userId = entity.getUserId();
 * java.time.LocalDateTime mutterDatetime = entity.getMutterDatetime();
 * String mutterText = entity.getMutterText();
 * byte[] mutterImage = entity.getMutterImage();
 * java.math.BigDecimal mutterLatitude = entity.getMutterLatitude();
 * java.math.BigDecimal mutterLongitude = entity.getMutterLongitude();
 * java.time.LocalDateTime editDatetime = entity.getEditDatetime();
 * entity.setMutterId(mutterId);
 * entity.setUserId(userId);
 * entity.setMutterDatetime(mutterDatetime);
 * entity.setMutterText(mutterText);
 * entity.setMutterImage(mutterImage);
 * entity.setMutterLatitude(mutterLatitude);
 * entity.setMutterLongitude(mutterLongitude);
 * entity.setEditDatetime(editDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMutter extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** MUTTER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _mutterId;

    /** USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** MUTTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _mutterDatetime;

    /** MUTTER_TEXT: {NotNull, TEXT(65535)} */
    protected String _mutterText;

    /** MUTTER_IMAGE: {BLOB(65535)} */
    protected byte[] _mutterImage;

    /** MUTTER_LATITUDE: {DOUBLE(22)} */
    protected java.math.BigDecimal _mutterLatitude;

    /** MUTTER_LONGITUDE: {DOUBLE(22)} */
    protected java.math.BigDecimal _mutterLongitude;

    /** EDIT_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _editDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "MUTTER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_mutterId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userId : UQ, NotNull, BIGINT(19), FK to USER. (NotNull)
     */
    public void uniqueBy(Long userId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userId");
        setUserId(userId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsMutter) {
            BsMutter other = (BsMutter)obj;
            if (!xSV(_mutterId, other._mutterId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _mutterId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_mutterId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_mutterDatetime));
        sb.append(dm).append(xfND(_mutterText));
        sb.append(dm).append(xfBA(_mutterImage));
        sb.append(dm).append(xfND(_mutterLatitude));
        sb.append(dm).append(xfND(_mutterLongitude));
        sb.append(dm).append(xfND(_editDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Mutter clone() {
        return (Mutter)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] MUTTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * つぶやきID
     * @return The value of the column 'MUTTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMutterId() {
        checkSpecifiedProperty("mutterId");
        return _mutterId;
    }

    /**
     * [set] MUTTER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * つぶやきID
     * @param mutterId The value of the column 'MUTTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMutterId(Long mutterId) {
        registerModifiedProperty("mutterId");
        _mutterId = mutterId;
    }

    /**
     * [get] USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} <br>
     * ユーザーID : ユーザーのID。連番で一意なデータ。
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} <br>
     * ユーザーID : ユーザーのID。連番で一意なデータ。
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] MUTTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * つぶやき日時 : つぶやきの行われた日時。<br>
     * （あぷりで、このデータを使い、地図上に表示するツイートを消すタイミングを決定する。）
     * @return The value of the column 'MUTTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getMutterDatetime() {
        checkSpecifiedProperty("mutterDatetime");
        return _mutterDatetime;
    }

    /**
     * [set] MUTTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * つぶやき日時 : つぶやきの行われた日時。<br>
     * （あぷりで、このデータを使い、地図上に表示するツイートを消すタイミングを決定する。）
     * @param mutterDatetime The value of the column 'MUTTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setMutterDatetime(java.time.LocalDateTime mutterDatetime) {
        registerModifiedProperty("mutterDatetime");
        _mutterDatetime = mutterDatetime;
    }

    /**
     * [get] MUTTER_TEXT: {NotNull, TEXT(65535)} <br>
     * つぶやき内容 : つぶやき内容。<br>
     * アプリ側で「140文字以内」「不適切な文字列」「空白」のバリデーションをする。
     * @return The value of the column 'MUTTER_TEXT'. (basically NotNull if selected: for the constraint)
     */
    public String getMutterText() {
        checkSpecifiedProperty("mutterText");
        return _mutterText;
    }

    /**
     * [set] MUTTER_TEXT: {NotNull, TEXT(65535)} <br>
     * つぶやき内容 : つぶやき内容。<br>
     * アプリ側で「140文字以内」「不適切な文字列」「空白」のバリデーションをする。
     * @param mutterText The value of the column 'MUTTER_TEXT'. (basically NotNull if update: for the constraint)
     */
    public void setMutterText(String mutterText) {
        registerModifiedProperty("mutterText");
        _mutterText = mutterText;
    }

    /**
     * [get] MUTTER_IMAGE: {BLOB(65535)} <br>
     * つぶやき画像 : つぶやきの画像を格納する。<br>
     * 64KBの画像しかいけないのかどうか、検証する必要あり。
     * @return The value of the column 'MUTTER_IMAGE'. (NullAllowed even if selected: for no constraint)
     */
    public byte[] getMutterImage() {
        checkSpecifiedProperty("mutterImage");
        return _mutterImage;
    }

    /**
     * [set] MUTTER_IMAGE: {BLOB(65535)} <br>
     * つぶやき画像 : つぶやきの画像を格納する。<br>
     * 64KBの画像しかいけないのかどうか、検証する必要あり。
     * @param mutterImage The value of the column 'MUTTER_IMAGE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMutterImage(byte[] mutterImage) {
        registerModifiedProperty("mutterImage");
        _mutterImage = mutterImage;
    }

    /**
     * [get] MUTTER_LATITUDE: {DOUBLE(22)} <br>
     * つぶやき緯度 : つぶやきを実施した時のユーザの位置情報：緯度<br>
     * 位置情報設定をOFFにしていた場合にはnullが入る。
     * @return The value of the column 'MUTTER_LATITUDE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMutterLatitude() {
        checkSpecifiedProperty("mutterLatitude");
        return _mutterLatitude;
    }

    /**
     * [set] MUTTER_LATITUDE: {DOUBLE(22)} <br>
     * つぶやき緯度 : つぶやきを実施した時のユーザの位置情報：緯度<br>
     * 位置情報設定をOFFにしていた場合にはnullが入る。
     * @param mutterLatitude The value of the column 'MUTTER_LATITUDE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMutterLatitude(java.math.BigDecimal mutterLatitude) {
        registerModifiedProperty("mutterLatitude");
        _mutterLatitude = mutterLatitude;
    }

    /**
     * [get] MUTTER_LONGITUDE: {DOUBLE(22)} <br>
     * つぶやき経度 : つぶやきを実施した時のユーザの位置情報：経度<br>
     * 位置情報設定をOFFにしていた場合にはnullが入る。
     * @return The value of the column 'MUTTER_LONGITUDE'. (NullAllowed even if selected: for no constraint)
     */
    public java.math.BigDecimal getMutterLongitude() {
        checkSpecifiedProperty("mutterLongitude");
        return _mutterLongitude;
    }

    /**
     * [set] MUTTER_LONGITUDE: {DOUBLE(22)} <br>
     * つぶやき経度 : つぶやきを実施した時のユーザの位置情報：経度<br>
     * 位置情報設定をOFFにしていた場合にはnullが入る。
     * @param mutterLongitude The value of the column 'MUTTER_LONGITUDE'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMutterLongitude(java.math.BigDecimal mutterLongitude) {
        registerModifiedProperty("mutterLongitude");
        _mutterLongitude = mutterLongitude;
    }

    /**
     * [get] EDIT_DATETIME: {DATETIME(19)} <br>
     * 編集日時 : つぶやきの編集日時<br>
     * 一度も編集していない場合はnull
     * @return The value of the column 'EDIT_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getEditDatetime() {
        checkSpecifiedProperty("editDatetime");
        return _editDatetime;
    }

    /**
     * [set] EDIT_DATETIME: {DATETIME(19)} <br>
     * 編集日時 : つぶやきの編集日時<br>
     * 一度も編集していない場合はnull
     * @param editDatetime The value of the column 'EDIT_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setEditDatetime(java.time.LocalDateTime editDatetime) {
        registerModifiedProperty("editDatetime");
        _editDatetime = editDatetime;
    }
}
