package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se0 implements Runnable {
    public final int f41446a;
    public final gf0 f41447b;

    public se0(gf0 gf0Var, int i10) {
        this.f41446a = i10;
        this.f41447b = gf0Var;
    }

    @Override
    public final void run() {
        tr[] trVarArr;
        View view;
        int i10 = this.f41446a;
        int i11 = 0;
        gf0 gf0Var = this.f41447b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xj0 xj0Var = gf0Var.G;
                qr qrVar = gf0Var.f37319f;
                int i12 = gf0Var.f37320f0;
                if (i12 != 3 && (trVarArr = qrVar.f40961f) != null) {
                    for (int length = trVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || qrVar.f40961f[length].length() != 0) {
                            qrVar.f40961f[length].requestFocus();
                            tr trVar = qrVar.f40961f[length];
                            trVar.setSelection(trVar.length());
                            cg0.T0(gf0Var.f37335s0, qrVar.f40961f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.uj0 uj0Var = gf0Var.f37311a;
                if (uj0Var != null) {
                    uj0Var.start();
                }
                if (i12 == 15) {
                    xj0Var.getAnimatedDrawable().N(0, false, false);
                    xj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new se0(gf0Var, 6));
                return;
            case 2:
                ld0 ld0Var = gf0Var.f37336w;
                gf0Var.f37331q0 = false;
                while (true) {
                    tr[] trVarArr2 = gf0Var.f37319f.f40961f;
                    if (i11 < trVarArr2.length) {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (gf0Var.f37320f0 == 15) {
                            view = gf0Var.F;
                        } else {
                            view = gf0Var.f37338y;
                        }
                        if (ld0Var.getCurrentView() != view) {
                            ld0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new se0(gf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.xj0 xj0Var2 = gf0Var.f37334s;
                xj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.uj0 uj0Var2 = gf0Var.O;
                uj0Var2.N(0, false, false);
                uj0Var2.K(1);
                xj0Var2.setAnimation(uj0Var2);
                xj0Var2.d();
                return;
            case 5:
                try {
                    gf0Var.f37335s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20604a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.lk.g(new StringBuilder("+"), gf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new bf0(gf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.uj0 uj0Var3 = gf0Var.P;
                uj0Var3.f31000t0 = new se0(gf0Var, 8);
                org.telegram.ui.Components.xj0 xj0Var3 = gf0Var.f37334s;
                xj0Var3.setAutoRepeat(false);
                uj0Var3.N(0, false, false);
                xj0Var3.setAnimation(uj0Var3);
                xj0Var3.d();
                return;
            case 7:
                gf0Var.postDelayed(new se0(gf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new se0(gf0Var, 10));
                return;
            case 9:
                qr qrVar2 = gf0Var.f37319f;
                qrVar2.e = false;
                qrVar2.f40961f[0].requestFocus();
                while (true) {
                    tr[] trVarArr3 = qrVar2.f40961f;
                    if (i11 < trVarArr3.length) {
                        trVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.xj0 xj0Var4 = gf0Var.f37334s;
                xj0Var4.setAutoRepeat(false);
                xj0Var4.setAnimation(gf0Var.f37311a);
                return;
        }
    }
}
