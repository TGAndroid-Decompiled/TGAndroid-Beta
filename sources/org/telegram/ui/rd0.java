package org.telegram.ui;
public final class rd0 implements Runnable {
    public final int f51558a;
    public final ce0 f51559b;

    public rd0(ce0 ce0Var, int i7) {
        this.f51558a = i7;
        this.f51559b = ce0Var;
    }

    @Override
    public final void run() {
        switch (this.f51558a) {
            case 0:
                ce0 ce0Var = this.f51559b;
                ae0 ae0Var = ce0Var.f46527a;
                de0 de0Var = ce0Var.f46539h0;
                ae0 ae0Var2 = ce0Var.f46529b;
                if (ae0Var2 != null) {
                    if (de0Var.f46929d0) {
                        ae0Var.clearFocus();
                        ae0Var2.clearFocus();
                    } else if (ae0Var.length() != 0) {
                        ae0Var2.requestFocus();
                        if (!ce0Var.U) {
                            ae0Var2.setSelection(ae0Var2.length());
                        }
                        de0.b1(de0Var, ae0Var2);
                    } else {
                        ae0Var.requestFocus();
                        de0.b1(de0Var, ae0Var);
                    }
                }
                if (de0Var.G == 0) {
                    ce0Var.s();
                    return;
                }
                return;
            case 1:
                ce0 ce0Var2 = this.f51559b;
                ce0Var2.postDelayed(new rd0(ce0Var2, 2), 200L);
                return;
            case 2:
                this.f51559b.h(null);
                return;
            case 3:
                this.f51559b.t(true);
                return;
            default:
                ce0 ce0Var3 = this.f51559b;
                de0.b1(ce0Var3.f46539h0, ce0Var3.f46529b);
                return;
        }
    }
}
