package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class yy extends org.telegram.ui.ActionBar.n2 {

    public long f44964a;

    public TLRPC.Chat f44965b;

    public boolean f44966c;
    public boolean d;

    public vy f44967e;

    public cg.u0 f44968f;

    public final void U() {
        if (!this.d || getParentLayout() == null) {
            return;
        }
        for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
            if (n2Var instanceof gy) {
                bx bxVar = ((gy) n2Var).B3;
                if (bxVar.c()) {
                    bxVar.a();
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new zp(this, 17));
        this.actionBar.setTitle(LocaleController.getString(R.string.TopicsTitle));
        FrameLayout frameLayout = new FrameLayout(context);
        vy vyVar = new vy(this, new b5(this, 13), new zt(this, 6), null);
        this.f44967e = vyVar;
        vyVar.p1();
        this.f44967e.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f22999a7, this.resourceProvider));
        frameLayout.addView(this.f44967e, h7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.f44967e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44965b = getMessagesController().getChat(Long.valueOf(-this.f44964a));
        return super.onFragmentCreate();
    }
}
