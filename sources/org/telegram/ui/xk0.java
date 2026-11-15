package org.telegram.ui;
public final class xk0 extends org.telegram.ui.ActionBar.j {
    public final jl0 f53259a;

    public xk0(jl0 jl0Var) {
        this.f53259a = jl0Var;
    }

    @Override
    public final void b(int i7) {
        jl0 jl0Var = this.f53259a;
        if (i7 == -1) {
            if (!jl0Var.Q0) {
                jl0Var.finishFragment();
            }
        } else if (i7 == 1 && !jl0Var.Q0) {
            if (jl0Var.f48417v0 != 3) {
                org.telegram.messenger.g0.v1(jl0Var.getParentActivity().getCurrentFocus());
            }
            int i10 = jl0Var.f48417v0;
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
                    org.telegram.ui.Cells.h6[] h6VarArr = jl0Var.h;
                    if (i11 >= h6VarArr.length) {
                        break;
                    } else if (h6VarArr[i11].f30405b.f32696f) {
                        jl0Var.H0 = jl0Var.F0.shipping_options.get(i11);
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
