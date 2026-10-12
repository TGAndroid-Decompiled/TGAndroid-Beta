package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rf0 implements Runnable {
    public final int f39787a;
    public final eg0 f39788b;

    public rf0(eg0 eg0Var, int i10) {
        this.f39787a = i10;
        this.f39788b = eg0Var;
    }

    @Override
    public final void run() {
        ks[] ksVarArr;
        View view;
        int i10 = this.f39787a;
        int i11 = 0;
        eg0 eg0Var = this.f39788b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = eg0Var.G;
                hs hsVar = eg0Var.f35550f;
                int i12 = eg0Var.f35551f0;
                if (i12 != 3 && (ksVarArr = hsVar.f36949f) != null) {
                    for (int length = ksVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || hsVar.f36949f[length].length() != 0) {
                            hsVar.f36949f[length].requestFocus();
                            ks ksVar = hsVar.f36949f[length];
                            ksVar.setSelection(ksVar.length());
                            bh0.T0(eg0Var.f35566s0, hsVar.f36949f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = eg0Var.f35542a;
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
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 6));
                return;
            case 2:
                ke0 ke0Var = eg0Var.f35567w;
                eg0Var.f35562q0 = false;
                while (true) {
                    ks[] ksVarArr2 = eg0Var.f35550f.f36949f;
                    if (i11 < ksVarArr2.length) {
                        ksVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (eg0Var.f35551f0 == 15) {
                            view = eg0Var.F;
                        } else {
                            view = eg0Var.f35569y;
                        }
                        if (ke0Var.getCurrentView() != view) {
                            ke0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = eg0Var.f35565s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = eg0Var.O;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                return;
            case 5:
                try {
                    eg0Var.f35566s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(eg0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                a2Var.R = string;
                a2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.yh.g(new StringBuilder("+"), eg0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                a2Var.setOnDismissListener(new ag0(eg0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = eg0Var.P;
                yj0Var3.f31626t0 = new rf0(eg0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = eg0Var.f35565s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                return;
            case 7:
                eg0Var.postDelayed(new rf0(eg0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new rf0(eg0Var, 10));
                return;
            case 9:
                hs hsVar2 = eg0Var.f35550f;
                hsVar2.e = false;
                hsVar2.f36949f[0].requestFocus();
                while (true) {
                    ks[] ksVarArr3 = hsVar2.f36949f;
                    if (i11 < ksVarArr3.length) {
                        ksVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = eg0Var.f35565s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(eg0Var.f35542a);
                return;
        }
    }
}
