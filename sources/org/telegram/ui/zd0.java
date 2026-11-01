package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zd0 implements Runnable {
    public final int f43932a;
    public final le0 f43933b;

    public zd0(le0 le0Var, int i10) {
        this.f43932a = i10;
        this.f43933b = le0Var;
    }

    @Override
    public final void run() {
        bs[] bsVarArr;
        View view;
        int i10 = this.f43932a;
        int i11 = 0;
        le0 le0Var = this.f43933b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.fi0 fi0Var = le0Var.G;
                zr zrVar = le0Var.f39241f;
                int i12 = le0Var.f39244h0;
                if (i12 != 3 && (bsVarArr = zrVar.f44045f) != null) {
                    for (int length = bsVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || zrVar.f44045f[length].length() != 0) {
                            zrVar.f44045f[length].requestFocus();
                            bs bsVar = zrVar.f44045f[length];
                            bsVar.setSelection(bsVar.length());
                            gf0.a1(le0Var.f39259u0, zrVar.f44045f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.ci0 ci0Var = le0Var.f39233a;
                if (ci0Var != null) {
                    ci0Var.start();
                }
                if (i12 == 15) {
                    fi0Var.getAnimatedDrawable().N(0, false, false);
                    fi0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 6));
                return;
            case 2:
                uc0 uc0Var = le0Var.f39261x;
                le0Var.f39257s0 = false;
                while (true) {
                    bs[] bsVarArr2 = le0Var.f39241f.f44045f;
                    if (i11 < bsVarArr2.length) {
                        bsVarArr2[i11].z(0.0f);
                        i11++;
                    } else {
                        if (le0Var.f39244h0 == 15) {
                            view = le0Var.F;
                        } else {
                            view = le0Var.D;
                        }
                        if (uc0Var.getCurrentView() != view) {
                            uc0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.fi0 fi0Var2 = le0Var.f39256s;
                fi0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.ci0 ci0Var2 = le0Var.Q;
                ci0Var2.N(0, false, false);
                ci0Var2.K(1);
                fi0Var2.setAnimation(ci0Var2);
                fi0Var2.d();
                return;
            case 5:
                try {
                    le0Var.f39259u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(le0Var.getContext());
                String L0 = org.telegram.messenger.dd.L0(2131742823, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131752534, org.telegram.messenger.m5.h(new StringBuilder("+"), le0Var.d, af.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
                x1Var.setOnDismissListener(new he0(le0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.ci0 ci0Var3 = le0Var.R;
                ci0Var3.f25155t0 = new zd0(le0Var, 8);
                org.telegram.ui.Components.fi0 fi0Var3 = le0Var.f39256s;
                fi0Var3.setAutoRepeat(false);
                ci0Var3.N(0, false, false);
                fi0Var3.setAnimation(ci0Var3);
                fi0Var3.d();
                return;
            case 7:
                le0Var.postDelayed(new zd0(le0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.i0.g3(new zd0(le0Var, 10));
                return;
            case 9:
                zr zrVar2 = le0Var.f39241f;
                zrVar2.e = false;
                zrVar2.f44045f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr3 = zrVar2.f44045f;
                    if (i11 < bsVarArr3.length) {
                        bsVarArr3[i11].z(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.fi0 fi0Var4 = le0Var.f39256s;
                fi0Var4.setAutoRepeat(false);
                fi0Var4.setAnimation(le0Var.f39233a);
                return;
        }
    }
}
