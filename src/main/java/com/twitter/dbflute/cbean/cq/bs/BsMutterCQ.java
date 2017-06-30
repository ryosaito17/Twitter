package com.twitter.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.twitter.dbflute.cbean.cq.ciq.*;
import com.twitter.dbflute.cbean.*;
import com.twitter.dbflute.cbean.cq.*;

/**
 * The base condition-query of MUTTER.
 * @author DBFlute(AutoGenerator)
 */
public class BsMutterCQ extends AbstractBsMutterCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MutterCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMutterCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from MUTTER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public MutterCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected MutterCIQ xcreateCIQ() {
        MutterCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected MutterCIQ xnewCIQ() {
        return new MutterCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join MUTTER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public MutterCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        MutterCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _mutterId;
    public ConditionValue xdfgetMutterId()
    { if (_mutterId == null) { _mutterId = nCV(); }
      return _mutterId; }
    protected ConditionValue xgetCValueMutterId() { return xdfgetMutterId(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterId_Asc() { regOBA("MUTTER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterId_Desc() { regOBD("MUTTER_ID"); return this; }

    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _mutterDatetime;
    public ConditionValue xdfgetMutterDatetime()
    { if (_mutterDatetime == null) { _mutterDatetime = nCV(); }
      return _mutterDatetime; }
    protected ConditionValue xgetCValueMutterDatetime() { return xdfgetMutterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterDatetime_Asc() { regOBA("MUTTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterDatetime_Desc() { regOBD("MUTTER_DATETIME"); return this; }

    protected ConditionValue _mutterText;
    public ConditionValue xdfgetMutterText()
    { if (_mutterText == null) { _mutterText = nCV(); }
      return _mutterText; }
    protected ConditionValue xgetCValueMutterText() { return xdfgetMutterText(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterText_Asc() { regOBA("MUTTER_TEXT"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_TEXT: {NotNull, TEXT(65535)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterText_Desc() { regOBD("MUTTER_TEXT"); return this; }

    protected ConditionValue _mutterImage;
    public ConditionValue xdfgetMutterImage()
    { if (_mutterImage == null) { _mutterImage = nCV(); }
      return _mutterImage; }
    protected ConditionValue xgetCValueMutterImage() { return xdfgetMutterImage(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_IMAGE: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterImage_Asc() { regOBA("MUTTER_IMAGE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_IMAGE: {BLOB(65535)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterImage_Desc() { regOBD("MUTTER_IMAGE"); return this; }

    protected ConditionValue _mutterLatitude;
    public ConditionValue xdfgetMutterLatitude()
    { if (_mutterLatitude == null) { _mutterLatitude = nCV(); }
      return _mutterLatitude; }
    protected ConditionValue xgetCValueMutterLatitude() { return xdfgetMutterLatitude(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterLatitude_Asc() { regOBA("MUTTER_LATITUDE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_LATITUDE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterLatitude_Desc() { regOBD("MUTTER_LATITUDE"); return this; }

    protected ConditionValue _mutterLongitude;
    public ConditionValue xdfgetMutterLongitude()
    { if (_mutterLongitude == null) { _mutterLongitude = nCV(); }
      return _mutterLongitude; }
    protected ConditionValue xgetCValueMutterLongitude() { return xdfgetMutterLongitude(); }

    /** 
     * Add order-by as ascend. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterLongitude_Asc() { regOBA("MUTTER_LONGITUDE"); return this; }

    /**
     * Add order-by as descend. <br>
     * MUTTER_LONGITUDE: {DOUBLE(22)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_MutterLongitude_Desc() { regOBD("MUTTER_LONGITUDE"); return this; }

    protected ConditionValue _editDatetime;
    public ConditionValue xdfgetEditDatetime()
    { if (_editDatetime == null) { _editDatetime = nCV(); }
      return _editDatetime; }
    protected ConditionValue xgetCValueEditDatetime() { return xdfgetEditDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_EditDatetime_Asc() { regOBA("EDIT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * EDIT_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsMutterCQ addOrderBy_EditDatetime_Desc() { regOBD("EDIT_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMutterCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsMutterCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        MutterCQ bq = (MutterCQ)bqs;
        MutterCQ uq = (MutterCQ)uqs;
        if (bq.hasConditionQueryUser()) {
            uq.queryUser().reflectRelationOnUnionQuery(bq.queryUser(), uq.queryUser());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my USER_ID, named 'user'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUser() {
        return xdfgetConditionQueryUser();
    }
    public UserCQ xdfgetConditionQueryUser() {
        String prop = "user";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUser()); xsetupOuterJoinUser(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUser() {
        String nrp = xresolveNRP("MUTTER", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "user", nrp);
    }
    protected void xsetupOuterJoinUser() { xregOutJo("user"); }
    public boolean hasConditionQueryUser() { return xhasQueRlMap("user"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, MutterCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(MutterCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, MutterCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(MutterCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, MutterCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(MutterCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, MutterCQ> _myselfExistsMap;
    public Map<String, MutterCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(MutterCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, MutterCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(MutterCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return MutterCB.class.getName(); }
    protected String xCQ() { return MutterCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
