package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sn extends org.telegram.ui.ActionBar.j {
    public final Context f49573a;
    public final bo f49574b;

    public sn(bo boVar, Context context) {
        this.f49574b = boVar;
        this.f49573a = context;
    }

    @Override
    public final void b(int i3) {
        int i10;
        int i11;
        bo boVar = this.f49574b;
        if (i3 == -1) {
            boVar.finishFragment();
        } else if (i3 == 1) {
            org.telegram.ui.ActionBar.b5 b5Var = boVar.f44110r;
            if (b5Var == null || !b5Var.f27421y.f53841f) {
                String K = org.telegram.messenger.t3.K(boVar.Y, false);
                if (boVar.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f49573a, boVar.getResourceProvider());
                    if (boVar.f44091b0) {
                        i10 = 2131748710;
                    } else {
                        i10 = 2131748708;
                    }
                    String M0 = org.telegram.messenger.bd.M0(i10, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    if (boVar.f44091b0) {
                        i11 = 2131748711;
                    } else {
                        i11 = 2131748709;
                    }
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i11, org.telegram.ui.Cells.f1.r(boVar.getMessagesController().V2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751771, null), new x0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    boVar.showDialog(s1Var);
                    return;
                }
                boVar.e0();
            }
        }
    }
}
