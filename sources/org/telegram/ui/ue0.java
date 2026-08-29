package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ue0 implements Runnable {
    public final int f43246a;
    public final if0 f43247b;

    public ue0(if0 if0Var, int i10) {
        this.f43246a = i10;
        this.f43247b = if0Var;
    }

    @Override
    public final void run() {
        ur[] urVarArr;
        View view;
        int i10 = this.f43246a;
        int i11 = 0;
        if0 if0Var = this.f43247b;
        switch (i10) {
            case 0:
                org.telegram.ui.Components.aj0 aj0Var = if0Var.C;
                sr srVar = if0Var.f39239f;
                int i12 = if0Var.f39233b0;
                if (i12 != 3 && (urVarArr = srVar.f42455f) != null) {
                    for (int length = urVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f42455f[length].length() != 0) {
                            srVar.f42455f[length].requestFocus();
                            ur urVar = srVar.f42455f[length];
                            urVar.setSelection(urVar.length());
                            fg0.T0(if0Var.f39249o0, srVar.f42455f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.xi0 xi0Var = if0Var.f39230a;
                if (xi0Var != null) {
                    xi0Var.start();
                }
                if (i12 == 15) {
                    aj0Var.getAnimatedDrawable().L(0, false, false);
                    aj0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 6));
                return;
            case 2:
                od0 od0Var = if0Var.f39252w;
                if0Var.m0 = false;
                while (true) {
                    ur[] urVarArr2 = if0Var.f39239f.f42455f;
                    if (i11 < urVarArr2.length) {
                        urVarArr2[i11].i(0.0f);
                        i11++;
                    } else {
                        if (if0Var.f39233b0 == 15) {
                            view = if0Var.B;
                        } else {
                            view = if0Var.f39254y;
                        }
                        if (od0Var.getCurrentView() != view) {
                            od0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.aj0 aj0Var2 = if0Var.f39251s;
                aj0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.xi0 xi0Var2 = if0Var.K;
                xi0Var2.L(0, false, false);
                xi0Var2.I(1);
                aj0Var2.setAnimation(xi0Var2);
                aj0Var2.d();
                return;
            case 5:
                try {
                    if0Var.f39249o0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(if0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.x3.k(new StringBuilder("+"), if0Var.d, qe.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new df0(if0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.xi0 xi0Var3 = if0Var.L;
                xi0Var3.f34751q0 = new ue0(if0Var, 8);
                org.telegram.ui.Components.aj0 aj0Var3 = if0Var.f39251s;
                aj0Var3.setAutoRepeat(false);
                xi0Var3.L(0, false, false);
                aj0Var3.setAnimation(xi0Var3);
                aj0Var3.d();
                return;
            case 7:
                if0Var.postDelayed(new ue0(if0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ue0(if0Var, 10));
                return;
            case 9:
                sr srVar2 = if0Var.f39239f;
                srVar2.f42454e = false;
                srVar2.f42455f[0].requestFocus();
                while (true) {
                    ur[] urVarArr3 = srVar2.f42455f;
                    if (i11 < urVarArr3.length) {
                        urVarArr3[i11].i(0.0f);
                        i11++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.aj0 aj0Var4 = if0Var.f39251s;
                aj0Var4.setAutoRepeat(false);
                aj0Var4.setAnimation(if0Var.f39230a);
                return;
        }
    }
}
