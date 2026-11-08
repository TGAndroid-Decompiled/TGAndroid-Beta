package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wn extends org.telegram.ui.ActionBar.j {
    public final Context f51467a;
    public final go f51468b;

    public wn(go goVar, Context context) {
        this.f51468b = goVar;
        this.f51467a = context;
    }

    @Override
    public final void b(int i7) {
        int i10;
        int i11;
        go goVar = this.f51468b;
        if (i7 == -1) {
            goVar.finishFragment();
        } else if (i7 == 1) {
            org.telegram.ui.ActionBar.b5 b5Var = goVar.f46069r;
            if (b5Var == null || !b5Var.f27358y.f55488f) {
                String K = org.telegram.messenger.t3.K(goVar.X, false);
                if (goVar.V && !TextUtils.isEmpty(K)) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f51467a, goVar.getResourceProvider());
                    if (goVar.f46048a0) {
                        i10 = 2131748703;
                    } else {
                        i10 = 2131748701;
                    }
                    String M0 = org.telegram.messenger.id.M0(i10, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    if (goVar.f46048a0) {
                        i11 = 2131748704;
                    } else {
                        i11 = 2131748702;
                    }
                    u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, i11, org.telegram.ui.Cells.f1.n(goVar.getMessagesController().U2, "/", K, new StringBuilder())));
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new w0(this, 24));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    goVar.showDialog(u1Var);
                    return;
                }
                goVar.e0();
            }
        }
    }
}
