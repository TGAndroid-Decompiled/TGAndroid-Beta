package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rx extends org.telegram.ui.ActionBar.g2 {
    public long f51775a;
    public TLRPC.Chat f51776b;
    public boolean f51777c;
    public boolean d;
    public boolean f51778e;
    public bi.j7 f51779f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131743738, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.j7 j7Var = new bi.j7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51779f = j7Var;
        j7Var.r1();
        this.f51779f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51779f, c8.ma.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51779f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51776b = getMessagesController().O0(Long.valueOf(-this.f51775a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
