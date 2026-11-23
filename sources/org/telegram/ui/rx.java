package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rx extends org.telegram.ui.ActionBar.g2 {
    public long f51779a;
    public TLRPC.Chat f51780b;
    public boolean f51781c;
    public boolean d;
    public boolean f51782e;
    public bi.i7 f51783f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131743736, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.i7 i7Var = new bi.i7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51783f = i7Var;
        i7Var.r1();
        this.f51783f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51783f, c8.ma.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51783f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51780b = getMessagesController().O0(Long.valueOf(-this.f51779a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
