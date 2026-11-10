package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class ta1 implements Runnable {
    public final int f50211a;
    public final cb1 f50212b;

    public ta1(cb1 cb1Var, int i7) {
        this.f50211a = i7;
        this.f50212b = cb1Var;
    }

    @Override
    public final void run() {
        switch (this.f50211a) {
            case 0:
                int i7 = 0;
                while (true) {
                    er[] erVarArr = this.f50212b.f44311x.f44118f;
                    if (i7 < erVarArr.length) {
                        erVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                cb1 cb1Var = this.f50212b;
                EditTextBoldCursor editTextBoldCursor = cb1Var.f44307n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        cb1Var.f44302f0[2].P(49);
                        cb1Var.f44302f0[2].T(false, 0.0f);
                        cb1Var.f44292a.d();
                        return;
                    }
                    cb1Var.K0(true);
                    return;
                }
                return;
            case 2:
                cb1 cb1Var2 = this.f50212b;
                EditTextBoldCursor editTextBoldCursor2 = cb1Var2.f44307n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    cb1Var2.f44307n.requestFocus();
                    org.telegram.messenger.g0.K3(cb1Var2.f44307n);
                    return;
                }
                return;
            case 3:
                cb1 cb1Var3 = this.f50212b;
                ob0 ob0Var = cb1Var3.f44311x;
                if (ob0Var != null && ob0Var.getVisibility() == 0) {
                    cb1Var3.f44311x.f44118f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                cb1 cb1Var4 = this.f50212b;
                if (cb1Var4.f44303g0 != null) {
                    cb1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                cb1.k0(this.f50212b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new ta1(this.f50212b, 7), 150L);
                return;
            default:
                for (er erVar : this.f50212b.f44311x.f44118f) {
                    erVar.z(0.0f);
                }
                return;
        }
    }
}
