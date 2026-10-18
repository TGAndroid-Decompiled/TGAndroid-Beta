package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wy extends org.telegram.ui.ActionBar.n2 {
    public long f42936a;
    public TLRPC.Chat f42937b;
    public boolean f42938c;
    public boolean d;
    public ty e;
    public ai.q5 f42939f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof ey) {
                    yw ywVar = ((ey) n2Var).G3;
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
        this.actionBar.setActionBarMenuOnItemClick(new ga(this, 24));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? a71Var = new org.telegram.ui.Components.a71(this, new g5(this, 13), new wt(this, 6), null);
        this.e = a71Var;
        a71Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20928a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42937b = getMessagesController().getChat(Long.valueOf(-this.f42936a));
        return super.onFragmentCreate();
    }
}
