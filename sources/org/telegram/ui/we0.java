package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class we0 implements Runnable {
    public final int f45117a;
    public final jf0 f45118b;

    public we0(jf0 jf0Var, int i10) {
        this.f45117a = i10;
        this.f45118b = jf0Var;
    }

    @Override
    public final void run() {
        xr[] xrVarArr;
        View view;
        int i10 = this.f45117a;
        int i11 = 0;
        jf0 jf0Var = this.f45118b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ak0 ak0Var = jf0Var.G;
                vr vrVar = jf0Var.f40598f;
                int i12 = jf0Var.f40601h0;
                if (i12 != 3 && (xrVarArr = vrVar.f44894f) != null) {
                    for (int length = xrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || vrVar.f44894f[length].length() != 0) {
                            vrVar.f44894f[length].requestFocus();
                            xr xrVar = vrVar.f44894f[length];
                            xrVar.setSelection(xrVar.length());
                            gg0.W0(jf0Var.f40616u0, vrVar.f44894f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xj0 xj0Var = jf0Var.f40590a;
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
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 6));
                return;
            case 2:
                nd0 nd0Var = jf0Var.f40617w;
                jf0Var.f40614s0 = false;
                while (true) {
                    xr[] xrVarArr2 = jf0Var.f40598f.f44894f;
                    if (i11 < xrVarArr2.length) {
                        xrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (jf0Var.f40601h0 == 15) {
                            view = jf0Var.F;
                        } else {
                            view = jf0Var.f40619y;
                        }
                        if (nd0Var.getCurrentView() != view) {
                            nd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.ak0 ak0Var2 = jf0Var.f40613s;
                ak0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xj0 xj0Var2 = jf0Var.Q;
                xj0Var2.N(0, false, false);
                xj0Var2.K(1);
                ak0Var2.setAnimation(xj0Var2);
                ak0Var2.d();
                return;
            case 5:
                try {
                    jf0Var.f40616u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.R = string;
                e2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.vh.g(new StringBuilder("+"), jf0Var.d, kf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                e2Var.setOnDismissListener(new ff0(jf0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.xj0 xj0Var3 = jf0Var.R;
                xj0Var3.f34757t0 = new we0(jf0Var, 8);
                org.telegram.ui.Components.ak0 ak0Var3 = jf0Var.f40613s;
                ak0Var3.setAutoRepeat(false);
                xj0Var3.N(0, false, false);
                ak0Var3.setAnimation(xj0Var3);
                ak0Var3.d();
                return;
            case 7:
                jf0Var.postDelayed(new we0(jf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new we0(jf0Var, 10));
                return;
            case 9:
                vr vrVar2 = jf0Var.f40598f;
                vrVar2.e = false;
                vrVar2.f44894f[0].requestFocus();
                while (true) {
                    xr[] xrVarArr3 = vrVar2.f44894f;
                    if (i11 < xrVarArr3.length) {
                        xrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.ak0 ak0Var4 = jf0Var.f40613s;
                ak0Var4.setAutoRepeat(false);
                ak0Var4.setAnimation(jf0Var.f40590a);
                return;
        }
    }
}
