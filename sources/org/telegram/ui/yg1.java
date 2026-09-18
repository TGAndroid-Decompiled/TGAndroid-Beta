package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class yg1 implements Runnable {
    public final int f39821a;
    public final gh1 f39822b;

    public yg1(gh1 gh1Var, int i10) {
        this.f39821a = i10;
        this.f39822b = gh1Var;
    }

    @Override
    public final void run() {
        switch (this.f39821a) {
            case 0:
                gh1 gh1Var = this.f39822b;
                EditTextBoldCursor editTextBoldCursor = gh1Var.f33860n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    gh1Var.f33860n.requestFocus();
                    AndroidUtilities.showKeyboard(gh1Var.f33860n);
                    return;
                }
                return;
            case 1:
                gh1 gh1Var2 = this.f39822b;
                ee0 ee0Var = gh1Var2.f33863w;
                if (ee0Var != null && ee0Var.getVisibility() == 0) {
                    gh1Var2.f33863w.f33074f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    gs[] gsVarArr = this.f39822b.f33863w.f33074f;
                    if (i10 < gsVarArr.length) {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                gh1 gh1Var3 = this.f39822b;
                EditTextBoldCursor editTextBoldCursor2 = gh1Var3.f33860n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        gh1Var3.f33855f0[2].P(49);
                        gh1Var3.f33855f0[2].T(0.0f, false);
                        gh1Var3.f33846a.d();
                        return;
                    }
                    gh1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                gh1 gh1Var4 = this.f39822b;
                if (gh1Var4.f33856g0 != null) {
                    gh1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                gh1.f0(this.f39822b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new yg1(this.f39822b, 7), 150L);
                return;
            default:
                for (gs gsVar : this.f39822b.f33863w.f33074f) {
                    gsVar.i(0.0f);
                }
                return;
        }
    }
}
