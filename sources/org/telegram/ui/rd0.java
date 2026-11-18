package org.telegram.ui;
public final class rd0 implements Runnable {
    public final int f51593a;
    public final ce0 f51594b;

    public rd0(ce0 ce0Var, int i7) {
        this.f51593a = i7;
        this.f51594b = ce0Var;
    }

    @Override
    public final void run() {
        switch (this.f51593a) {
            case 0:
                ce0 ce0Var = this.f51594b;
                ae0 ae0Var = ce0Var.f46500a;
                de0 de0Var = ce0Var.f46512h0;
                ae0 ae0Var2 = ce0Var.f46502b;
                if (ae0Var2 != null) {
                    if (de0Var.f46939d0) {
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
                ce0 ce0Var2 = this.f51594b;
                ce0Var2.postDelayed(new rd0(ce0Var2, 2), 200L);
                return;
            case 2:
                this.f51594b.h(null);
                return;
            case 3:
                this.f51594b.t(true);
                return;
            default:
                ce0 ce0Var3 = this.f51594b;
                de0.b1(ce0Var3.f46512h0, ce0Var3.f46502b);
                return;
        }
    }
}
