package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class vn0 extends org.telegram.ui.ActionBar.j {
    public final jo0 f39225a;

    public vn0(jo0 jo0Var) {
        this.f39225a = jo0Var;
    }

    @Override
    public final void b(int i10) {
        jo0 jo0Var = this.f39225a;
        if (i10 == -1) {
            if (!jo0Var.M0) {
                jo0Var.finishFragment();
            }
        } else if (i10 == 1 && !jo0Var.M0) {
            if (jo0Var.f35413r0 != 3) {
                AndroidUtilities.hideKeyboard(jo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = jo0Var.f35413r0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                jo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        jo0.k0(jo0Var);
                        return;
                    }
                    jo0.j0(jo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = jo0Var.h;
                    if (i12 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i12].f21263b.f23149f) {
                        jo0Var.D0 = jo0Var.B0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                jo0Var.t0();
                return;
            }
            jo0Var.D0(true);
            jo0.m0(jo0Var);
        }
    }
}
