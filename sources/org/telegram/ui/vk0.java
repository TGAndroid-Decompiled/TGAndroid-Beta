package org.telegram.ui;
public final class vk0 extends org.telegram.ui.ActionBar.j {
    public final hl0 f50695a;

    public vk0(hl0 hl0Var) {
        this.f50695a = hl0Var;
    }

    @Override
    public final void b(int i7) {
        hl0 hl0Var = this.f50695a;
        if (i7 == -1) {
            if (!hl0Var.P0) {
                hl0Var.finishFragment();
            }
        } else if (i7 == 1 && !hl0Var.P0) {
            if (hl0Var.f46438u0 != 3) {
                org.telegram.messenger.g0.v1(hl0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = hl0Var.f46438u0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                hl0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        hl0.p0(hl0Var);
                        return;
                    }
                    hl0.o0(hl0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = hl0Var.h;
                    if (i11 >= i6VarArr.length) {
                        break;
                    } else if (i6VarArr[i11].f29311b.f31517f) {
                        hl0Var.G0 = hl0Var.E0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                hl0Var.z0();
                return;
            }
            hl0Var.J0(true);
            hl0.r0(hl0Var);
        }
    }
}
