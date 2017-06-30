package com.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.twitter.dbflute.exbhv.*;
import com.twitter.dbflute.exentity.*;

/**
 * The referrer loader of LOGIN as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfLogin {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Login> _selectedList;
    protected BehaviorSelector _selector;
    protected LoginBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfLogin ready(List<Login> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected LoginBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(LoginBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Login> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
