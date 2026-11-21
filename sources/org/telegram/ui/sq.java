package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52095a;
    public final tq f52096b;

    public sq(tq tqVar, int i7) {
        this.f52095a = i7;
        this.f52096b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52095a) {
            case 0:
                bi.g6 g6Var = this.f52096b.f34683a;
                if (g6Var != null) {
                    g6Var.f35796g3.O(true);
                    return;
                }
                return;
            default:
                bi.g6 g6Var2 = this.f52096b.f34683a;
                if (g6Var2 != null) {
                    g6Var2.f35796g3.O(true);
                    return;
                }
                return;
        }
    }
}
