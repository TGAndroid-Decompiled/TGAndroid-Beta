package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rx extends org.telegram.ui.ActionBar.h2 {
    public long f51811a;
    public TLRPC.Chat f51812b;
    public boolean f51813c;
    public boolean d;
    public boolean f51814e;
    public bi.g7 f51815f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743744, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.g7 g7Var = new bi.g7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51815f = g7Var;
        g7Var.r1();
        this.f51815f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51815f, c8.ma.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f51815f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51812b = getMessagesController().O0(Long.valueOf(-this.f51811a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
