package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vy extends org.telegram.ui.ActionBar.o2 {
    public long f43607a;
    public TLRPC.Chat f43608b;
    public boolean f43609c;
    public boolean d;
    public sy f43610e;
    public bg.y0 f43611f;

    public final void T() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
                if (o2Var instanceof dy) {
                    yw ywVar = ((dy) o2Var).B3;
                    if (ywVar.c()) {
                        ywVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new tq(this, 16));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 13), new wt(this, 6), null);
        this.f43610e = i51Var;
        i51Var.p1();
        this.f43610e.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, this.resourceProvider));
        frameLayout.addView(this.f43610e, g7.e6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f43610e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43608b = getMessagesController().getChat(Long.valueOf(-this.f43607a));
        return super.onFragmentCreate();
    }
}
