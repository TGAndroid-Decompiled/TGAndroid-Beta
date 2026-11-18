package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sc0 implements Runnable {
    public final int f51969a;
    public final gd0 f51970b;

    public sc0(gd0 gd0Var, int i7) {
        this.f51969a = i7;
        this.f51970b = gd0Var;
    }

    @Override
    public final void run() {
        er[] erVarArr;
        View view;
        int i7 = this.f51969a;
        int i10 = 0;
        gd0 gd0Var = this.f51970b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ph0 ph0Var = gd0Var.H;
                br brVar = gd0Var.f48061f;
                int i11 = gd0Var.f48065i0;
                if (i11 != 3 && (erVarArr = brVar.f46283f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f46283f[length].length() != 0) {
                            brVar.f46283f[length].requestFocus();
                            er erVar = brVar.f46283f[length];
                            erVar.setSelection(erVar.length());
                            de0.b1(gd0Var.f48080v0, brVar.f46283f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.mh0 mh0Var = gd0Var.f48052a;
                if (mh0Var != null) {
                    mh0Var.start();
                }
                if (i11 == 15) {
                    ph0Var.getAnimatedDrawable().N(0, false, false);
                    ph0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 6));
                return;
            case 2:
                nb0 nb0Var = gd0Var.f48082x;
                gd0Var.f48078t0 = false;
                while (true) {
                    er[] erVarArr2 = gd0Var.f48061f.f46283f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        if (gd0Var.f48065i0 == 15) {
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
                org.telegram.ui.Components.ph0 ph0Var2 = gd0Var.f48076s;
                ph0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.mh0 mh0Var2 = gd0Var.R;
                mh0Var2.N(0, false, false);
                mh0Var2.K(1);
                ph0Var2.setAnimation(mh0Var2);
                ph0Var2.d();
                return;
            case 5:
                try {
                    gd0Var.f48080v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String M0 = org.telegram.messenger.gd.M0(2131742540, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752523, org.telegram.messenger.n10.h(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                u1Var.setOnDismissListener(new ad0(gd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.mh0 mh0Var3 = gd0Var.S;
                mh0Var3.f37506u0 = new sc0(gd0Var, 8);
                org.telegram.ui.Components.ph0 ph0Var3 = gd0Var.f48076s;
                ph0Var3.setAutoRepeat(false);
                mh0Var3.N(0, false, false);
                ph0Var3.setAnimation(mh0Var3);
                ph0Var3.d();
                return;
            case 7:
                gd0Var.postDelayed(new sc0(gd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.g3(new sc0(gd0Var, 10));
                return;
            case 9:
                br brVar2 = gd0Var.f48061f;
                brVar2.f46282e = false;
                brVar2.f46283f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f46283f;
                    if (i10 < erVarArr3.length) {
                        erVarArr3[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ph0 ph0Var4 = gd0Var.f48076s;
                ph0Var4.setAutoRepeat(false);
                ph0Var4.setAnimation(gd0Var.f48052a);
                return;
        }
    }
}
