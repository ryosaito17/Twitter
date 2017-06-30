package com.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.twitter.dbflute.exbhv.*;
import com.twitter.dbflute.exentity.*;

/**
 * The referrer loader of MUTTER as TABLE. <br>
 * <pre>
 * [primary key]
 *     MUTTER_ID
 *
 * [column]
 *     MUTTER_ID, USER_ID, MUTTER_DATETIME, MUTTER_TEXT, MUTTER_IMAGE, MUTTER_LATITUDE, MUTTER_LONGITUDE, EDIT_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MUTTER_ID
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
public class LoaderOfMutter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Mutter> _selectedList;
    protected BehaviorSelector _selector;
    protected MutterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMutter ready(List<Mutter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MutterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MutterBhv.class); return _myBhv; } }

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
    public List<Mutter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
