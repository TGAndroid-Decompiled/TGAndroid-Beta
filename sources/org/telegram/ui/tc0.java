package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tc0 implements Runnable {
    public final int f50023a;
    public final gd0 f50024b;

    public tc0(gd0 gd0Var, int i7) {
        this.f50023a = i7;
        this.f50024b = gd0Var;
    }

    @Override
    public final void run() {
        br[] brVarArr;
        View view;
        int i7 = this.f50023a;
        int i10 = 0;
        gd0 gd0Var = this.f50024b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ch0 ch0Var = gd0Var.G;
                yq yqVar = gd0Var.f45964f;
                int i11 = gd0Var.f45967h0;
                if (i11 != 3 && (brVarArr = yqVar.f52289f) != null) {
                    for (int length = brVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || yqVar.f52289f[length].length() != 0) {
                            yqVar.f52289f[length].requestFocus();
                            br brVar = yqVar.f52289f[length];
                            brVar.setSelection(brVar.length());
                            ce0.b1(gd0Var.f45982u0, yqVar.f52289f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.zg0 zg0Var = gd0Var.f45955a;
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
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 6));
                return;
            case 2:
                nb0 nb0Var = gd0Var.f45984x;
                gd0Var.f45980s0 = false;
                while (true) {
                    br[] brVarArr2 = gd0Var.f45964f.f52289f;
                    if (i10 < brVarArr2.length) {
                        brVarArr2[i10].z(0.0f);
                        i10++;
                    } else {
                        if (gd0Var.f45967h0 == 15) {
                            view = gd0Var.F;
                        } else {
                            view = gd0Var.D;
                        }
                        if (nb0Var.getCurrentView() != view) {
                            nb0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ch0 ch0Var2 = gd0Var.f45979s;
                ch0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.zg0 zg0Var2 = gd0Var.Q;
                zg0Var2.N(0, false, false);
                zg0Var2.K(1);
                ch0Var2.setAnimation(zg0Var2);
                ch0Var2.d();
                return;
            case 5:
                try {
                    gd0Var.f45982u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String M0 = org.telegram.messenger.id.M0(2131742801, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.a0(null, null, 2131752534, org.telegram.messenger.k5.i(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                u1Var.setOnDismissListener(new cd0(gd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.zg0 zg0Var3 = gd0Var.R;
                zg0Var3.f41014t0 = new tc0(gd0Var, 8);
                org.telegram.ui.Components.ch0 ch0Var3 = gd0Var.f45979s;
                ch0Var3.setAutoRepeat(false);
                zg0Var3.N(0, false, false);
                ch0Var3.setAnimation(zg0Var3);
                ch0Var3.d();
                return;
            case 7:
                gd0Var.postDelayed(new tc0(gd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.h3(new tc0(gd0Var, 10));
                return;
            case 9:
                yq yqVar2 = gd0Var.f45964f;
                yqVar2.f52288e = false;
                yqVar2.f52289f[0].requestFocus();
                while (true) {
                    br[] brVarArr3 = yqVar2.f52289f;
                    if (i10 < brVarArr3.length) {
                        brVarArr3[i10].z(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ch0 ch0Var4 = gd0Var.f45979s;
                ch0Var4.setAutoRepeat(false);
                ch0Var4.setAnimation(gd0Var.f45955a);
                return;
        }
    }
}
