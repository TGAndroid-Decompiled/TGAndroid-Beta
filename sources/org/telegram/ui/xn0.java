package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class xn0 extends org.telegram.ui.ActionBar.j {
    public final lo0 f40035a;

    public xn0(lo0 lo0Var) {
        this.f40035a = lo0Var;
    }

    @Override
    public final void b(int i10) {
        lo0 lo0Var = this.f40035a;
        if (i10 == -1) {
            if (!lo0Var.M0) {
                lo0Var.finishFragment();
            }
        } else if (i10 == 1 && !lo0Var.M0) {
            if (lo0Var.f35840r0 != 3) {
                AndroidUtilities.hideKeyboard(lo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = lo0Var.f35840r0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                lo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        lo0.k0(lo0Var);
                        return;
                    }
                    lo0.j0(lo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = lo0Var.h;
                    if (i12 >= i6VarArr.length) {
                        break;
                    } else if (i6VarArr[i12].f21189b.f23122f) {
                        lo0Var.D0 = lo0Var.B0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                lo0Var.t0();
                return;
            }
            lo0Var.D0(true);
            lo0.m0(lo0Var);
        }
    }
}
