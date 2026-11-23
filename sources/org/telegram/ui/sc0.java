package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc0 implements Runnable {
    public final int f52052a;
    public final gd0 f52053b;

    public sc0(gd0 gd0Var, int i7) {
        this.f52052a = i7;
        this.f52053b = gd0Var;
    }

    @Override
    public final void run() {
        er[] erVarArr;
        View view;
        int i7 = this.f52052a;
        int i10 = 0;
        gd0 gd0Var = this.f52053b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.qh0 qh0Var = gd0Var.H;
                br brVar = gd0Var.f48256f;
                int i11 = gd0Var.f48260i0;
                if (i11 != 3 && (erVarArr = brVar.f46491f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f46491f[length].length() != 0) {
                            brVar.f46491f[length].requestFocus();
                            er erVar = brVar.f46491f[length];
                            erVar.setSelection(erVar.length());
                            de0.b1(gd0Var.f48275v0, brVar.f46491f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.nh0 nh0Var = gd0Var.f48247a;
                if (nh0Var != null) {
                    nh0Var.start();
                }
                if (i11 == 15) {
                    qh0Var.getAnimatedDrawable().N(0, false, false);
                    qh0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 6));
                return;
            case 2:
                nb0 nb0Var = gd0Var.f48277x;
                gd0Var.f48273t0 = false;
                while (true) {
                    er[] erVarArr2 = gd0Var.f48256f.f46491f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        if (gd0Var.f48260i0 == 15) {
                            view = gd0Var.G;
                        } else {
                            view = gd0Var.E;
                        }
                        if (nb0Var.getCurrentView() != view) {
                            nb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.qh0 qh0Var2 = gd0Var.f48271s;
                qh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.nh0 nh0Var2 = gd0Var.R;
                nh0Var2.N(0, false, false);
                nh0Var2.K(1);
                qh0Var2.setAnimation(nh0Var2);
                qh0Var2.d();
                return;
            case 5:
                try {
                    gd0Var.f48275v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String N0 = org.telegram.messenger.gd.N0(2131742527, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752522, org.telegram.messenger.m10.h(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
                t1Var.setOnDismissListener(new ad0(gd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.nh0 nh0Var3 = gd0Var.S;
                nh0Var3.f37825u0 = new sc0(gd0Var, 8);
                org.telegram.ui.Components.qh0 qh0Var3 = gd0Var.f48271s;
                qh0Var3.setAutoRepeat(false);
                nh0Var3.N(0, false, false);
                qh0Var3.setAnimation(nh0Var3);
                qh0Var3.d();
                return;
            case 7:
                gd0Var.postDelayed(new sc0(gd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 10));
                return;
            case 9:
                br brVar2 = gd0Var.f48256f;
                brVar2.f46490e = false;
                brVar2.f46491f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f46491f;
                    if (i10 < erVarArr3.length) {
                        erVarArr3[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.qh0 qh0Var4 = gd0Var.f48271s;
                qh0Var4.setAutoRepeat(false);
                qh0Var4.setAnimation(gd0Var.f48247a);
                return;
        }
    }
}
