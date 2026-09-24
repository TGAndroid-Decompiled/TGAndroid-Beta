package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg1 implements Runnable {
    public final int f37319a;
    public final zg1 f37320b;

    public rg1(zg1 zg1Var, int i10) {
        this.f37319a = i10;
        this.f37320b = zg1Var;
    }

    @Override
    public final void run() {
        switch (this.f37319a) {
            case 0:
                zg1 zg1Var = this.f37320b;
                EditTextBoldCursor editTextBoldCursor = zg1Var.f40468n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zg1Var.f40468n.requestFocus();
                    AndroidUtilities.showKeyboard(zg1Var.f40468n);
                    return;
                }
                return;
            case 1:
                zg1 zg1Var2 = this.f37320b;
                xd0 xd0Var = zg1Var2.f40471w;
                if (xd0Var != null && xd0Var.getVisibility() == 0) {
                    zg1Var2.f40471w.f40221f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    as[] asVarArr = this.f37320b.f40471w.f40221f;
                    if (i10 < asVarArr.length) {
                        asVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zg1 zg1Var3 = this.f37320b;
                EditTextBoldCursor editTextBoldCursor2 = zg1Var3.f40468n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zg1Var3.f40463f0[2].P(49);
                        zg1Var3.f40463f0[2].T(0.0f, false);
                        zg1Var3.f40454a.d();
                        return;
                    }
                    zg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                zg1 zg1Var4 = this.f37320b;
                if (zg1Var4.f40464g0 != null) {
                    zg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                zg1.f0(this.f37320b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rg1(this.f37320b, 7), 150L);
                return;
            default:
                for (as asVar : this.f37320b.f40471w.f40221f) {
                    asVar.i(0.0f);
                }
                return;
        }
    }
}
