package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wy extends org.telegram.ui.ActionBar.o2 {
    public long f43428a;
    public TLRPC.Chat f43429b;
    public boolean f43430c;
    public boolean d;
    public ty e;
    public ai.r5 f43431f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.o2 o2Var : getParentLayout().getFragmentStack()) {
                if (o2Var instanceof ey) {
                    yw ywVar = ((ey) o2Var).G3;
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
        this.actionBar.setActionBarMenuOnItemClick(new ea(this, 24));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? i71Var = new org.telegram.ui.Components.i71(this, new f5(this, 13), new xt(this, 6), null);
        this.e = i71Var;
        i71Var.t1();
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, this.e, this.resourceProvider);
        frameLayout.addView(this.e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f43429b = getMessagesController().getChat(Long.valueOf(-this.f43428a));
        return super.onFragmentCreate();
    }
}
