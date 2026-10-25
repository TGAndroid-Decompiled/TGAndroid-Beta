package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uy extends org.telegram.ui.ActionBar.r2 {
    public long f44545a;
    public TLRPC.Chat f44546b;
    public boolean f44547c;
    public boolean d;
    public ry e;
    public bi.m5 f44548f;

    public final void V() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.r2 r2Var : getParentLayout().getFragmentStack()) {
                if (r2Var instanceof cy) {
                    tw twVar = ((cy) r2Var).G3;
                    if (twVar.c()) {
                        twVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ga(this, 26));
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? r71Var = new org.telegram.ui.Components.r71(this, new e5(this, 13), new qt(this, 8), null);
        this.e = r71Var;
        r71Var.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44546b = getMessagesController().getChat(Long.valueOf(-this.f44545a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
