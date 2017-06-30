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
 * The entity of USER as TABLE. <br>
 * ユーザー
 * <pre>
 * [primary-key]
 *     USER_ID
 * 
 * [column]
 *     USER_ID, ACCOUNT_ID, REGISTER_DATETIME, PASSWORD, MAIL_ADDRESS, FOLLOW_ACCEPT_FLG, GEOLOCATION_FLG
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     USER_ID
 * 
 * [version-no]
 *     
 * 
 * [foreign table]
 *     LOGIN(AsOne), MUTTER(AsOne), RELATION(AsOne)
 * 
 * [referrer table]
 *     GOOD, LOGIN, MUTTER, RELATION
 * 
 * [foreign property]
 *     loginAsOne, mutterAsOne, relationAsOne
 * 
 * [referrer property]
 *     goodList
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String accountId = entity.getAccountId();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * String password = entity.getPassword();
 * String mailAddress = entity.getMailAddress();
 * Boolean followAcceptFlg = entity.getFollowAcceptFlg();
 * Boolean geolocationFlg = entity.getGeolocationFlg();
 * entity.setUserId(userId);
 * entity.setAccountId(accountId);
 * entity.setRegisterDatetime(registerDatetime);
 * entity.setPassword(password);
 * entity.setMailAddress(mailAddress);
 * entity.setFollowAcceptFlg(followAcceptFlg);
 * entity.setGeolocationFlg(geolocationFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _userId;

    /** ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)} */
    protected String _accountId;

    /** REGISTER_DATETIME: {NotNull, DATETIME(19)} */
    protected java.time.LocalDateTime _registerDatetime;

    /** PASSWORD: {NotNull, VARCHAR(30)} */
    protected String _password;

    /** MAIL_ADDRESS: {VARCHAR(100)} */
    protected String _mailAddress;

    /** FOLLOW_ACCEPT_FLG: {BIT} */
    protected Boolean _followAcceptFlg;

    /** GEOLOCATION_FLG: {BIT} */
    protected Boolean _geolocationFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param accountId : UQ, NotNull, VARCHAR(30). (NotNull)
     */
    public void uniqueBy(String accountId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("accountId");
        setAccountId(accountId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** LOGIN by USER_ID, named 'loginAsOne'. */
    protected OptionalEntity<Login> _loginAsOne;

    /**
     * [get] LOGIN by USER_ID, named 'loginAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'loginAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Login> getLoginAsOne() {
        if (_loginAsOne == null) { _loginAsOne = OptionalEntity.relationEmpty(this, "loginAsOne"); }
        return _loginAsOne;
    }

    /**
     * [set] LOGIN by USER_ID, named 'loginAsOne'.
     * @param loginAsOne The entity of foreign property(referrer-as-one) 'loginAsOne'. (NullAllowed)
     */
    public void setLoginAsOne(OptionalEntity<Login> loginAsOne) {
        _loginAsOne = loginAsOne;
    }

    /** MUTTER by USER_ID, named 'mutterAsOne'. */
    protected OptionalEntity<Mutter> _mutterAsOne;

    /**
     * [get] MUTTER by USER_ID, named 'mutterAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'mutterAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Mutter> getMutterAsOne() {
        if (_mutterAsOne == null) { _mutterAsOne = OptionalEntity.relationEmpty(this, "mutterAsOne"); }
        return _mutterAsOne;
    }

    /**
     * [set] MUTTER by USER_ID, named 'mutterAsOne'.
     * @param mutterAsOne The entity of foreign property(referrer-as-one) 'mutterAsOne'. (NullAllowed)
     */
    public void setMutterAsOne(OptionalEntity<Mutter> mutterAsOne) {
        _mutterAsOne = mutterAsOne;
    }

    /** RELATION by USER_ID, named 'relationAsOne'. */
    protected OptionalEntity<Relation> _relationAsOne;

    /**
     * [get] RELATION by USER_ID, named 'relationAsOne'.
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return the entity of foreign property(referrer-as-one) 'relationAsOne'. (NotNull, EmptyAllowed: when e.g. no data, no setupSelect)
     */
    public OptionalEntity<Relation> getRelationAsOne() {
        if (_relationAsOne == null) { _relationAsOne = OptionalEntity.relationEmpty(this, "relationAsOne"); }
        return _relationAsOne;
    }

    /**
     * [set] RELATION by USER_ID, named 'relationAsOne'.
     * @param relationAsOne The entity of foreign property(referrer-as-one) 'relationAsOne'. (NullAllowed)
     */
    public void setRelationAsOne(OptionalEntity<Relation> relationAsOne) {
        _relationAsOne = relationAsOne;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** GOOD by USER_ID, named 'goodList'. */
    protected List<Good> _goodList;

    /**
     * [get] GOOD by USER_ID, named 'goodList'.
     * @return The entity list of referrer property 'goodList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Good> getGoodList() {
        if (_goodList == null) { _goodList = newReferrerList(); }
        return _goodList;
    }

    /**
     * [set] GOOD by USER_ID, named 'goodList'.
     * @param goodList The entity list of referrer property 'goodList'. (NullAllowed)
     */
    public void setGoodList(List<Good> goodList) {
        _goodList = goodList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_loginAsOne != null && _loginAsOne.isPresent())
        { sb.append(li).append(xbRDS(_loginAsOne, "loginAsOne")); }
        if (_mutterAsOne != null && _mutterAsOne.isPresent())
        { sb.append(li).append(xbRDS(_mutterAsOne, "mutterAsOne")); }
        if (_relationAsOne != null && _relationAsOne.isPresent())
        { sb.append(li).append(xbRDS(_relationAsOne, "relationAsOne")); }
        if (_goodList != null) { for (Good et : _goodList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "goodList")); } } }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_accountId));
        sb.append(dm).append(xfND(_registerDatetime));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_mailAddress));
        sb.append(dm).append(xfND(_followAcceptFlg));
        sb.append(dm).append(xfND(_geolocationFlg));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_loginAsOne != null && _loginAsOne.isPresent())
        { sb.append(dm).append("loginAsOne"); }
        if (_mutterAsOne != null && _mutterAsOne.isPresent())
        { sb.append(dm).append("mutterAsOne"); }
        if (_relationAsOne != null && _relationAsOne.isPresent())
        { sb.append(dm).append("relationAsOne"); }
        if (_goodList != null && !_goodList.isEmpty())
        { sb.append(dm).append("goodList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ユーザーID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * ユーザーID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * アカウントID
     * @return The value of the column 'ACCOUNT_ID'. (basically NotNull if selected: for the constraint)
     */
    public String getAccountId() {
        checkSpecifiedProperty("accountId");
        return _accountId;
    }

    /**
     * [set] ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)} <br>
     * アカウントID
     * @param accountId The value of the column 'ACCOUNT_ID'. (basically NotNull if update: for the constraint)
     */
    public void setAccountId(String accountId) {
        registerModifiedProperty("accountId");
        _accountId = accountId;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, DATETIME(19)} <br>
     * 登録日時
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(30)} <br>
     * パスワード
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(30)} <br>
     * パスワード
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] MAIL_ADDRESS: {VARCHAR(100)} <br>
     * メールアドレス
     * @return The value of the column 'MAIL_ADDRESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getMailAddress() {
        checkSpecifiedProperty("mailAddress");
        return _mailAddress;
    }

    /**
     * [set] MAIL_ADDRESS: {VARCHAR(100)} <br>
     * メールアドレス
     * @param mailAddress The value of the column 'MAIL_ADDRESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setMailAddress(String mailAddress) {
        registerModifiedProperty("mailAddress");
        _mailAddress = mailAddress;
    }

    /**
     * [get] FOLLOW_ACCEPT_FLG: {BIT} <br>
     * フォロー承認設定
     * @return The value of the column 'FOLLOW_ACCEPT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getFollowAcceptFlg() {
        checkSpecifiedProperty("followAcceptFlg");
        return _followAcceptFlg;
    }

    /**
     * [set] FOLLOW_ACCEPT_FLG: {BIT} <br>
     * フォロー承認設定
     * @param followAcceptFlg The value of the column 'FOLLOW_ACCEPT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFollowAcceptFlg(Boolean followAcceptFlg) {
        registerModifiedProperty("followAcceptFlg");
        _followAcceptFlg = followAcceptFlg;
    }

    /**
     * [get] GEOLOCATION_FLG: {BIT} <br>
     * 位置情報設定
     * @return The value of the column 'GEOLOCATION_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getGeolocationFlg() {
        checkSpecifiedProperty("geolocationFlg");
        return _geolocationFlg;
    }

    /**
     * [set] GEOLOCATION_FLG: {BIT} <br>
     * 位置情報設定
     * @param geolocationFlg The value of the column 'GEOLOCATION_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGeolocationFlg(Boolean geolocationFlg) {
        registerModifiedProperty("geolocationFlg");
        _geolocationFlg = geolocationFlg;
    }
}
