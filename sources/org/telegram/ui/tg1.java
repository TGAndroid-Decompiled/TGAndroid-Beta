package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tg1 implements Runnable {
    public final int f40834a;
    public final bh1 f40835b;

    public tg1(bh1 bh1Var, int i10) {
        this.f40834a = i10;
        this.f40835b = bh1Var;
    }

    @Override
    public final void run() {
        switch (this.f40834a) {
            case 0:
                bh1 bh1Var = this.f40835b;
                EditTextBoldCursor editTextBoldCursor = bh1Var.f35109n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    bh1Var.f35109n.requestFocus();
                    AndroidUtilities.showKeyboard(bh1Var.f35109n);
                    return;
                }
                return;
            case 1:
                bh1 bh1Var2 = this.f40835b;
                be0 be0Var = bh1Var2.f35112w;
                if (be0Var != null && be0Var.getVisibility() == 0) {
                    bh1Var2.f35112w.f35549f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    es[] esVarArr = this.f40835b.f35112w.f35549f;
                    if (i10 < esVarArr.length) {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                bh1 bh1Var3 = this.f40835b;
                EditTextBoldCursor editTextBoldCursor2 = bh1Var3.f35109n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        bh1Var3.f35104f0[2].P(49);
                        bh1Var3.f35104f0[2].T(0.0f, false);
                        bh1Var3.f35094a.d();
                        return;
                    }
                    bh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                bh1 bh1Var4 = this.f40835b;
                if (bh1Var4.f35105g0 != null) {
                    bh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                bh1.f0(this.f40835b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tg1(this.f40835b, 7), 150L);
                return;
            default:
                for (es esVar : this.f40835b.f35112w.f35549f) {
                    esVar.i(0.0f);
                }
                return;
        }
    }
}
