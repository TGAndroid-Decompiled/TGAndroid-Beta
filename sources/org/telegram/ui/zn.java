package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zn extends org.telegram.ui.ActionBar.j {
    public final Context f54556a;
    public final jo f54557b;

    public zn(jo joVar, Context context) {
        this.f54557b = joVar;
        this.f54556a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        jo joVar = this.f54557b;
        if (i7 == -1) {
            joVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.d5 d5Var = joVar.f49040r;
            if (d5Var == null || !d5Var.f28873y.f57658f) {
                String K = org.telegram.messenger.v3.K(joVar.Y, false);
                if (joVar.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f54556a, joVar.getResourceProvider());
                    if (joVar.f49021b0) {
                        i10 = 2131748510;
                    } else {
                        i10 = 2131748508;
                    }
                    String M0 = org.telegram.messenger.gd.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                    u1Var.S = M0;
                    if (joVar.f49021b0) {
                        i11 = 2131748511;
                    } else {
                        i11 = 2131748509;
                    }
                    u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, i11, p5.c.m(joVar.getMessagesController().X2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751760, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                    joVar.showDialog(u1Var);
                    return;
                }
                joVar.e0();
            }
        }
    }
}
