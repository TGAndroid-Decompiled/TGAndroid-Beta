package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52050a;
    public final tq f52051b;

    public sq(tq tqVar, int i7) {
        this.f52050a = i7;
        this.f52051b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52050a) {
            case 0:
                bi.c6 c6Var = this.f52051b.f33530a;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                    return;
                }
                return;
            default:
                bi.c6 c6Var2 = this.f52051b.f33530a;
                if (c6Var2 != null) {
                    c6Var2.f34607g3.O(true);
                    return;
                }
                return;
        }
    }
}
