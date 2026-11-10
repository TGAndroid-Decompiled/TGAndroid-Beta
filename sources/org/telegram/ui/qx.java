package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class qx extends org.telegram.ui.ActionBar.f2 {
    public long f49169a;
    public TLRPC.Chat f49170b;
    public boolean f49171c;
    public boolean d;
    public boolean f49172e;
    public nx f49173f;
    public di.b0 h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 29));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131743981, null));
        FrameLayout frameLayout = new FrameLayout(context);
        nx nxVar = new nx(this, new a5(this, 13), new zr(this, 9), null, 0);
        this.f49173f = nxVar;
        nxVar.r1();
        this.f49173f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f49173f, c8.ha.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f49173f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f49170b = getMessagesController().M0(Long.valueOf(-this.f49169a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
