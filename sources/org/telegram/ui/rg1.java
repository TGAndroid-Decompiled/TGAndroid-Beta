package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class rg1 implements Runnable {
    public final int f36846a;
    public final zg1 f36847b;

    public rg1(zg1 zg1Var, int i10) {
        this.f36846a = i10;
        this.f36847b = zg1Var;
    }

    @Override
    public final void run() {
        switch (this.f36846a) {
            case 0:
                zg1 zg1Var = this.f36847b;
                EditTextBoldCursor editTextBoldCursor = zg1Var.f40141n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    zg1Var.f40141n.requestFocus();
                    AndroidUtilities.showKeyboard(zg1Var.f40141n);
                    return;
                }
                return;
            case 1:
                zg1 zg1Var2 = this.f36847b;
                yd0 yd0Var = zg1Var2.f40144w;
                if (yd0Var != null && yd0Var.getVisibility() == 0) {
                    zg1Var2.f40144w.f40230f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    bs[] bsVarArr = this.f36847b.f40144w.f40230f;
                    if (i10 < bsVarArr.length) {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                zg1 zg1Var3 = this.f36847b;
                EditTextBoldCursor editTextBoldCursor2 = zg1Var3.f40141n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        zg1Var3.f40136f0[2].P(49);
                        zg1Var3.f40136f0[2].T(0.0f, false);
                        zg1Var3.f40127a.d();
                        return;
                    }
                    zg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                zg1 zg1Var4 = this.f36847b;
                if (zg1Var4.f40137g0 != null) {
                    zg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                zg1.f0(this.f36847b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new rg1(this.f36847b, 7), 150L);
                return;
            default:
                for (bs bsVar : this.f36847b.f40144w.f40230f) {
                    bsVar.i(0.0f);
                }
                return;
        }
    }
}
