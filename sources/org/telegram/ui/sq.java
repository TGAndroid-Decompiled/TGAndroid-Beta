package org.telegram.ui;
public final class sq implements Runnable {
    public final int f49911a;
    public final tq f49912b;

    public sq(tq tqVar, int i7) {
        this.f49911a = i7;
        this.f49912b = tqVar;
    }

    @Override
    public final void run() {
        switch (this.f49911a) {
            case 0:
                fi.w3 w3Var = this.f49912b.f36518a;
                if (w3Var != null) {
                    w3Var.f37496f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f49912b.f36518a;
                if (w3Var2 != null) {
                    w3Var2.f37496f3.O(true);
                    return;
                }
                return;
        }
    }
}
