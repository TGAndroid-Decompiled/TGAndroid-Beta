package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ye0 implements Runnable {
    public final int f43835a;
    public final lf0 f43836b;

    public ye0(lf0 lf0Var, int i10) {
        this.f43835a = i10;
        this.f43836b = lf0Var;
    }

    @Override
    public final void run() {
        vr[] vrVarArr;
        View view;
        int i10 = this.f43835a;
        int i11 = 0;
        lf0 lf0Var = this.f43836b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ak0 ak0Var = lf0Var.G;
                sr srVar = lf0Var.f39237f;
                int i12 = lf0Var.f39240h0;
                if (i12 != 3 && (vrVarArr = srVar.f41792f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f41792f[length].length() != 0) {
                            srVar.f41792f[length].requestFocus();
                            vr vrVar = srVar.f41792f[length];
                            vrVar.setSelection(vrVar.length());
                            hg0.V0(lf0Var.f39255u0, srVar.f41792f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xj0 xj0Var = lf0Var.f39229a;
                if (xj0Var != null) {
                    xj0Var.start();
                }
                if (i12 == 15) {
                    ak0Var.getAnimatedDrawable().N(0, false, false);
                    ak0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 6));
                return;
            case 2:
                pd0 pd0Var = lf0Var.f39256w;
                lf0Var.f39253s0 = false;
                while (true) {
                    vr[] vrVarArr2 = lf0Var.f39237f.f41792f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (lf0Var.f39240h0 == 15) {
                            view = lf0Var.F;
                        } else {
                            view = lf0Var.f39258y;
                        }
                        if (pd0Var.getCurrentView() != view) {
                            pd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ak0 ak0Var2 = lf0Var.f39252s;
                ak0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xj0 xj0Var2 = lf0Var.Q;
                xj0Var2.N(0, false, false);
                xj0Var2.K(1);
                ak0Var2.setAnimation(xj0Var2);
                ak0Var2.d();
                return;
            case 5:
                try {
                    lf0Var.f39255u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.tl.h(new StringBuilder("+"), lf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new gf0(lf0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.xj0 xj0Var3 = lf0Var.R;
                xj0Var3.f32618t0 = new ye0(lf0Var, 8);
                org.telegram.ui.Components.ak0 ak0Var3 = lf0Var.f39252s;
                ak0Var3.setAutoRepeat(false);
                xj0Var3.N(0, false, false);
                ak0Var3.setAnimation(xj0Var3);
                ak0Var3.d();
                return;
            case 7:
                lf0Var.postDelayed(new ye0(lf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 10));
                return;
            case 9:
                sr srVar2 = lf0Var.f39237f;
                srVar2.e = false;
                srVar2.f41792f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f41792f;
                    if (i11 < vrVarArr3.length) {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ak0 ak0Var4 = lf0Var.f39252s;
                ak0Var4.setAutoRepeat(false);
                ak0Var4.setAnimation(lf0Var.f39229a);
                return;
        }
    }
}
