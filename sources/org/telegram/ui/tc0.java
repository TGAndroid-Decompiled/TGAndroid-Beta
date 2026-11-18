package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class tc0 implements Runnable {
    public final int f52248a;
    public final hd0 f52249b;

    public tc0(hd0 hd0Var, int i7) {
        this.f52248a = i7;
        this.f52249b = hd0Var;
    }

    @Override
    public final void run() {
        er[] erVarArr;
        View view;
        int i7 = this.f52248a;
        int i10 = 0;
        hd0 hd0Var = this.f52249b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ph0 ph0Var = hd0Var.H;
                br brVar = hd0Var.f48312f;
                int i11 = hd0Var.f48316i0;
                if (i11 != 3 && (erVarArr = brVar.f46274f) != null) {
                    for (int length = erVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || brVar.f46274f[length].length() != 0) {
                            brVar.f46274f[length].requestFocus();
                            er erVar = brVar.f46274f[length];
                            erVar.setSelection(erVar.length());
                            ee0.b1(hd0Var.f48331v0, brVar.f46274f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.mh0 mh0Var = hd0Var.f48303a;
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
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 6));
                return;
            case 2:
                ob0 ob0Var = hd0Var.f48333x;
                hd0Var.f48329t0 = false;
                while (true) {
                    er[] erVarArr2 = hd0Var.f48312f.f46274f;
                    if (i10 < erVarArr2.length) {
                        erVarArr2[i10].A(0.0f);
                        i10++;
                    } else {
                        if (hd0Var.f48316i0 == 15) {
                            view = hd0Var.G;
                        } else {
                            view = hd0Var.E;
                        }
                        if (ob0Var.getCurrentView() != view) {
                            ob0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ph0 ph0Var2 = hd0Var.f48327s;
                ph0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.mh0 mh0Var2 = hd0Var.R;
                mh0Var2.N(0, false, false);
                mh0Var2.K(1);
                ph0Var2.setAnimation(mh0Var2);
                ph0Var2.d();
                return;
            case 5:
                try {
                    hd0Var.f48331v0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hd0Var.getContext());
                String M0 = org.telegram.messenger.gd.M0(2131742540, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131752523, org.telegram.messenger.n10.h(new StringBuilder("+"), hd0Var.d, pf.b.c()));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                u1Var.setOnDismissListener(new bd0(hd0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.mh0 mh0Var3 = hd0Var.S;
                mh0Var3.f37506u0 = new tc0(hd0Var, 8);
                org.telegram.ui.Components.ph0 ph0Var3 = hd0Var.f48327s;
                ph0Var3.setAutoRepeat(false);
                mh0Var3.N(0, false, false);
                ph0Var3.setAnimation(mh0Var3);
                ph0Var3.d();
                return;
            case 7:
                hd0Var.postDelayed(new tc0(hd0Var, 9), 150L);
                return;
            case 8:
                org.telegram.messenger.g0.g3(new tc0(hd0Var, 10));
                return;
            case 9:
                br brVar2 = hd0Var.f48312f;
                brVar2.f46273e = false;
                brVar2.f46274f[0].requestFocus();
                while (true) {
                    er[] erVarArr3 = brVar2.f46274f;
                    if (i10 < erVarArr3.length) {
                        erVarArr3[i10].A(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ph0 ph0Var4 = hd0Var.f48327s;
                ph0Var4.setAutoRepeat(false);
                ph0Var4.setAnimation(hd0Var.f48303a);
                return;
        }
    }
}
