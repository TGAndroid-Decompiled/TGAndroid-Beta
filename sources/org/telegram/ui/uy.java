package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class uy extends org.telegram.ui.ActionBar.n2 {
    public long f42073a;
    public TLRPC.Chat f42074b;
    public boolean f42075c;
    public boolean d;
    public ry e;
    public ai.r5 f42076f;

    public final void U() {
        if (this.d && getParentLayout() != null) {
            for (org.telegram.ui.ActionBar.n2 n2Var : getParentLayout().getFragmentStack()) {
                if (n2Var instanceof cy) {
                    ww wwVar = ((cy) n2Var).G3;
                    if (wwVar.c()) {
                        wwVar.a();
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
        ?? c71Var = new org.telegram.ui.Components.c71(this, new g5(this, 13), new ut(this, 6), null);
        this.e = c71Var;
        c71Var.p1();
        this.e.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, this.resourceProvider));
        frameLayout.addView(this.e, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.e);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f42074b = getMessagesController().getChat(Long.valueOf(-this.f42073a));
        return super.onFragmentCreate();
    }
}
