package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52048a;
    public final tq f52049b;

    public sq(tq tqVar, int i7) {
        this.f52048a = i7;
        this.f52049b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52048a) {
            case 0:
                bi.d6 d6Var = this.f52049b.f33530a;
                if (d6Var != null) {
                    d6Var.f34607g3.O(true);
                    return;
                }
                return;
            default:
                bi.d6 d6Var2 = this.f52049b.f33530a;
                if (d6Var2 != null) {
                    d6Var2.f34607g3.O(true);
                    return;
                }
                return;
        }
    }
}
