package org.telegram.ui;
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final jl0 f51685a;

    public xk0(jl0 jl0Var) {
        this.f51685a = jl0Var;
    }

    @Override
    public final void b(int i7) {
        jl0 jl0Var = this.f51685a;
        if (i7 == -1) {
            if (!jl0Var.P0) {
                jl0Var.finishFragment();
            }
        } else if (i7 == 1 && !jl0Var.P0) {
            if (jl0Var.f47026u0 != 3) {
                org.telegram.messenger.g0.v1(jl0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = jl0Var.f47026u0;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 6) {
                                jl0Var.G0(false);
                                return;
                            }
                            return;
                        }
                        jl0.p0(jl0Var);
                        return;
                    }
                    jl0.o0(jl0Var);
                    return;
                }
                while (true) {
                    org.telegram.ui.Cells.i6[] i6VarArr = jl0Var.h;
                    if (i11 >= i6VarArr.length) {
                        break;
                    } else if (i6VarArr[i11].f29315b.f31522f) {
                        jl0Var.G0 = jl0Var.E0.shipping_options.get(i11);
                        break;
                    } else {
                        i11++;
                    }
                }
                jl0Var.z0();
                return;
            }
            jl0Var.J0(true);
            jl0.r0(jl0Var);
        }
    }
}
