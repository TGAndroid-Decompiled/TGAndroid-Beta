package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class wx0 extends n11 {
    public final yx0 f53025f2;
    public final e11[] f53026g2;
    public final zx0 f53027h2;

    public wx0(zx0 zx0Var, zx0 zx0Var2, Activity activity, Integer num, yx0 yx0Var, e11[] e11VarArr) {
        super(zx0Var2, activity, false, num, 2, null);
        this.f53027h2 = zx0Var;
        this.f53025f2 = yx0Var;
        this.f53026g2 = e11VarArr;
    }

    @Override
    public final void p(View view, Long l10, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i7;
        if (l10 != null) {
            zx0 zx0Var = this.f53027h2;
            i7 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
            org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i7);
            b02.a2("animated_" + l10);
            yx0 yx0Var = this.f53025f2;
            if (yx0Var != null) {
                yx0Var.a(true);
            }
            e11 e11Var = this.f53026g2[0];
            if (e11Var != null) {
                zx0Var.f54059n = null;
                e11Var.dismiss();
            }
        }
    }

    @Override
    public final void r(x01 x01Var, ch.p0 p0Var) {
        int i7;
        zx0 zx0Var = this.f53027h2;
        i7 = ((org.telegram.ui.ActionBar.e2) zx0Var).currentAccount;
        org.telegram.messenger.si.b0(i7).a2(p0Var.f5188f);
        yx0 yx0Var = this.f53025f2;
        if (yx0Var != null) {
            yx0Var.a(true);
        }
        e11 e11Var = this.f53026g2[0];
        if (e11Var != null) {
            zx0Var.f54059n = null;
            e11Var.dismiss();
        }
    }
}
