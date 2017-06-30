package com.twitter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.twitter.dbflute.exbhv.*;
import com.twitter.dbflute.exentity.*;

/**
 * The referrer loader of RELATION as TABLE. <br>
 * <pre>
 * [primary key]
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
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfRelation {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Relation> _selectedList;
    protected BehaviorSelector _selector;
    protected RelationBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfRelation ready(List<Relation> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected RelationBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(RelationBhv.class); return _myBhv; } }

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
    public List<Relation> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
