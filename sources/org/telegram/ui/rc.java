package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class rc extends org.telegram.ui.Components.yl0 {
    public final Context f40011c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final int f40012e;
    public final tc f40013f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f40013f = tcVar;
        this.f40011c = context;
        this.d = d6Var;
        this.f40012e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40012e).peerColors;
        if (peerColors == null) {
            return 0;
        }
        return peerColors.colors.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        sc scVar = (sc) c1Var.f46523a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20817d6, this.d));
        if (i10 == this.f40013f.f40785e) {
            z10 = true;
        } else {
            z10 = false;
        }
        scVar.f40450s = z10;
        scVar.v.f(z10, true);
        scVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f40012e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            scVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new sc(this.f40013f, this.f40011c));
    }
}
