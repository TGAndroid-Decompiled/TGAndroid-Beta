package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qn0 extends org.telegram.ui.ActionBar.j {
    public final fo0 f40478a;

    public qn0(fo0 fo0Var) {
        this.f40478a = fo0Var;
    }

    @Override
    public final void b(int i10) {
        fo0 fo0Var = this.f40478a;
        if (i10 == -1) {
            if (!fo0Var.P0) {
                fo0Var.finishFragment();
            }
        } else if (i10 == 1 && !fo0Var.P0) {
            if (fo0Var.f37002u0 != 3) {
                AndroidUtilities.hideKeyboard(fo0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = fo0Var.f37002u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                fo0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        fo0.k0(fo0Var);
                        return;
                    }
                    fo0.j0(fo0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = fo0Var.h;
                    if (i12 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i12].f22484b.f24337f) {
                        fo0Var.G0 = fo0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                fo0Var.t0();
                return;
            }
            fo0Var.D0(true);
            fo0.m0(fo0Var);
        }
    }
}
