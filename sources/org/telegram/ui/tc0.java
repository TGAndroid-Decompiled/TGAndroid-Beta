package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tc0 implements Runnable {
    public final int f52248a;
    public final gd0 f52249b;

    public tc0(gd0 gd0Var, int i7) {
        this.f52248a = i7;
        this.f52249b = gd0Var;
    }

    @Override
    public final void run() {
        er[] erVarArr;
        View view;
        int i7 = this.f52248a;
        int i10 = 0;
        gd0 gd0Var = this.f52249b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.rh0 rh0Var = gd0Var.H;
                br brVar = gd0Var.f48009f;
                int i11 = gd0Var.f48013i0;
                if (i11 != 3 && (erVarArr = brVar.f46275f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f46275f[length].length() != 0) {
                            brVar.f46275f[length].requestFocus();
                            er erVar = brVar.f46275f[length];
                            erVar.setSelection(erVar.length());
                            de0.b1(gd0Var.f48028v0, brVar.f46275f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.oh0 oh0Var = gd0Var.f48000a;
                if (oh0Var != null) {
                    oh0Var.start();
                }
                if (i11 == 15) {
                    rh0Var.getAnimatedDrawable().N(0, false, false);
                    rh0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                org.telegram.messenger.g0.g3(new tc0(gd0Var, 6));
                return;
            case 2:
                ob0 ob0Var = gd0Var.f48030x;
                gd0Var.f48026t0 = false;
                while (true) {
                    er[] erVarArr2 = gd0Var.f48009f.f46275f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        if (gd0Var.f48013i0 == 15) {
                            view = gd0Var.G;
                        } else {
                            view = gd0Var.E;
                        }
                        if (ob0Var.getCurrentView() != view) {
                            ob0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.g3(new tc0(gd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.rh0 rh0Var2 = gd0Var.f48024s;
                rh0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.oh0 oh0Var2 = gd0Var.R;
                oh0Var2.N(0, false, false);
                oh0Var2.K(1);
                rh0Var2.setAnimation(oh0Var2);
                rh0Var2.d();
                return;
            case 5:
                try {
                    gd0Var.f48028v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gd0Var.getContext());
                String N0 = org.telegram.messenger.hd.N0(2131742534, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.a0(null, null, 2131752522, org.telegram.messenger.o10.h(new StringBuilder("+"), gd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
                t1Var.setOnDismissListener(new bd0(gd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.oh0 oh0Var3 = gd0Var.S;
                oh0Var3.f38199u0 = new tc0(gd0Var, 8);
                org.telegram.ui.Components.rh0 rh0Var3 = gd0Var.f48024s;
                rh0Var3.setAutoRepeat(false);
                oh0Var3.N(0, false, false);
                rh0Var3.setAnimation(oh0Var3);
                rh0Var3.d();
                return;
            case 7:
                gd0Var.postDelayed(new tc0(gd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.g3(new tc0(gd0Var, 10));
                return;
            case 9:
                br brVar2 = gd0Var.f48009f;
                brVar2.f46274e = false;
                brVar2.f46275f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f46275f;
                    if (i10 < erVarArr3.length) {
                        erVarArr3[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.rh0 rh0Var4 = gd0Var.f48024s;
                rh0Var4.setAutoRepeat(false);
                rh0Var4.setAnimation(gd0Var.f48000a);
                return;
        }
    }
}
