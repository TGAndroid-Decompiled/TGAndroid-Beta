package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f43685a;
    public final z21 f43686b;

    public y21(z21 z21Var, int i10) {
        this.f43685a = i10;
        this.f43686b = z21Var;
    }

    @Override
    public final void run() {
        switch (this.f43685a) {
            case 0:
                z21.a(this.f43686b);
                return;
            default:
                this.f43686b.dismiss();
                return;
        }
    }
}
