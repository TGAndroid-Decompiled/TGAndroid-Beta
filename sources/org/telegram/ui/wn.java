package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn extends org.telegram.ui.ActionBar.j {
    public final Context f51455a;
    public final go f51456b;

    public wn(go goVar, Context context) {
        this.f51456b = goVar;
        this.f51455a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        go goVar = this.f51456b;
        if (i7 == -1) {
            goVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.b5 b5Var = goVar.f46041r;
            if (b5Var == null || !b5Var.f27354y.f55371f) {
                String K = org.telegram.messenger.t3.K(goVar.X, false);
                if (goVar.V && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f51455a, goVar.getResourceProvider());
                    if (goVar.f46020a0) {
                        i10 = 2131748701;
                    } else {
                        i10 = 2131748699;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    if (goVar.f46020a0) {
                        i11 = 2131748702;
                    } else {
                        i11 = 2131748700;
                    }
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i11, org.telegram.ui.Cells.f1.n(goVar.getMessagesController().U2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    goVar.showDialog(u1Var);
                    return;
                }
                goVar.e0();
            }
        }
    }
}
