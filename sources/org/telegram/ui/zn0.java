package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class zn0 extends org.telegram.ui.ActionBar.j {
    public final oo0 f40547a;

    public zn0(oo0 oo0Var) {
        this.f40547a = oo0Var;
    }

    @Override
    public final void b(int i10) {
        oo0 oo0Var = this.f40547a;
        if (i10 == -1) {
            if (!oo0Var.P0) {
                oo0Var.finishFragment();
            }
        } else if (i10 == 1 && !oo0Var.P0) {
            if (oo0Var.f36308u0 != 3) {
                AndroidUtilities.hideKeyboard(oo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = oo0Var.f36308u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                oo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        oo0.k0(oo0Var);
                        return;
                    }
                    oo0.j0(oo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = oo0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f20581b.f22384f) {
                        oo0Var.G0 = oo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                oo0Var.t0();
                return;
            }
            oo0Var.D0(true);
            oo0.m0(oo0Var);
        }
    }
}
