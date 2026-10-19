package org.telegram.ui;
public final class ue0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41938a;
    public final hf0 f41939b;

    public ue0(hf0 hf0Var, int i10) {
        this.f41938a = i10;
        this.f41939b = hf0Var;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41938a) {
            case 0:
                hf0 hf0Var = this.f41939b;
                hf0Var.c(true);
                hf0Var.f37610s0.u1(0, true, null, true);
                return;
            default:
                this.f41939b.f37610s0.u1(0, true, null, true);
                return;
        }
    }
}
