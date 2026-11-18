package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class sa1 implements Runnable {
    public final int f51949a;
    public final bb1 f51950b;

    public sa1(bb1 bb1Var, int i7) {
        this.f51949a = i7;
        this.f51950b = bb1Var;
    }

    @Override
    public final void run() {
        switch (this.f51949a) {
            case 0:
                int i7 = 0;
                while (true) {
                    er[] erVarArr = this.f51950b.f45832x.f46283f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].A(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                bb1 bb1Var = this.f51950b;
                EditTextBoldCursor editTextBoldCursor = bb1Var.f45828n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        bb1Var.f45823g0[2].P(49);
                        bb1Var.f45823g0[2].T(false, 0.0f);
                        bb1Var.f45812a.d();
                        return;
                    }
                    bb1Var.K0(true);
                    return;
                }
                return;
            case 2:
                bb1 bb1Var2 = this.f51950b;
                EditTextBoldCursor editTextBoldCursor2 = bb1Var2.f45828n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    bb1Var2.f45828n.requestFocus();
                    org.telegram.messenger.g0.I3(bb1Var2.f45828n);
                    return;
                }
                return;
            case 3:
                bb1 bb1Var3 = this.f51950b;
                lb0 lb0Var = bb1Var3.f45832x;
                if (lb0Var != null && lb0Var.getVisibility() == 0) {
                    bb1Var3.f45832x.f46283f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                bb1 bb1Var4 = this.f51950b;
                if (bb1Var4.f45824h0 != null) {
                    bb1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                bb1.k0(this.f51950b);
                return;
            case 6:
                org.telegram.messenger.g0.h3(new sa1(this.f51950b, 7), 150L);
                return;
            default:
                for (er erVar : this.f51950b.f45832x.f46283f) {
                    erVar.A(0.0f);
                }
                return;
        }
    }
}
