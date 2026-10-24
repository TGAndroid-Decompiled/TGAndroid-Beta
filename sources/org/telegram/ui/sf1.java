package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class sf1 implements Runnable {
    public final int f41390a;
    public final ag1 f41391b;

    public sf1(ag1 ag1Var, int i10) {
        this.f41390a = i10;
        this.f41391b = ag1Var;
    }

    @Override
    public final void run() {
        switch (this.f41390a) {
            case 0:
                ag1 ag1Var = this.f41391b;
                EditTextBoldCursor editTextBoldCursor = ag1Var.f35772n;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    ag1Var.f35772n.requestFocus();
                    AndroidUtilities.showKeyboard(ag1Var.f35772n);
                    return;
                }
                return;
            case 1:
                ag1 ag1Var2 = this.f41391b;
                nd0 nd0Var = ag1Var2.f35775w;
                if (nd0Var != null && nd0Var.getVisibility() == 0) {
                    ag1Var2.f35775w.f41792f[0].requestFocus();
                    return;
                }
                return;
            case 2:
                int i10 = 0;
                while (true) {
                    vr[] vrVarArr = this.f41391b.f35775w.f41792f;
                    if (i10 < vrVarArr.length) {
                        vrVarArr[i10].i(0.0f);
                        i10++;
                    } else {
                        return;
                    }
                }
            case 3:
                ag1 ag1Var3 = this.f41391b;
                EditTextBoldCursor editTextBoldCursor2 = ag1Var3.f35772n;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        ag1Var3.f35767f0[2].P(49);
                        ag1Var3.f35767f0[2].T(0.0f, false);
                        ag1Var3.f35758a.d();
                        return;
                    }
                    ag1Var3.F0(true);
                    return;
                }
                return;
            case 4:
                ag1 ag1Var4 = this.f41391b;
                if (ag1Var4.f35768g0 != null) {
                    ag1Var4.F0(false);
                    return;
                }
                return;
            case 5:
                ag1.f0(this.f41391b);
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new sf1(this.f41391b, 7), 150L);
                return;
            default:
                for (vr vrVar : this.f41391b.f35775w.f41792f) {
                    vrVar.i(0.0f);
                }
                return;
        }
    }
}
