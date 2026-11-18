package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rx extends org.telegram.ui.ActionBar.h2 {
    public long f51800a;
    public TLRPC.Chat f51801b;
    public boolean f51802c;
    public boolean d;
    public boolean f51803e;
    public bi.f7 f51804f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131743744, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.f7 f7Var = new bi.f7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51804f = f7Var;
        f7Var.r1();
        this.f51804f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51804f, c8.ma.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f51804f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51801b = getMessagesController().O0(Long.valueOf(-this.f51800a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
