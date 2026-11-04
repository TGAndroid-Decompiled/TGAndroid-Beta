package org.telegram.ui;
public final class rk0 extends org.telegram.ui.ActionBar.j {
    public final dl0 f49240a;

    public rk0(dl0 dl0Var) {
        this.f49240a = dl0Var;
    }

    @Override
    public final void b(int i3) {
        dl0 dl0Var = this.f49240a;
        if (i3 == -1) {
            if (!dl0Var.Q0) {
                dl0Var.finishFragment();
            }
        } else if (i3 == 1 && !dl0Var.Q0) {
            if (dl0Var.f44771v0 != 3) {
                org.telegram.messenger.g0.v1(dl0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = dl0Var.f44771v0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                dl0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        dl0.p0(dl0Var);
                        return;
                    }
                    dl0.o0(dl0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.h6[] h6VarArr = dl0Var.h;
                    if (i11 >= h6VarArr.length) {
                        break;
                    } else if (h6VarArr[i11].f29346b.f31589f) {
                        dl0Var.H0 = dl0Var.F0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                dl0Var.z0();
                return;
            }
            dl0Var.J0(true);
            dl0.r0(dl0Var);
        }
    }
}
