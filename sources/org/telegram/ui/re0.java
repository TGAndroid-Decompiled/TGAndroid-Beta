package org.telegram.ui;
public final class re0 implements Runnable {
    public final int f41209a;
    public final s3 f41210b;

    public re0(s3 s3Var, int i10) {
        this.f41209a = i10;
        this.f41210b = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f41209a) {
            case 0:
                org.telegram.messenger.i0.g3(new re0(this.f41210b, 1));
                return;
            default:
                this.f41210b.a("CANCELLED");
                return;
        }
    }
}
