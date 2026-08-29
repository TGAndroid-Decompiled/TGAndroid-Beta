package org.telegram.ui;
public final class t11 implements Runnable {
    public final int f42526a;
    public final v11 f42527b;
    public final int f42528c;
    public final int d;

    public t11(v11 v11Var, int i10, int i11, int i12) {
        this.f42526a = i12;
        this.f42527b = v11Var;
        this.f42528c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42526a) {
            case 0:
                this.f42527b.b(this.f42528c, this.d);
                return;
            case 1:
                this.f42527b.b(this.f42528c, this.d);
                return;
            default:
                this.f42527b.b(this.f42528c, this.d);
                return;
        }
    }
}
