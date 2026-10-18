package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class rc extends org.telegram.ui.Components.hm0 {
    public final Context f40687c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final int e;
    public final tc f40688f;

    public rc(tc tcVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        this.f40688f = tcVar;
        this.f40687c = context;
        this.d = d6Var;
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
        sc scVar = (sc) b1Var.f45910a;
        scVar.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.d));
        if (i10 == this.f40688f.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        scVar.f41052s = z10;
        scVar.v.f(z10, true);
        scVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            scVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new sc(this.f40688f, this.f40687c));
    }
}
