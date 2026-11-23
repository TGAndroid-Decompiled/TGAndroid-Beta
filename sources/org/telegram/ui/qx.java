package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class qx extends org.telegram.ui.ActionBar.g2 {
    public long f51550a;
    public TLRPC.Chat f51551b;
    public boolean f51552c;
    public boolean d;
    public boolean f51553e;
    public bi.l7 f51554f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131743734, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.l7 l7Var = new bi.l7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51554f = l7Var;
        l7Var.r1();
        this.f51554f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51554f, c8.na.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51554f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51551b = getMessagesController().O0(Long.valueOf(-this.f51550a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
