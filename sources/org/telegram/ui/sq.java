package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52099a;
    public final tq f52100b;

    public sq(tq tqVar, int i7) {
        this.f52099a = i7;
        this.f52100b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52099a) {
            case 0:
                bi.f6 f6Var = this.f52100b.f34681a;
                if (f6Var != null) {
                    f6Var.f35790g3.O(true);
                    return;
                }
                return;
            default:
                bi.f6 f6Var2 = this.f52100b.f34681a;
                if (f6Var2 != null) {
                    f6Var2.f35790g3.O(true);
                    return;
                }
                return;
        }
    }
}
