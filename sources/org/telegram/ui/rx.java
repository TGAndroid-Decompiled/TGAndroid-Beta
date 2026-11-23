package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class rx extends org.telegram.ui.ActionBar.g2 {
    public long f51813a;
    public TLRPC.Chat f51814b;
    public boolean f51815c;
    public boolean d;
    public boolean f51816e;
    public bi.l7 f51817f;
    public fi.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 2));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131743738, null));
        FrameLayout frameLayout = new FrameLayout(context);
        bi.l7 l7Var = new bi.l7(this, new a5(this, 13), new zr(this, 9), null, 7);
        this.f51817f = l7Var;
        l7Var.r1();
        this.f51817f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f51817f, c8.na.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f51817f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51814b = getMessagesController().O0(Long.valueOf(-this.f51813a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
