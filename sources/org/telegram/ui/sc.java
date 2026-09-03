package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.MessagesController;
public final class sc extends org.telegram.ui.Components.ql0 {
    public final Context f38148c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final int e;
    public final uc f38149f;

    public sc(uc ucVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        this.f38149f = ucVar;
        this.f38148c = context;
        this.d = f6Var;
        this.e = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
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
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        tc tcVar = (tc) l1Var.f5774a;
        tcVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.d));
        if (i10 == this.f38149f.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        tcVar.f38459s = z4;
        tcVar.v.f(z4, true);
        tcVar.invalidate();
        MessagesController.PeerColors peerColors = MessagesController.getInstance(this.e).peerColors;
        if (peerColors != null && i10 >= 0 && i10 < peerColors.colors.size()) {
            tcVar.a(peerColors.colors.get(i10));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new tc(this.f38149f, this.f38148c));
    }
}
