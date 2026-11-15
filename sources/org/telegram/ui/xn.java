package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xn extends org.telegram.ui.ActionBar.j {
    public final Context f53268a;
    public final ho f53269b;

    public xn(ho hoVar, Context context) {
        this.f53269b = hoVar;
        this.f53268a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        ho hoVar = this.f53269b;
        if (i7 == -1) {
            hoVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.z4 z4Var = hoVar.f47770r;
            if (z4Var == null || !z4Var.f29950y.f57086f) {
                String K = org.telegram.messenger.t3.K(hoVar.Y, false);
                if (hoVar.W && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f53268a, hoVar.getResourceProvider());
                    if (hoVar.f47751b0) {
                        i10 = 2131748702;
                    } else {
                        i10 = 2131748700;
                    }
                    String M0 = org.telegram.messenger.hd.M0(i10, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    if (hoVar.f47751b0) {
                        i11 = 2131748703;
                    } else {
                        i11 = 2131748701;
                    }
                    t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.a0(null, null, i11, org.telegram.ui.Cells.y0.m(hoVar.getMessagesController().V2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751771, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                    hoVar.showDialog(t1Var);
                    return;
                }
                hoVar.e0();
            }
        }
    }
}
