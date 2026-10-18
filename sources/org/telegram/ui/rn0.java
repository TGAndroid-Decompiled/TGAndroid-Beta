package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class rn0 extends org.telegram.ui.ActionBar.j {
    public final go0 f40760a;

    public rn0(go0 go0Var) {
        this.f40760a = go0Var;
    }

    @Override
    public final void b(int i10) {
        go0 go0Var = this.f40760a;
        if (i10 == -1) {
            if (!go0Var.P0) {
                go0Var.finishFragment();
            }
        } else if (i10 == 1 && !go0Var.P0) {
            if (go0Var.f37247u0 != 3) {
                AndroidUtilities.hideKeyboard(go0Var.getParentActivity().getCurrentFocus());
            }
            int i11 = go0Var.f37247u0;
            if (i11 != 0) {
                int i12 = 0;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 6) {
                                go0Var.A0(false);
                                return;
                            }
                            return;
                        }
                        go0.k0(go0Var);
                        return;
                    }
                    go0.j0(go0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.j6[] j6VarArr = go0Var.h;
                    if (i12 >= j6VarArr.length) {
                        break;
                    } else if (j6VarArr[i12].f22481b.f24337f) {
                        go0Var.G0 = go0Var.E0.shipping_options.get(i12);
                        break;
                    } else {
                        i12++;
                    }
                }
                go0Var.t0();
                return;
            }
            go0Var.D0(true);
            go0.m0(go0Var);
        }
    }
}
