package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52130a;
    public final tq f52131b;

    public sq(tq tqVar, int i7) {
        this.f52130a = i7;
        this.f52131b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52130a) {
            case 0:
                bi.i6 i6Var = this.f52131b.f34213a;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                    return;
                }
                return;
            default:
                bi.i6 i6Var2 = this.f52131b.f34213a;
                if (i6Var2 != null) {
                    i6Var2.f35323g3.O(true);
                    return;
                }
                return;
        }
    }
}
