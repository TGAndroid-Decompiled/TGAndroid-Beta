package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qz extends org.telegram.ui.ActionBar.m2 {
    public long f39241a;
    public TLRPC.Chat f39242b;
    public boolean f39243c;
    public boolean d;
    public nz e;
    public bi.f0 f39244f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.m2 m2Var : getParentLayout().getFragmentStack()) {
                if (m2Var instanceof yy) {
                    sx sxVar = ((yy) m2Var).G3;
                    if (sxVar.c()) {
                        sxVar.a();
                    }
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new nb(this, 23));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        ?? i71Var = new org.telegram.ui.Components.i71(this, new f5(this, 13), new mu(this, 6), null);
        this.e = i71Var;
        i71Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19543a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39242b = getMessagesController().getChat(Long.valueOf(-this.f39241a));
        return super.onFragmentCreate();
    }
}
