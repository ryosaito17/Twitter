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
 * The entity of LOGIN as TABLE. <br>
 * ログイン
 * <pre>
 * [primary-key]
 *     
 * 
 * [column]
 *     LOGIN_FLG, USER_ID, LAST_LOGIN_DATETIME, LAST_LOGOUT_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     
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
 * Boolean loginFlg = entity.getLoginFlg();
 * Long userId = entity.getUserId();
 * java.time.LocalDateTime lastLoginDatetime = entity.getLastLoginDatetime();
 * java.time.LocalDateTime lastLogoutDatetime = entity.getLastLogoutDatetime();
 * entity.setLoginFlg(loginFlg);
 * entity.setUserId(userId);
 * entity.setLastLoginDatetime(lastLoginDatetime);
 * entity.setLastLogoutDatetime(lastLogoutDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsLogin extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** LOGIN_FLG: {BIT} */
    protected Boolean _loginFlg;

    /** USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** LAST_LOGIN_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _lastLoginDatetime;

    /** LAST_LOGOUT_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _lastLogoutDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "LOGIN";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        return false;
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
        if (obj instanceof BsLogin) {
            BsLogin other = (BsLogin)obj;
            if (!xSV(_loginFlg, other._loginFlg)) { return false; }
            if (!xSV(_userId, other._userId)) { return false; }
            if (!xSV(_lastLoginDatetime, other._lastLoginDatetime)) { return false; }
            if (!xSV(_lastLogoutDatetime, other._lastLogoutDatetime)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _loginFlg);
        hs = xCH(hs, _userId);
        hs = xCH(hs, _lastLoginDatetime);
        hs = xCH(hs, _lastLogoutDatetime);
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
        sb.append(dm).append(xfND(_loginFlg));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_lastLoginDatetime));
        sb.append(dm).append(xfND(_lastLogoutDatetime));
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
    public Login clone() {
        return (Login)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] LOGIN_FLG: {BIT} <br>
     * ログイン有無 : trueの場合はログインしている。falseの場合はログアウトしている。
     * @return The value of the column 'LOGIN_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getLoginFlg() {
        checkSpecifiedProperty("loginFlg");
        return _loginFlg;
    }

    /**
     * [set] LOGIN_FLG: {BIT} <br>
     * ログイン有無 : trueの場合はログインしている。falseの場合はログアウトしている。
     * @param loginFlg The value of the column 'LOGIN_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLoginFlg(Boolean loginFlg) {
        registerModifiedProperty("loginFlg");
        _loginFlg = loginFlg;
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
     * [get] LAST_LOGIN_DATETIME: {DATETIME(19)} <br>
     * 最終ログイン日時 : 最後にログインした日時を格納する。<br>
     * * このデータを使って、1週間以上ログインがない場合は通知をするなどの機能を実装する。<br>
     * 新規登録した時点で登録される。それまではnull
     * @return The value of the column 'LAST_LOGIN_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLastLoginDatetime() {
        checkSpecifiedProperty("lastLoginDatetime");
        return _lastLoginDatetime;
    }

    /**
     * [set] LAST_LOGIN_DATETIME: {DATETIME(19)} <br>
     * 最終ログイン日時 : 最後にログインした日時を格納する。<br>
     * * このデータを使って、1週間以上ログインがない場合は通知をするなどの機能を実装する。<br>
     * 新規登録した時点で登録される。それまではnull
     * @param lastLoginDatetime The value of the column 'LAST_LOGIN_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastLoginDatetime(java.time.LocalDateTime lastLoginDatetime) {
        registerModifiedProperty("lastLoginDatetime");
        _lastLoginDatetime = lastLoginDatetime;
    }

    /**
     * [get] LAST_LOGOUT_DATETIME: {DATETIME(19)} <br>
     * 最終ログアウト日時 : 最終ログアウト日時。このデータを使って、最後にログアウトしてから1週間でメール通知するなどの施策を行う。<br>
     * 初めてログアウトした時点で登録される。初期値はnull
     * @return The value of the column 'LAST_LOGOUT_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getLastLogoutDatetime() {
        checkSpecifiedProperty("lastLogoutDatetime");
        return _lastLogoutDatetime;
    }

    /**
     * [set] LAST_LOGOUT_DATETIME: {DATETIME(19)} <br>
     * 最終ログアウト日時 : 最終ログアウト日時。このデータを使って、最後にログアウトしてから1週間でメール通知するなどの施策を行う。<br>
     * 初めてログアウトした時点で登録される。初期値はnull
     * @param lastLogoutDatetime The value of the column 'LAST_LOGOUT_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setLastLogoutDatetime(java.time.LocalDateTime lastLogoutDatetime) {
        registerModifiedProperty("lastLogoutDatetime");
        _lastLogoutDatetime = lastLogoutDatetime;
    }
}
