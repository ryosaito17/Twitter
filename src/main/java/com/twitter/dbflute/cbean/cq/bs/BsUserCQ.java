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
 * The base condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, GoodCQ> xdfgetUserId_ExistsReferrer_GoodList() { return xgetSQueMap("userId_ExistsReferrer_GoodList"); }
    public String keepUserId_ExistsReferrer_GoodList(GoodCQ sq) { return xkeepSQue("userId_ExistsReferrer_GoodList", sq); }

    public Map<String, GoodCQ> xdfgetUserId_NotExistsReferrer_GoodList() { return xgetSQueMap("userId_NotExistsReferrer_GoodList"); }
    public String keepUserId_NotExistsReferrer_GoodList(GoodCQ sq) { return xkeepSQue("userId_NotExistsReferrer_GoodList", sq); }

    public Map<String, GoodCQ> xdfgetUserId_SpecifyDerivedReferrer_GoodList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_GoodList"); }
    public String keepUserId_SpecifyDerivedReferrer_GoodList(GoodCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_GoodList", sq); }

    public Map<String, GoodCQ> xdfgetUserId_QueryDerivedReferrer_GoodList() { return xgetSQueMap("userId_QueryDerivedReferrer_GoodList"); }
    public String keepUserId_QueryDerivedReferrer_GoodList(GoodCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_GoodList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_GoodListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_GoodList"); }
    public String keepUserId_QueryDerivedReferrer_GoodListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_GoodList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _accountId;
    public ConditionValue xdfgetAccountId()
    { if (_accountId == null) { _accountId = nCV(); }
      return _accountId; }
    protected ConditionValue xgetCValueAccountId() { return xdfgetAccountId(); }

    /** 
     * Add order-by as ascend. <br>
     * ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_AccountId_Asc() { regOBA("ACCOUNT_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * ACCOUNT_ID: {UQ, NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_AccountId_Desc() { regOBD("ACCOUNT_ID"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(30)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _mailAddress;
    public ConditionValue xdfgetMailAddress()
    { if (_mailAddress == null) { _mailAddress = nCV(); }
      return _mailAddress; }
    protected ConditionValue xgetCValueMailAddress() { return xdfgetMailAddress(); }

    /** 
     * Add order-by as ascend. <br>
     * MAIL_ADDRESS: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Asc() { regOBA("MAIL_ADDRESS"); return this; }

    /**
     * Add order-by as descend. <br>
     * MAIL_ADDRESS: {VARCHAR(100)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_MailAddress_Desc() { regOBD("MAIL_ADDRESS"); return this; }

    protected ConditionValue _followAcceptFlg;
    public ConditionValue xdfgetFollowAcceptFlg()
    { if (_followAcceptFlg == null) { _followAcceptFlg = nCV(); }
      return _followAcceptFlg; }
    protected ConditionValue xgetCValueFollowAcceptFlg() { return xdfgetFollowAcceptFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * FOLLOW_ACCEPT_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_FollowAcceptFlg_Asc() { regOBA("FOLLOW_ACCEPT_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOW_ACCEPT_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_FollowAcceptFlg_Desc() { regOBD("FOLLOW_ACCEPT_FLG"); return this; }

    protected ConditionValue _geolocationFlg;
    public ConditionValue xdfgetGeolocationFlg()
    { if (_geolocationFlg == null) { _geolocationFlg = nCV(); }
      return _geolocationFlg; }
    protected ConditionValue xgetCValueGeolocationFlg() { return xdfgetGeolocationFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * GEOLOCATION_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_GeolocationFlg_Asc() { regOBA("GEOLOCATION_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * GEOLOCATION_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_GeolocationFlg_Desc() { regOBD("GEOLOCATION_FLG"); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserCQ bq = (UserCQ)bqs;
        UserCQ uq = (UserCQ)uqs;
        if (bq.hasConditionQueryLoginAsOne()) {
            uq.queryLoginAsOne().reflectRelationOnUnionQuery(bq.queryLoginAsOne(), uq.queryLoginAsOne());
        }
        if (bq.hasConditionQueryMutterAsOne()) {
            uq.queryMutterAsOne().reflectRelationOnUnionQuery(bq.queryMutterAsOne(), uq.queryMutterAsOne());
        }
        if (bq.hasConditionQueryRelationAsOne()) {
            uq.queryRelationAsOne().reflectRelationOnUnionQuery(bq.queryRelationAsOne(), uq.queryRelationAsOne());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * LOGIN by USER_ID, named 'loginAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public LoginCQ queryLoginAsOne() { return xdfgetConditionQueryLoginAsOne(); }
    public LoginCQ xdfgetConditionQueryLoginAsOne() {
        String prop = "loginAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryLoginAsOne()); xsetupOuterJoinLoginAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected LoginCQ xcreateQueryLoginAsOne() {
        String nrp = xresolveNRP("USER", "loginAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new LoginCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "loginAsOne", nrp);
    }
    protected void xsetupOuterJoinLoginAsOne() { xregOutJo("loginAsOne"); }
    public boolean hasConditionQueryLoginAsOne() { return xhasQueRlMap("loginAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * MUTTER by USER_ID, named 'mutterAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public MutterCQ queryMutterAsOne() { return xdfgetConditionQueryMutterAsOne(); }
    public MutterCQ xdfgetConditionQueryMutterAsOne() {
        String prop = "mutterAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryMutterAsOne()); xsetupOuterJoinMutterAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected MutterCQ xcreateQueryMutterAsOne() {
        String nrp = xresolveNRP("USER", "mutterAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new MutterCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "mutterAsOne", nrp);
    }
    protected void xsetupOuterJoinMutterAsOne() { xregOutJo("mutterAsOne"); }
    public boolean hasConditionQueryMutterAsOne() { return xhasQueRlMap("mutterAsOne"); }

    /**
     * Get the condition-query for relation table. <br>
     * RELATION by USER_ID, named 'relationAsOne'.
     * @return The instance of condition-query. (NotNull)
     */
    public RelationCQ queryRelationAsOne() { return xdfgetConditionQueryRelationAsOne(); }
    public RelationCQ xdfgetConditionQueryRelationAsOne() {
        String prop = "relationAsOne";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryRelationAsOne()); xsetupOuterJoinRelationAsOne(); }
        return xgetQueRlMap(prop);
    }
    protected RelationCQ xcreateQueryRelationAsOne() {
        String nrp = xresolveNRP("USER", "relationAsOne"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new RelationCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "relationAsOne", nrp);
    }
    protected void xsetupOuterJoinRelationAsOne() { xregOutJo("relationAsOne"); }
    public boolean hasConditionQueryRelationAsOne() { return xhasQueRlMap("relationAsOne"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
