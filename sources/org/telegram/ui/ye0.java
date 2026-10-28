package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ye0 implements Runnable {
    public final int f45981a;
    public final lf0 f45982b;

    public ye0(lf0 lf0Var, int i10) {
        this.f45981a = i10;
        this.f45982b = lf0Var;
    }

    @Override
    public final void run() {
        zr[] zrVarArr;
        View view;
        int i10 = this.f45981a;
        int i11 = 0;
        lf0 lf0Var = this.f45982b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = lf0Var.G;
                xr xrVar = lf0Var.f41116f;
                int i12 = lf0Var.f41119h0;
                if (i12 != 3 && (zrVarArr = xrVar.f45772f) != null) {
                    for (int length = zrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || xrVar.f45772f[length].length() != 0) {
                            xrVar.f45772f[length].requestFocus();
                            zr zrVar = xrVar.f45772f[length];
                            zrVar.setSelection(zrVar.length());
                            ig0.W0(lf0Var.f41134u0, xrVar.f45772f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = lf0Var.f41108a;
                if (yj0Var != null) {
                    yj0Var.start();
                }
                if (i12 == 15) {
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 6));
                return;
            case 2:
                pd0 pd0Var = lf0Var.f41135w;
                lf0Var.f41132s0 = false;
                while (true) {
                    zr[] zrVarArr2 = lf0Var.f41116f.f45772f;
                    if (i11 < zrVarArr2.length) {
                        zrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (lf0Var.f41119h0 == 15) {
                            view = lf0Var.F;
                        } else {
                            view = lf0Var.f41137y;
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
                org.telegram.ui.Components.bk0 bk0Var2 = lf0Var.f41131s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = lf0Var.Q;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                return;
            case 5:
                try {
                    lf0Var.f41134u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.wh.g(new StringBuilder("+"), lf0Var.d, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                e2Var.setOnDismissListener(new hf0(lf0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = lf0Var.R;
                yj0Var3.f35091t0 = new ye0(lf0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = lf0Var.f41131s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                return;
            case 7:
                lf0Var.postDelayed(new ye0(lf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ye0(lf0Var, 10));
                return;
            case 9:
                xr xrVar2 = lf0Var.f41116f;
                xrVar2.e = false;
                xrVar2.f45772f[0].requestFocus();
                while (true) {
                    zr[] zrVarArr3 = xrVar2.f45772f;
                    if (i11 < zrVarArr3.length) {
                        zrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = lf0Var.f41131s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(lf0Var.f41108a);
                return;
        }
    }
}
