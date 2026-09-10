package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class rc extends org.telegram.ui.Components.ul0 {
    public final Context f36332c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int e;
    public final tc f36333f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f36333f = tcVar;
        this.f36332c = context;
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
        sc scVar = (sc) c1Var.f41610a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, this.d));
        if (i10 == this.f36333f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        scVar.f36649s = z10;
        scVar.v.f(z10, true);
        scVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            scVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new sc(this.f36333f, this.f36332c));
    }
}
