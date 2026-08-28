package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ve0 implements Runnable {
    public final int f43463a;
    public final jf0 f43464b;

    public ve0(jf0 jf0Var, int i9) {
        this.f43463a = i9;
        this.f43464b = jf0Var;
    }

    @Override
    public final void run() {
        vr[] vrVarArr;
        View view;
        int i9 = this.f43463a;
        int i10 = 0;
        jf0 jf0Var = this.f43464b;
        switch (i9) {
            case 0:
                org.telegram.ui.Components.pi0 pi0Var = jf0Var.C;
                sr srVar = jf0Var.f39478f;
                int i11 = jf0Var.f39472b0;
                if (i11 != 3 && (vrVarArr = srVar.f42755f) != null) {
                    for (int length = vrVarArr.length - 1; length >= 0; length--) {
                        if (length == 0 || srVar.f42755f[length].length() != 0) {
                            srVar.f42755f[length].requestFocus();
                            vr vrVar = srVar.f42755f[length];
                            vrVar.setSelection(vrVar.length());
                            fg0.T0(jf0Var.f39488o0, srVar.f42755f[length]);
                        }
                    }
                }
                org.telegram.ui.Components.mi0 mi0Var = jf0Var.f39469a;
                if (mi0Var != null) {
                    mi0Var.start();
                }
                if (i11 == 15) {
                    pi0Var.getAnimatedDrawable().L(0, false, false);
                    pi0Var.getAnimatedDrawable().start();
                    return;
                }
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 6));
                return;
            case 2:
                od0 od0Var = jf0Var.f39491w;
                jf0Var.m0 = false;
                while (true) {
                    vr[] vrVarArr2 = jf0Var.f39478f.f42755f;
                    if (i10 < vrVarArr2.length) {
                        vrVarArr2[i10].i(0.0f);
                        i10++;
                    } else {
                        if (jf0Var.f39472b0 == 15) {
                            view = jf0Var.B;
                        } else {
                            view = jf0Var.f39493y;
                        }
                        if (od0Var.getCurrentView() != view) {
                            od0Var.showNext();
                            return;
                        }
                        return;
                    }
                }
            case 3:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 4));
                return;
            case 4:
                org.telegram.ui.Components.pi0 pi0Var2 = jf0Var.f39490s;
                pi0Var2.setAutoRepeat(true);
                org.telegram.ui.Components.mi0 mi0Var2 = jf0Var.K;
                mi0Var2.L(0, false, false);
                mi0Var2.I(1);
                pi0Var2.setAnimation(mi0Var2);
                pi0Var2.d();
                return;
            case 5:
                try {
                    jf0Var.f39488o0.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jf0Var.getContext());
                String string = LocaleController.getString(R.string.YourPasswordSuccess);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, org.telegram.messenger.ll.g(new StringBuilder("+"), jf0Var.d, ne.b.c()));
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                c2Var.setOnDismissListener(new ff0(jf0Var, 1));
                alertDialog$Builder.o();
                return;
            case 6:
                org.telegram.ui.Components.mi0 mi0Var3 = jf0Var.L;
                mi0Var3.f30861q0 = new ve0(jf0Var, 8);
                org.telegram.ui.Components.pi0 pi0Var3 = jf0Var.f39490s;
                pi0Var3.setAutoRepeat(false);
                mi0Var3.L(0, false, false);
                pi0Var3.setAnimation(mi0Var3);
                pi0Var3.d();
                return;
            case 7:
                jf0Var.postDelayed(new ve0(jf0Var, 9), 150L);
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ve0(jf0Var, 10));
                return;
            case 9:
                sr srVar2 = jf0Var.f39478f;
                srVar2.f42754e = false;
                srVar2.f42755f[0].requestFocus();
                while (true) {
                    vr[] vrVarArr3 = srVar2.f42755f;
                    if (i10 < vrVarArr3.length) {
                        vrVarArr3[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            default:
                org.telegram.ui.Components.pi0 pi0Var4 = jf0Var.f39490s;
                pi0Var4.setAutoRepeat(false);
                pi0Var4.setAnimation(jf0Var.f39469a);
                return;
        }
    }
}
