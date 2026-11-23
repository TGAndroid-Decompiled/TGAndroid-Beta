package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yn extends org.telegram.ui.ActionBar.j {
    public final Context f54400a;
    public final io f54401b;

    public yn(io ioVar, Context context) {
        this.f54401b = ioVar;
        this.f54400a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        io ioVar = this.f54401b;
        if (i7 == -1) {
            ioVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.c5 c5Var = ioVar.f48883r;
            if (c5Var == null || !c5Var.f28920y.f57780f) {
                String K = org.telegram.messenger.v3.K(ioVar.Y, false);
                if (ioVar.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f54400a, ioVar.getResourceProvider());
                    if (ioVar.f48864b0) {
                        i10 = 2131748509;
                    } else {
                        i10 = 2131748507;
                    }
                    String N0 = org.telegram.messenger.gd.N0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                    t1Var.S = N0;
                    if (ioVar.f48864b0) {
                        i11 = 2131748510;
                    } else {
                        i11 = 2131748508;
                    }
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i11, p5.c.m(ioVar.getMessagesController().X2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751759, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                    ioVar.showDialog(t1Var);
                    return;
                }
                ioVar.e0();
            }
        }
    }
}
