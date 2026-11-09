package org.telegram.ui;
public final class rq implements Runnable {
    public final int f49557a;
    public final sq f49558b;

    public rq(sq sqVar, int i7) {
        this.f49557a = i7;
        this.f49558b = sqVar;
    }

    @Override
    public final void run() {
        switch (this.f49557a) {
            case 0:
                fi.w3 w3Var = this.f49558b.f36649a;
                if (w3Var != null) {
                    w3Var.f37556f3.O(true);
                    return;
                }
                return;
            default:
                fi.w3 w3Var2 = this.f49558b.f36649a;
                if (w3Var2 != null) {
                    w3Var2.f37556f3.O(true);
                    return;
                }
                return;
        }
    }
}
