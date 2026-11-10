package org.telegram.ui;
public final class yk0 extends org.telegram.ui.ActionBar.k {
    public final kl0 f52062a;

    public yk0(kl0 kl0Var) {
        this.f52062a = kl0Var;
    }

    @Override
    public final void b(int i7) {
        kl0 kl0Var = this.f52062a;
        if (i7 == -1) {
            if (!kl0Var.P0) {
                kl0Var.finishFragment();
            }
        } else if (i7 == 1 && !kl0Var.P0) {
            if (kl0Var.f47358u0 != 3) {
                org.telegram.messenger.g0.v1(kl0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = kl0Var.f47358u0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                kl0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        kl0.p0(kl0Var);
                        return;
                    }
                    kl0.o0(kl0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = kl0Var.h;
                    if (i11 >= i6VarArr.length) {
                        break;
                    } else if (i6VarArr[i11].f29326b.f31533f) {
                        kl0Var.G0 = kl0Var.E0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                kl0Var.z0();
                return;
            }
            kl0Var.J0(true);
            kl0.r0(kl0Var);
        }
    }
}
