package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue0 implements Runnable {
    public final int f41985a;
    public final jf0 f41986b;

    public ue0(jf0 jf0Var, int i10) {
        this.f41985a = i10;
        this.f41986b = jf0Var;
    }

    @Override
    public final void run() {
        vr[] vrVarArr;
        View view;
        int i10 = this.f41985a;
        int i11 = 0;
        jf0 jf0Var = this.f41986b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.xj0 xj0Var = jf0Var.G;
                sr srVar = jf0Var.f38158f;
                int i12 = jf0Var.f38159f0;
                if (i12 != 3 && (vrVarArr = srVar.f41512f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f41512f[length].length() != 0) {
                            srVar.f41512f[length].requestFocus();
                            vr vrVar = srVar.f41512f[length];
                            vrVar.setSelection(vrVar.length());
                            fg0.T0(jf0Var.f38174s0, srVar.f41512f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.uj0 uj0Var = jf0Var.f38150a;
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
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 6));
                return;
            case 2:
                nd0 nd0Var = jf0Var.f38175w;
                jf0Var.f38170q0 = false;
                while (true) {
                    vr[] vrVarArr2 = jf0Var.f38158f.f41512f;
                    if (i11 < vrVarArr2.length) {
                        vrVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (jf0Var.f38159f0 == 15) {
                            view = jf0Var.F;
                        } else {
                            view = jf0Var.f38177y;
                        }
                        if (nd0Var.getCurrentView() != view) {
                            nd0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.xj0 xj0Var2 = jf0Var.f38173s;
                xj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.uj0 uj0Var2 = jf0Var.O;
                uj0Var2.N(0, false, false);
                uj0Var2.K(1);
                xj0Var2.setAnimation(uj0Var2);
                xj0Var2.d();
                return;
            case 5:
                try {
                    jf0Var.f38174s0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20608a;
                b2Var.R = string;
                b2Var.T = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.kk.g(new StringBuilder("+"), jf0Var.d, jf.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                b2Var.setOnDismissListener(new df0(jf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.uj0 uj0Var3 = jf0Var.P;
                uj0Var3.f31032t0 = new ue0(jf0Var, 8);
                org.telegram.ui.Components.xj0 xj0Var3 = jf0Var.f38173s;
                xj0Var3.setAutoRepeat(false);
                uj0Var3.N(0, false, false);
                xj0Var3.setAnimation(uj0Var3);
                xj0Var3.d();
                return;
            case 7:
                jf0Var.postDelayed(new ue0(jf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ue0(jf0Var, 10));
                return;
            case 9:
                sr srVar2 = jf0Var.f38158f;
                srVar2.e = false;
                srVar2.f41512f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f41512f;
                    if (i11 < vrVarArr3.length) {
                        vrVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.xj0 xj0Var4 = jf0Var.f38173s;
                xj0Var4.setAutoRepeat(false);
                xj0Var4.setAnimation(jf0Var.f38150a);
                return;
        }
    }
}
