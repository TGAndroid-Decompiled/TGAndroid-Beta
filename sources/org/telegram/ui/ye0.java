package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ye0 implements Runnable {

    public final int f44795a;

    public final mf0 f44796b;

    public ye0(mf0 mf0Var, int i10) {
        this.f44795a = i10;
        this.f44796b = mf0Var;
    }

    @Override
    public final void run() {
        wr[] wrVarArr;
        int i10 = this.f44795a;
        int i11 = 1;
        int i12 = 0;
        mf0 mf0Var = this.f44796b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.ri0 ri0Var = mf0Var.C;
                ur urVar = mf0Var.f40487f;
                int i13 = mf0Var.f40481b0;
                if (i13 != 3 && (wrVarArr = urVar.f43279f) != null) {
                    for (int length = wrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || urVar.f43279f[length].length() != 0) {
                            urVar.f43279f[length].requestFocus();
                            wr wrVar = urVar.f43279f[length];
                            wrVar.setSelection(wrVar.length());
                            ig0.T0(mf0Var.f40497o0, urVar.f43279f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.oi0 oi0Var = mf0Var.f40478a;
                if (oi0Var != null) {
                    oi0Var.start();
                }
                if (i13 == 15) {
                    ri0Var.getAnimatedDrawable().L(0, false, false);
                    ri0Var.getAnimatedDrawable().start();
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 6));
                break;
            case 2:
                rd0 rd0Var = mf0Var.f40500w;
                mf0Var.m0 = false;
                while (true) {
                    wr[] wrVarArr2 = mf0Var.f40487f.f43279f;
                    if (i12 < wrVarArr2.length) {
                        wrVarArr2[i12].i(0.0f);
                        i12++;
                    } else if (rd0Var.getCurrentView() != (mf0Var.f40481b0 == 15 ? mf0Var.B : mf0Var.f40502y)) {
                        rd0Var.showNext();
                    }
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 4));
                break;
            case 4:
                org.telegram.ui.Components.ri0 ri0Var2 = mf0Var.f40499s;
                ri0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.oi0 oi0Var2 = mf0Var.K;
                oi0Var2.L(0, false, false);
                oi0Var2.I(1);
                ri0Var2.setAnimation(oi0Var2);
                ri0Var2.d();
                break;
            case 5:
                try {
                    mf0Var.f40497o0.fragmentView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.y1.k(new StringBuilder("+"), mf0Var.d, oe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new if0(mf0Var, i11));
                alertDialog$Builder.o();
                break;
            case 6:
                org.telegram.ui.Components.oi0 oi0Var3 = mf0Var.L;
                oi0Var3.f31326q0 = new ye0(mf0Var, 8);
                org.telegram.ui.Components.ri0 ri0Var3 = mf0Var.f40499s;
                ri0Var3.setAutoRepeat(false);
                oi0Var3.L(0, false, false);
                ri0Var3.setAnimation(oi0Var3);
                ri0Var3.d();
                break;
            case 7:
                mf0Var.postDelayed(new ye0(mf0Var, 9), 150L);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ye0(mf0Var, 10));
                break;
            case 9:
                ur urVar2 = mf0Var.f40487f;
                urVar2.f43278e = false;
                urVar2.f43279f[0].requestFocus();
                while (true) {
                    wr[] wrVarArr3 = urVar2.f43279f;
                    if (i12 < wrVarArr3.length) {
                        wrVarArr3[i12].i(0.0f);
                        i12++;
                    }
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.ri0 ri0Var4 = mf0Var.f40499s;
                ri0Var4.setAutoRepeat(false);
                ri0Var4.setAnimation(mf0Var.f40478a);
                break;
        }
    }
}
