package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class qy extends org.telegram.ui.ActionBar.k2 {
    public long f41086a;
    public TLRPC.Chat f41087b;
    public boolean f41088c;
    public boolean d;
    public boolean e;
    public ny f41089f;
    public jo h;

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 20));
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131744006, null));
        FrameLayout frameLayout = new FrameLayout(context);
        ny nyVar = new ny(this, new z4(this, 13), new tt(this, 8), null, 0);
        this.f41089f = nyVar;
        nyVar.r1();
        this.f41089f.setSectionsDrawBackground(true);
        frameLayout.addView(this.f41089f, w7.b6.e(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f41089f;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f41087b = getMessagesController().L0(Long.valueOf(-this.f41086a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
