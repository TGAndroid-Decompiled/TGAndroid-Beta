package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class sn0 extends org.telegram.ui.ActionBar.j {
    public final ho0 f41771a;

    public sn0(ho0 ho0Var) {
        this.f41771a = ho0Var;
    }

    @Override
    public final void b(int i10) {
        ho0 ho0Var = this.f41771a;
        if (i10 == -1) {
            if (!ho0Var.P0) {
                ho0Var.finishFragment();
            }
        } else if (i10 == 1 && !ho0Var.P0) {
            if (ho0Var.f37946u0 != 3) {
                AndroidUtilities.hideKeyboard(ho0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = ho0Var.f37946u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                ho0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        ho0.k0(ho0Var);
                        return;
                    }
                    ho0.j0(ho0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.k6[] k6VarArr = ho0Var.h;
                    if (i12 >= k6VarArr.length) {
                        break;
                    } else if (k6VarArr[i12].f22637b.f24488f) {
                        ho0Var.G0 = ho0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                ho0Var.t0();
                return;
            }
            ho0Var.D0(true);
            ho0.m0(ho0Var);
        }
    }
}
