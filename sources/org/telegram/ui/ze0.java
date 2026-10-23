package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ze0 implements Runnable {
    public final int f44128a;
    public final mf0 f44129b;

    public ze0(mf0 mf0Var, int i10) {
        this.f44128a = i10;
        this.f44129b = mf0Var;
    }

    @Override
    public final void run() {
        vr[] vrVarArr;
        View view;
        int i10 = this.f44128a;
        int i11 = 0;
        mf0 mf0Var = this.f44129b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.bk0 bk0Var = mf0Var.G;
                sr srVar = mf0Var.f39544f;
                int i12 = mf0Var.f39547h0;
                if (i12 != 3 && (vrVarArr = srVar.f41793f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f41793f[length].length() != 0) {
                            srVar.f41793f[length].requestFocus();
                            vr vrVar = srVar.f41793f[length];
                            vrVar.setSelection(vrVar.length());
                            ig0.V0(mf0Var.f39562u0, srVar.f41793f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.yj0 yj0Var = mf0Var.f39536a;
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
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 6));
                return;
            case 2:
                qd0 qd0Var = mf0Var.f39563w;
                mf0Var.f39560s0 = false;
                while (true) {
                    vr[] vrVarArr2 = mf0Var.f39544f.f41793f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (mf0Var.f39547h0 == 15) {
                            view = mf0Var.F;
                        } else {
                            view = mf0Var.f39565y;
                        }
                        if (qd0Var.getCurrentView() != view) {
                            qd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.bk0 bk0Var2 = mf0Var.f39559s;
                bk0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.yj0 yj0Var2 = mf0Var.Q;
                yj0Var2.N(0, false, false);
                yj0Var2.K(1);
                bk0Var2.setAnimation(yj0Var2);
                bk0Var2.d();
                return;
            case 5:
                try {
                    mf0Var.f39562u0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(mf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20678a;
                c2Var.R = string;
                c2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.sl.h(new StringBuilder("+"), mf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new hf0(mf0Var, 1));
                alertDialog$Builder.p();
                return;
            case 6:
                org.telegram.ui.Components.yj0 yj0Var3 = mf0Var.R;
                yj0Var3.f32957t0 = new ze0(mf0Var, 8);
                org.telegram.ui.Components.bk0 bk0Var3 = mf0Var.f39559s;
                bk0Var3.setAutoRepeat(false);
                yj0Var3.N(0, false, false);
                bk0Var3.setAnimation(yj0Var3);
                bk0Var3.d();
                return;
            case 7:
                mf0Var.postDelayed(new ze0(mf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ze0(mf0Var, 10));
                return;
            case 9:
                sr srVar2 = mf0Var.f39544f;
                srVar2.e = false;
                srVar2.f41793f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f41793f;
                    if (i11 < vrVarArr3.length) {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.bk0 bk0Var4 = mf0Var.f39559s;
                bk0Var4.setAutoRepeat(false);
                bk0Var4.setAnimation(mf0Var.f39536a);
                return;
        }
    }
}
