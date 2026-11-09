package org.telegram.ui;

import org.telegram.ui.Components.EditTextBoldCursor;
public final class sa1 implements Runnable {
    public final int f49851a;
    public final bb1 f49852b;

    public sa1(bb1 bb1Var, int i7) {
        this.f49851a = i7;
        this.f49852b = bb1Var;
    }

    @Override
    public final void run() {
        switch (this.f49851a) {
            case 0:
                int i7 = 0;
                while (true) {
                    dr[] drVarArr = this.f49852b.f43969x.f43768f;
                    if (i7 < drVarArr.length) {
                        drVarArr[i7].z(0.0f);
                        i7++;
                    } else {
                        return;
                    }
                }
            case 1:
                bb1 bb1Var = this.f49852b;
                EditTextBoldCursor editTextBoldCursor = bb1Var.f43965n;
                if (editTextBoldCursor != null) {
                    if (editTextBoldCursor.length() != 0) {
                        bb1Var.f43960f0[2].P(49);
                        bb1Var.f43960f0[2].T(false, 0.0f);
                        bb1Var.f43950a.d();
                        return;
                    }
                    bb1Var.K0(true);
                    return;
                }
                return;
            case 2:
                bb1 bb1Var2 = this.f49852b;
                EditTextBoldCursor editTextBoldCursor2 = bb1Var2.f43965n;
                if (editTextBoldCursor2 != null && editTextBoldCursor2.getVisibility() == 0) {
                    bb1Var2.f43965n.requestFocus();
                    org.telegram.messenger.g0.K3(bb1Var2.f43965n);
                    return;
                }
                return;
            case 3:
                bb1 bb1Var3 = this.f49852b;
                nb0 nb0Var = bb1Var3.f43969x;
                if (nb0Var != null && nb0Var.getVisibility() == 0) {
                    bb1Var3.f43969x.f43768f[0].requestFocus();
                    return;
                }
                return;
            case 4:
                bb1 bb1Var4 = this.f49852b;
                if (bb1Var4.f43961g0 != null) {
                    bb1Var4.K0(false);
                    return;
                }
                return;
            case 5:
                bb1.k0(this.f49852b);
                return;
            case 6:
                org.telegram.messenger.g0.i3(new sa1(this.f49852b, 7), 150L);
                return;
            default:
                for (dr drVar : this.f49852b.f43969x.f43768f) {
                    drVar.z(0.0f);
                }
                return;
        }
    }
}
