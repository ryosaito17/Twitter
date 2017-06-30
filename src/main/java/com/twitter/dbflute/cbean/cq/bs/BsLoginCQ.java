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
 * The base condition-query of LOGIN.
 * @author DBFlute(AutoGenerator)
 */
public class BsLoginCQ extends AbstractBsLoginCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected LoginCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsLoginCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from LOGIN) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public LoginCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected LoginCIQ xcreateCIQ() {
        LoginCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected LoginCIQ xnewCIQ() {
        return new LoginCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join LOGIN on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public LoginCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        LoginCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _loginFlg;
    public ConditionValue xdfgetLoginFlg()
    { if (_loginFlg == null) { _loginFlg = nCV(); }
      return _loginFlg; }
    protected ConditionValue xgetCValueLoginFlg() { return xdfgetLoginFlg(); }

    /** 
     * Add order-by as ascend. <br>
     * LOGIN_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LoginFlg_Asc() { regOBA("LOGIN_FLG"); return this; }

    /**
     * Add order-by as descend. <br>
     * LOGIN_FLG: {BIT}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LoginFlg_Desc() { regOBD("LOGIN_FLG"); return this; }

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
    public BsLoginCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {UQ, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _lastLoginDatetime;
    public ConditionValue xdfgetLastLoginDatetime()
    { if (_lastLoginDatetime == null) { _lastLoginDatetime = nCV(); }
      return _lastLoginDatetime; }
    protected ConditionValue xgetCValueLastLoginDatetime() { return xdfgetLastLoginDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * LAST_LOGIN_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LastLoginDatetime_Asc() { regOBA("LAST_LOGIN_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_LOGIN_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LastLoginDatetime_Desc() { regOBD("LAST_LOGIN_DATETIME"); return this; }

    protected ConditionValue _lastLogoutDatetime;
    public ConditionValue xdfgetLastLogoutDatetime()
    { if (_lastLogoutDatetime == null) { _lastLogoutDatetime = nCV(); }
      return _lastLogoutDatetime; }
    protected ConditionValue xgetCValueLastLogoutDatetime() { return xdfgetLastLogoutDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * LAST_LOGOUT_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LastLogoutDatetime_Asc() { regOBA("LAST_LOGOUT_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * LAST_LOGOUT_DATETIME: {DATETIME(19)}
     * @return this. (NotNull)
     */
    public BsLoginCQ addOrderBy_LastLogoutDatetime_Desc() { regOBD("LAST_LOGOUT_DATETIME"); return this; }

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
    public BsLoginCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsLoginCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        LoginCQ bq = (LoginCQ)bqs;
        LoginCQ uq = (LoginCQ)uqs;
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
        String nrp = xresolveNRP("LOGIN", "user"); String jan = xresolveJAN(nrp, xgetNNLvl());
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
    public Map<String, LoginCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(LoginCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return LoginCB.class.getName(); }
    protected String xCQ() { return LoginCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
