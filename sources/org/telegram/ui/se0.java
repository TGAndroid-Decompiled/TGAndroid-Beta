package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class se0 implements Runnable {
    public final int f41453a;
    public final hf0 f41454b;

    public se0(hf0 hf0Var, int i10) {
        this.f41453a = i10;
        this.f41454b = hf0Var;
    }

    @Override
    public final void run() {
        tr[] trVarArr;
        View view;
        int i10 = this.f41453a;
        int i11 = 0;
        hf0 hf0Var = this.f41454b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.yj0 yj0Var = hf0Var.G;
                qr qrVar = hf0Var.f37604f;
                int i12 = hf0Var.f37605f0;
                if (i12 != 3 && (trVarArr = qrVar.f40962f) != null) {
                    for (int length = trVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || qrVar.f40962f[length].length() != 0) {
                            qrVar.f40962f[length].requestFocus();
                            tr trVar = qrVar.f40962f[length];
                            trVar.setSelection(trVar.length());
                            dg0.T0(hf0Var.f37620s0, qrVar.f40962f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.vj0 vj0Var = hf0Var.f37596a;
                if (vj0Var != null) {
                    vj0Var.start();
                }
                if (i12 == 15) {
                    yj0Var.getAnimatedDrawable().N(0, false, false);
                    yj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 6));
                return;
            case 2:
                ld0 ld0Var = hf0Var.f37621w;
                hf0Var.f37616q0 = false;
                while (true) {
                    tr[] trVarArr2 = hf0Var.f37604f.f40962f;
                    if (i11 < trVarArr2.length) {
                        trVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (hf0Var.f37605f0 == 15) {
                            view = hf0Var.F;
                        } else {
                            view = hf0Var.f37623y;
                        }
                        if (ld0Var.getCurrentView() != view) {
                            ld0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.yj0 yj0Var2 = hf0Var.f37619s;
                yj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.vj0 vj0Var2 = hf0Var.O;
                vj0Var2.N(0, false, false);
                vj0Var2.K(1);
                yj0Var2.setAnimation(vj0Var2);
                yj0Var2.d();
                return;
            case 5:
                try {
                    hf0Var.f37620s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ok.g(new StringBuilder("+"), hf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new bf0(hf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.vj0 vj0Var3 = hf0Var.P;
                vj0Var3.f31292t0 = new se0(hf0Var, 8);
                org.telegram.ui.Components.yj0 yj0Var3 = hf0Var.f37619s;
                yj0Var3.setAutoRepeat(false);
                vj0Var3.N(0, false, false);
                yj0Var3.setAnimation(vj0Var3);
                yj0Var3.d();
                return;
            case 7:
                hf0Var.postDelayed(new se0(hf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new se0(hf0Var, 10));
                return;
            case 9:
                qr qrVar2 = hf0Var.f37604f;
                qrVar2.e = false;
                qrVar2.f40962f[0].requestFocus();
                while (true) {
                    tr[] trVarArr3 = qrVar2.f40962f;
                    if (i11 < trVarArr3.length) {
                        trVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.yj0 yj0Var4 = hf0Var.f37619s;
                yj0Var4.setAutoRepeat(false);
                yj0Var4.setAnimation(hf0Var.f37596a);
                return;
        }
    }
}
