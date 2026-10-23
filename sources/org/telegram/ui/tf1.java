package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class tf1 implements Runnable {
    public final int f41998a;
    public final bg1 f41999b;

    public tf1(bg1 bg1Var, int i10) {
        this.f41998a = i10;
        this.f41999b = bg1Var;
    }

    @Override
    public final void run() {
        switch (this.f41998a) {
            case 0:
                bg1 bg1Var = this.f41999b;
                EditTextBoldCursor editTextBoldCursor = bg1Var.f36094n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    bg1Var.f36094n.requestFocus();
                    AndroidUtilities.showKeyboard(bg1Var.f36094n);
                    return;
                }
                return;
            case 1:
                bg1 bg1Var2 = this.f41999b;
                od0 od0Var = bg1Var2.f36097w;
                if (od0Var != null && od0Var.getVisibility() == 0) {
                    bg1Var2.f36097w.f41793f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.f41999b.f36097w.f41793f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                bg1 bg1Var3 = this.f41999b;
                EditTextBoldCursor editTextBoldCursor2 = bg1Var3.f36094n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        bg1Var3.f36089f0[2].P(49);
                        bg1Var3.f36089f0[2].T(0.0f, false);
                        bg1Var3.f36080a.d();
                        return;
                    }
                    bg1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                bg1 bg1Var4 = this.f41999b;
                if (bg1Var4.f36090g0 != null) {
                    bg1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                bg1.f0(this.f41999b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new tf1(this.f41999b, 7), 150L);
                return;
            default:
                for (vr vrVar : this.f41999b.f36097w.f41793f) {
                    vrVar.i(0.0f);
                }
                return;
        }
    }
}
