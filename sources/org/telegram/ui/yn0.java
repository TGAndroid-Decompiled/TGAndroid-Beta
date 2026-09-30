package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class yn0 extends org.telegram.ui.ActionBar.j {
    public final no0 f40304a;

    public yn0(no0 no0Var) {
        this.f40304a = no0Var;
    }

    @Override
    public final void b(int i10) {
        no0 no0Var = this.f40304a;
        if (i10 == -1) {
            if (!no0Var.P0) {
                no0Var.finishFragment();
            }
        } else if (i10 == 1 && !no0Var.P0) {
            if (no0Var.f36081u0 != 3) {
                AndroidUtilities.hideKeyboard(no0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = no0Var.f36081u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                no0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        no0.k0(no0Var);
                        return;
                    }
                    no0.j0(no0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = no0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f20598b.f22406f) {
                        no0Var.G0 = no0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                no0Var.t0();
                return;
            }
            no0Var.D0(true);
            no0.m0(no0Var);
        }
    }
}
