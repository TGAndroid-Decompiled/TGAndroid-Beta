package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yn extends org.telegram.ui.ActionBar.k {
    public final Context f52070a;
    public final io f52071b;

    public yn(io ioVar, Context context) {
        this.f52071b = ioVar;
        this.f52070a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        io ioVar = this.f52071b;
        if (i7 == -1) {
            ioVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.c5 c5Var = ioVar.f46703r;
            if (c5Var == null || !c5Var.f27380y.f55499f) {
                String K = org.telegram.messenger.t3.K(ioVar.X, false);
                if (ioVar.V && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f52070a, ioVar.getResourceProvider());
                    if (ioVar.f46682a0) {
                        i10 = 2131748702;
                    } else {
                        i10 = 2131748700;
                    }
                    String M0 = org.telegram.messenger.id.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                    u1Var.R = M0;
                    if (ioVar.f46682a0) {
                        i11 = 2131748703;
                    } else {
                        i11 = 2131748701;
                    }
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i11, org.telegram.ui.Cells.f1.n(ioVar.getMessagesController().U2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    ioVar.showDialog(u1Var);
                    return;
                }
                ioVar.e0();
            }
        }
    }
}
