package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class rc extends org.telegram.ui.Components.ll0 {
    public final Context f37185c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int e;
    public final tc f37186f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f37186f = tcVar;
        this.f37185c = context;
        this.d = f6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        sc scVar = (sc) c1Var.f42697a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18862d6, this.d));
        if (i10 == this.f37186f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        scVar.f37461s = z10;
        scVar.v.f(z10, true);
        scVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            scVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new sc(this.f37186f, this.f37185c));
    }
}
