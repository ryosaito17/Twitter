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
 * The entity of RELATION as TABLE. <br>
 * フォロー関係
 * <pre>
 * [primary-key]
 *     RELATION_ID
 * 
 * [column]
 *     RELATION_ID, USER_ID, FOLLOW_USER_ID, FOLLOW_APPROVAL_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     RELATION_ID
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
 * Long relationId = entity.getRelationId();
 * Long userId = entity.getUserId();
 * Long followUserId = entity.getFollowUserId();
 * java.time.LocalDateTime followApprovalDatetime = entity.getFollowApprovalDatetime();
 * entity.setRelationId(relationId);
 * entity.setUserId(userId);
 * entity.setFollowUserId(followUserId);
 * entity.setFollowApprovalDatetime(followApprovalDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsRelation extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RELATION_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _relationId;

    /** USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** FOLLOW_USER_ID: {NotNull, BIGINT(19)} */
    protected Long _followUserId;

    /** FOLLOW_APPROVAL_DATETIME: {DATETIME(19)} */
    protected java.time.LocalDateTime _followApprovalDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "RELATION";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_relationId == null) { return false; }
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
        if (obj instanceof BsRelation) {
            BsRelation other = (BsRelation)obj;
            if (!xSV(_relationId, other._relationId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _relationId);
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
        sb.append(dm).append(xfND(_relationId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_followUserId));
        sb.append(dm).append(xfND(_followApprovalDatetime));
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
    public Relation clone() {
        return (Relation)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RELATION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * フォロー関係ID
     * @return The value of the column 'RELATION_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getRelationId() {
        checkSpecifiedProperty("relationId");
        return _relationId;
    }

    /**
     * [set] RELATION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * フォロー関係ID
     * @param relationId The value of the column 'RELATION_ID'. (basically NotNull if update: for the constraint)
     */
    public void setRelationId(Long relationId) {
        registerModifiedProperty("relationId");
        _relationId = relationId;
    }

    /**
     * [get] USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : ユーザーのID。連番で一意なデータ。
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {UQ, NotNull, BIGINT(19), FK to USER} <br>
     * 会員ID : ユーザーのID。連番で一意なデータ。
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] FOLLOW_USER_ID: {NotNull, BIGINT(19)} <br>
     * フォロー会員ID : フォローしている会員のID。<br>
     * フォローしている会員がいない場合にはnullになる。
     * @return The value of the column 'FOLLOW_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFollowUserId() {
        checkSpecifiedProperty("followUserId");
        return _followUserId;
    }

    /**
     * [set] FOLLOW_USER_ID: {NotNull, BIGINT(19)} <br>
     * フォロー会員ID : フォローしている会員のID。<br>
     * フォローしている会員がいない場合にはnullになる。
     * @param followUserId The value of the column 'FOLLOW_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowUserId(Long followUserId) {
        registerModifiedProperty("followUserId");
        _followUserId = followUserId;
    }

    /**
     * [get] FOLLOW_APPROVAL_DATETIME: {DATETIME(19)} <br>
     * フォロー承認日時 : フォローを承認された日時。<br>
     * 初期値はnullで、ここが設定されていればフォローが承認されていることを意味する。<br>
     * ブロックされると、ここが再度nullになる。
     * @return The value of the column 'FOLLOW_APPROVAL_DATETIME'. (NullAllowed even if selected: for no constraint)
     */
    public java.time.LocalDateTime getFollowApprovalDatetime() {
        checkSpecifiedProperty("followApprovalDatetime");
        return _followApprovalDatetime;
    }

    /**
     * [set] FOLLOW_APPROVAL_DATETIME: {DATETIME(19)} <br>
     * フォロー承認日時 : フォローを承認された日時。<br>
     * 初期値はnullで、ここが設定されていればフォローが承認されていることを意味する。<br>
     * ブロックされると、ここが再度nullになる。
     * @param followApprovalDatetime The value of the column 'FOLLOW_APPROVAL_DATETIME'. (NullAllowed: null update allowed for no constraint)
     */
    public void setFollowApprovalDatetime(java.time.LocalDateTime followApprovalDatetime) {
        registerModifiedProperty("followApprovalDatetime");
        _followApprovalDatetime = followApprovalDatetime;
    }
}
