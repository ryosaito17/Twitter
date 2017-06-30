package com.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.twitter.dbflute.exbhv.*;
import com.twitter.dbflute.exentity.*;
import com.twitter.dbflute.cbean.*;

/**
 * The referrer loader of USER as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Good> _referrerGood;

    /**
     * Load referrer of goodList by the set-upper of referrer. <br>
     * GOOD by USER_ID, named 'goodList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadGood</span>(<span style="color: #553000">goodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">goodCB</span>.setupSelect...
     *         <span style="color: #553000">goodCB</span>.query().set...
     *         <span style="color: #553000">goodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">goodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    goodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getGoodList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfGood> loadGood(ReferrerConditionSetupper<GoodCB> refCBLambda) {
        myBhv().loadGood(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerGood = refLs);
        return hd -> hd.handle(new LoaderOfGood().ready(_referrerGood, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfLogin _foreignLoginAsOneLoader;
    public LoaderOfLogin pulloutLoginAsOne() {
        if (_foreignLoginAsOneLoader == null)
        { _foreignLoginAsOneLoader = new LoaderOfLogin().ready(myBhv().pulloutLoginAsOne(_selectedList), _selector); }
        return _foreignLoginAsOneLoader;
    }

    protected LoaderOfMutter _foreignMutterAsOneLoader;
    public LoaderOfMutter pulloutMutterAsOne() {
        if (_foreignMutterAsOneLoader == null)
        { _foreignMutterAsOneLoader = new LoaderOfMutter().ready(myBhv().pulloutMutterAsOne(_selectedList), _selector); }
        return _foreignMutterAsOneLoader;
    }

    protected LoaderOfRelation _foreignRelationAsOneLoader;
    public LoaderOfRelation pulloutRelationAsOne() {
        if (_foreignRelationAsOneLoader == null)
        { _foreignRelationAsOneLoader = new LoaderOfRelation().ready(myBhv().pulloutRelationAsOne(_selectedList), _selector); }
        return _foreignRelationAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
