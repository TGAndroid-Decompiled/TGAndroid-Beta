package org.telegram.ui;
public final class v21 implements Runnable {
    public final int f42861a;
    public final x21 f42862b;
    public final int f42863c;
    public final int d;

    public v21(x21 x21Var, int i10, int i11, int i12) {
        this.f42861a = i12;
        this.f42862b = x21Var;
        this.f42863c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f42861a) {
            case 0:
                this.f42862b.b(this.f42863c, this.d);
                return;
            case 1:
                this.f42862b.b(this.f42863c, this.d);
                return;
            default:
                this.f42862b.b(this.f42863c, this.d);
                return;
        }
    }
}
