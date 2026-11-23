package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zn extends org.telegram.ui.ActionBar.j {
    public final Context f54608a;
    public final jo f54609b;

    public zn(jo joVar, Context context) {
        this.f54609b = joVar;
        this.f54608a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        jo joVar = this.f54609b;
        if (i7 == -1) {
            joVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.c5 c5Var = joVar.f49054r;
            if (c5Var == null || !c5Var.f28859y.f57701f) {
                String K = org.telegram.messenger.v3.K(joVar.Y, false);
                if (joVar.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f54608a, joVar.getResourceProvider());
                    if (joVar.f49035b0) {
                        i10 = 2131748509;
                    } else {
                        i10 = 2131748507;
                    }
                    String N0 = org.telegram.messenger.hd.N0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                    t1Var.S = N0;
                    if (joVar.f49035b0) {
                        i11 = 2131748510;
                    } else {
                        i11 = 2131748508;
                    }
                    t1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.a0(null, null, i11, p5.c.m(joVar.getMessagesController().X2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751759, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                    joVar.showDialog(t1Var);
                    return;
                }
                joVar.e0();
            }
        }
    }
}
