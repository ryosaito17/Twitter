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
 * The entity of GOOD as TABLE. <br>
 * いいね
 * <pre>
 * [primary-key]
 *     GOOD_ID
 * 
 * [column]
 *     GOOD_ID, USER_ID, MUTTER_ID, GOOD_FLG
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     GOOD_ID
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
 * Long goodId = entity.getGoodId();
 * Long userId = entity.getUserId();
 * Long mutterId = entity.getMutterId();
 * Boolean goodFlg = entity.getGoodFlg();
 * entity.setGoodId(goodId);
 * entity.setUserId(userId);
 * entity.setMutterId(mutterId);
 * entity.setGoodFlg(goodFlg);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsGood extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** GOOD_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _goodId;

    /** USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** MUTTER_ID: {UQ+, NotNull, BIGINT(19)} */
    protected Long _mutterId;

    /** GOOD_FLG: {BIT} */
    protected Boolean _goodFlg;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "GOOD";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_goodId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param mutterId : UQ+, NotNull, BIGINT(19). (NotNull)
     * @param userId : +UQ, IX, NotNull, BIGINT(19), FK to USER. (NotNull)
     */
    public void uniqueBy(Long mutterId, Long userId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("mutterId");
        __uniqueDrivenProperties.addPropertyName("userId");
        setMutterId(mutterId);setUserId(userId);
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
        if (obj instanceof BsGood) {
            BsGood other = (BsGood)obj;
            if (!xSV(_goodId, other._goodId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _goodId);
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
        sb.append(dm).append(xfND(_goodId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_mutterId));
        sb.append(dm).append(xfND(_goodFlg));
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
    public Good clone() {
        return (Good)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] GOOD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * いいねID
     * @return The value of the column 'GOOD_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getGoodId() {
        checkSpecifiedProperty("goodId");
        return _goodId;
    }

    /**
     * [set] GOOD_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * いいねID
     * @param goodId The value of the column 'GOOD_ID'. (basically NotNull if update: for the constraint)
     */
    public void setGoodId(Long goodId) {
        registerModifiedProperty("goodId");
        _goodId = goodId;
    }

    /**
     * [get] USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * いいね会員ID : いいねをした会員のID
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * いいね会員ID : いいねをした会員のID
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] MUTTER_ID: {UQ+, NotNull, BIGINT(19)} <br>
     * つぶやきID : いいねをした対象のつぶやきのID
     * @return The value of the column 'MUTTER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getMutterId() {
        checkSpecifiedProperty("mutterId");
        return _mutterId;
    }

    /**
     * [set] MUTTER_ID: {UQ+, NotNull, BIGINT(19)} <br>
     * つぶやきID : いいねをした対象のつぶやきのID
     * @param mutterId The value of the column 'MUTTER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setMutterId(Long mutterId) {
        registerModifiedProperty("mutterId");
        _mutterId = mutterId;
    }

    /**
     * [get] GOOD_FLG: {BIT} <br>
     * いいね有無 : trueの場合はいいねをしている状態。<br>
     * nullもしくはfalseの場合はいいねをしていない状態。
     * @return The value of the column 'GOOD_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public Boolean getGoodFlg() {
        checkSpecifiedProperty("goodFlg");
        return _goodFlg;
    }

    /**
     * [set] GOOD_FLG: {BIT} <br>
     * いいね有無 : trueの場合はいいねをしている状態。<br>
     * nullもしくはfalseの場合はいいねをしていない状態。
     * @param goodFlg The value of the column 'GOOD_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setGoodFlg(Boolean goodFlg) {
        registerModifiedProperty("goodFlg");
        _goodFlg = goodFlg;
    }
}
