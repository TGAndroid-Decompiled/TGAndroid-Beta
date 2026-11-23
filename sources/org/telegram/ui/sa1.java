package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class sa1 implements Runnable {
    public final int f51959a;
    public final bb1 f51960b;

    public sa1(bb1 bb1Var, int i7) {
        this.f51959a = i7;
        this.f51960b = bb1Var;
    }

    @Override
    public final void run() {
        switch (this.f51959a) {
            case 0:
                int i7 = 0;
                while (true) {
                    er[] erVarArr = this.f51960b.f45803x.f46275f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                bb1 bb1Var = this.f51960b;
                EditTextBoldCursor editTextBoldCursor = bb1Var.f45799n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        bb1Var.f45794g0[2].P(49);
                        bb1Var.f45794g0[2].T(false, 0.0f);
                        bb1Var.f45783a.d();
                        return;
                    }
                    bb1Var.K0(true);
                    return;
                }
                return;
            case 2:
                bb1 bb1Var2 = this.f51960b;
                EditTextBoldCursor editTextBoldCursor2 = bb1Var2.f45799n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    bb1Var2.f45799n.requestFocus();
                    org.telegram.messenger.g0.I3(bb1Var2.f45799n);
                    return;
                }
                return;
            case 3:
                bb1 bb1Var3 = this.f51960b;
                mb0 mb0Var = bb1Var3.f45803x;
                if (mb0Var != null && mb0Var.getVisibility() == 0) {
                    bb1Var3.f45803x.f46275f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                bb1 bb1Var4 = this.f51960b;
                if (bb1Var4.f45795h0 != null) {
                    bb1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                bb1.k0(this.f51960b);
                return;
            case 6:
                org.telegram.messenger.g0.h3(new sa1(this.f51960b, 7), 150L);
                return;
            default:
                for (er erVar : this.f51960b.f45803x.f46275f) {
                    erVar.A(0.0f);
                }
                return;
        }
    }
}
