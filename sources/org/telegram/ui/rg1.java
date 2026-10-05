package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg1 implements Runnable {
    public final int f40098a;
    public final zg1 f40099b;

    public rg1(zg1 zg1Var, int i10) {
        this.f40098a = i10;
        this.f40099b = zg1Var;
    }

    @Override
    public final void run() {
        switch (this.f40098a) {
            case 0:
                zg1 zg1Var = this.f40099b;
                EditTextBoldCursor editTextBoldCursor = zg1Var.f43791n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zg1Var.f43791n.requestFocus();
                    AndroidUtilities.showKeyboard(zg1Var.f43791n);
                    return;
                }
                return;
            case 1:
                zg1 zg1Var2 = this.f40099b;
                be0 be0Var = zg1Var2.f43794w;
                if (be0Var != null && be0Var.getVisibility() == 0) {
                    zg1Var2.f43794w.f35541f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.f40099b.f43794w.f35541f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zg1 zg1Var3 = this.f40099b;
                EditTextBoldCursor editTextBoldCursor2 = zg1Var3.f43791n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zg1Var3.f43786f0[2].P(49);
                        zg1Var3.f43786f0[2].T(0.0f, false);
                        zg1Var3.f43776a.d();
                        return;
                    }
                    zg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                zg1 zg1Var4 = this.f40099b;
                if (zg1Var4.f43787g0 != null) {
                    zg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                zg1.f0(this.f40099b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rg1(this.f40099b, 7), 150L);
                return;
            default:
                for (es esVar : this.f40099b.f43794w.f35541f) {
                    esVar.i(0.0f);
                }
                return;
        }
    }
}
