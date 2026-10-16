package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class vc extends org.telegram.ui.Components.lm0 {
    public final Context f40671c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final int e;
    public final xc f40672f;

    public vc(xc xcVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        this.f40672f = xcVar;
        this.f40671c = context;
        this.d = c6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        wc wcVar = (wc) b1Var.f44838a;
        wcVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, this.d));
        if (i10 == this.f40672f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        wcVar.f40927s = z10;
        wcVar.v.f(z10, true);
        wcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            wcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new wc(this.f40672f, this.f40671c));
    }
}
