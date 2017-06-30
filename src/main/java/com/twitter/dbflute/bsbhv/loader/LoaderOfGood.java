package com.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.twitter.dbflute.exbhv.*;
import com.twitter.dbflute.exentity.*;

/**
 * The referrer loader of GOOD as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfGood {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Good> _selectedList;
    protected BehaviorSelector _selector;
    protected GoodBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfGood ready(List<Good> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected GoodBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(GoodBhv.class); return _myBhv; } }

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
    public List<Good> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
