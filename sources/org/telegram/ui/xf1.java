package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xf1 implements Runnable {
    public final int f45677a;
    public final fg1 f45678b;

    public xf1(fg1 fg1Var, int i10) {
        this.f45677a = i10;
        this.f45678b = fg1Var;
    }

    @Override
    public final void run() {
        switch (this.f45677a) {
            case 0:
                fg1 fg1Var = this.f45678b;
                EditTextBoldCursor editTextBoldCursor = fg1Var.f39373n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    fg1Var.f39373n.requestFocus();
                    AndroidUtilities.showKeyboard(fg1Var.f39373n);
                    return;
                }
                return;
            case 1:
                fg1 fg1Var2 = this.f45678b;
                nd0 nd0Var = fg1Var2.f39376w;
                if (nd0Var != null && nd0Var.getVisibility() == 0) {
                    fg1Var2.f39376w.f45772f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    zr[] zrVarArr = this.f45678b.f39376w.f45772f;
                    if (i10 < zrVarArr.length) {
                        zrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                fg1 fg1Var3 = this.f45678b;
                EditTextBoldCursor editTextBoldCursor2 = fg1Var3.f39373n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        fg1Var3.f39368f0[2].P(49);
                        fg1Var3.f39368f0[2].T(0.0f, false);
                        fg1Var3.f39359a.d();
                        return;
                    }
                    fg1Var3.G0(true);
                    return;
                }
                return;
            case 4:
                fg1 fg1Var4 = this.f45678b;
                if (fg1Var4.f39369g0 != null) {
                    fg1Var4.G0(false);
                    return;
                }
                return;
            case 5:
                fg1.g0(this.f45678b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new xf1(this.f45678b, 7), 150L);
                return;
            default:
                for (zr zrVar : this.f45678b.f39376w.f45772f) {
                    zrVar.i(0.0f);
                }
                return;
        }
    }
}
