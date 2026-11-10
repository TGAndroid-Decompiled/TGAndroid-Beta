package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class xc0 implements Runnable {
    public final int f51688a;
    public final jd0 f51689b;

    public xc0(jd0 jd0Var, int i7) {
        this.f51688a = i7;
        this.f51689b = jd0Var;
    }

    @Override
    public final void run() {
        er[] erVarArr;
        View view;
        int i7 = this.f51688a;
        int i10 = 0;
        jd0 jd0Var = this.f51689b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ch0 ch0Var = jd0Var.G;
                br brVar = jd0Var.f46967f;
                int i11 = jd0Var.f46970h0;
                if (i11 != 3 && (erVarArr = brVar.f44118f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f44118f[length].length() != 0) {
                            brVar.f44118f[length].requestFocus();
                            er erVar = brVar.f44118f[length];
                            erVar.setSelection(erVar.length());
                            fe0.b1(jd0Var.f46985u0, brVar.f44118f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.zg0 zg0Var = jd0Var.f46958a;
                if (zg0Var != null) {
                    zg0Var.start();
                }
                if (i11 == 15) {
                    ch0Var.getAnimatedDrawable().N(0, false, false);
                    ch0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 6));
                return;
            case 2:
                qb0 qb0Var = jd0Var.f46987x;
                jd0Var.f46983s0 = false;
                while (true) {
                    er[] erVarArr2 = jd0Var.f46967f.f44118f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        if (jd0Var.f46970h0 == 15) {
                            view = jd0Var.F;
                        } else {
                            view = jd0Var.D;
                        }
                        if (qb0Var.getCurrentView() != view) {
                            qb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ch0 ch0Var2 = jd0Var.f46982s;
                ch0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.zg0 zg0Var2 = jd0Var.Q;
                zg0Var2.N(0, false, false);
                zg0Var2.K(1);
                ch0Var2.setAnimation(zg0Var2);
                ch0Var2.d();
                return;
            case 5:
                try {
                    jd0Var.f46985u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jd0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131742798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), jd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                u1Var.setOnDismissListener(new fd0(jd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.zg0 zg0Var3 = jd0Var.R;
                zg0Var3.f40987t0 = new xc0(jd0Var, 8);
                org.telegram.ui.Components.ch0 ch0Var3 = jd0Var.f46982s;
                ch0Var3.setAutoRepeat(false);
                zg0Var3.N(0, false, false);
                ch0Var3.setAnimation(zg0Var3);
                ch0Var3.d();
                return;
            case 7:
                jd0Var.postDelayed(new xc0(jd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.h3(new xc0(jd0Var, 10));
                return;
            case 9:
                br brVar2 = jd0Var.f46967f;
                brVar2.f44117e = false;
                brVar2.f44118f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f44118f;
                    if (i10 < erVarArr3.length) {
                        erVarArr3[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ch0 ch0Var4 = jd0Var.f46982s;
                ch0Var4.setAutoRepeat(false);
                ch0Var4.setAnimation(jd0Var.f46958a);
                return;
        }
    }
}
