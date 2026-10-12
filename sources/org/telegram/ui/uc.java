package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class uc extends org.telegram.ui.Components.vm0 {
    public final Context f42490c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final int f42491e;
    public final wc f42492f;

    public uc(wc wcVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f42492f = wcVar;
        this.f42490c = context;
        this.d = c6Var;
        this.f42491e = i10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f42491e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        vc vcVar = (vc) d1Var.f47897a;
        vcVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, this.d));
        if (i10 == this.f42492f.f43135e) {
            z10 = true;
        } else {
            z10 = false;
        }
        vcVar.f42759s = z10;
        vcVar.v.f(z10, true);
        vcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f42491e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            vcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        return new s4.d1(new vc(this.f42492f, this.f42490c));
    }
}
