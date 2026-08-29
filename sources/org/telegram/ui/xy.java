package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class xy extends org.telegram.ui.ActionBar.o2 {
    public long f44671a;
    public TLRPC.Chat f44672b;
    public boolean f44673c;
    public boolean d;
    public uy f44674e;
    public bh.v f44675f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
                if (o2Var instanceof fy) {
                    ax axVar = ((fy) o2Var).B3;
                    if (axVar.c()) {
                        axVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.m51(this, 8));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? u51Var = new org.telegram.ui.Components.u51(this, new b5(this, 13), new xt(this, 6), null);
        this.f44674e = u51Var;
        u51Var.p1();
        this.f44674e.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, this.resourceProvider));
        frameLayout.addView(this.f44674e, i7.f6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f44674e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44672b = getMessagesController().getChat(Long.valueOf(-this.f44671a));
        return super.onFragmentCreate();
    }
}
