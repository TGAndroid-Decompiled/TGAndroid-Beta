package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wy extends org.telegram.ui.ActionBar.r2 {
    public long f45424a;
    public TLRPC.Chat f45425b;
    public boolean f45426c;
    public boolean d;
    public ty e;
    public bi.m5 f45427f;

    public final void V() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.r2 r2Var : getParentLayout().getFragmentStack()) {
                if (r2Var instanceof ey) {
                    vw vwVar = ((ey) r2Var).G3;
                    if (vwVar.c()) {
                        vwVar.a();
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
        ?? s71Var = new org.telegram.ui.Components.s71(this, new e5(this, 13), new st(this, 8), null);
        this.e = s71Var;
        s71Var.u1();
        this.e.setSectionsDrawBackground(true);
        frameLayout.addView(this.e, org.telegram.ui.Components.kb1.i(-1, -1, 119));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.e;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f45425b = getMessagesController().getChat(Long.valueOf(-this.f45424a));
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
