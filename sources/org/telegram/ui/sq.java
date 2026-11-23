package org.telegram.ui;
public final class sq implements Runnable {
    public final int f52071a;
    public final tq f52072b;

    public sq(tq tqVar, int i7) {
        this.f52071a = i7;
        this.f52072b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f52071a) {
            case 0:
                bi.i6 i6Var = this.f52072b.f34671a;
                if (i6Var != null) {
                    i6Var.f35742g3.O(true);
                    return;
                }
                return;
            default:
                bi.i6 i6Var2 = this.f52072b.f34671a;
                if (i6Var2 != null) {
                    i6Var2.f35742g3.O(true);
                    return;
                }
                return;
        }
    }
}
