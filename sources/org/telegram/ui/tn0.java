package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class tn0 extends org.telegram.ui.ActionBar.j {
    public final io0 f42047a;

    public tn0(io0 io0Var) {
        this.f42047a = io0Var;
    }

    @Override
    public final void b(int i10) {
        io0 io0Var = this.f42047a;
        if (i10 == -1) {
            if (!io0Var.P0) {
                io0Var.finishFragment();
            }
        } else if (i10 == 1 && !io0Var.P0) {
            if (io0Var.f38319u0 != 3) {
                AndroidUtilities.hideKeyboard(io0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = io0Var.f38319u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                io0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        io0.k0(io0Var);
                        return;
                    }
                    io0.j0(io0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = io0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f22636b.f24487f) {
                        io0Var.G0 = io0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                io0Var.t0();
                return;
            }
            io0Var.D0(true);
            io0.m0(io0Var);
        }
    }
}
