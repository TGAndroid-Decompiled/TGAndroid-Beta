package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class uf1 implements Runnable {
    public final int f43254a;
    public final cg1 f43255b;

    public uf1(cg1 cg1Var, int i10) {
        this.f43254a = i10;
        this.f43255b = cg1Var;
    }

    @Override
    public final void run() {
        switch (this.f43254a) {
            case 0:
                cg1 cg1Var = this.f43255b;
                EditTextBoldCursor editTextBoldCursor = cg1Var.f37115n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    cg1Var.f37115n.requestFocus();
                    AndroidUtilities.showKeyboard(cg1Var.f37115n);
                    return;
                }
                return;
            case 1:
                cg1 cg1Var2 = this.f43255b;
                md0 md0Var = cg1Var2.f37118w;
                if (md0Var != null && md0Var.getVisibility() == 0) {
                    cg1Var2.f37118w.f42455f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    ur[] urVarArr = this.f43255b.f37118w.f42455f;
                    if (i10 < urVarArr.length) {
                        urVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                cg1 cg1Var3 = this.f43255b;
                EditTextBoldCursor editTextBoldCursor2 = cg1Var3.f37115n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        cg1Var3.f37107b0[2].N(49);
                        cg1Var3.f37107b0[2].Q(0.0f, false);
                        cg1Var3.f37104a.d();
                        return;
                    }
                    cg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                cg1 cg1Var4 = this.f43255b;
                if (cg1Var4.f37109c0 != null) {
                    cg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                cg1.f0(this.f43255b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new uf1(this.f43255b, 7), 150L);
                return;
            default:
                for (ur urVar : this.f43255b.f37118w.f42455f) {
                    urVar.i(0.0f);
                }
                return;
        }
    }
}
