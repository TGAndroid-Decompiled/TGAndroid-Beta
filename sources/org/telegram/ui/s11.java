package org.telegram.ui;
public final class s11 implements Runnable {
    public final int f42534a;
    public final u11 f42535b;
    public final int f42536c;
    public final int d;

    public s11(u11 u11Var, int i9, int i10, int i11) {
        this.f42534a = i11;
        this.f42535b = u11Var;
        this.f42536c = i9;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f42534a) {
            case 0:
                this.f42535b.b(this.f42536c, this.d);
                return;
            case 1:
                this.f42535b.b(this.f42536c, this.d);
                return;
            default:
                this.f42535b.b(this.f42536c, this.d);
                return;
        }
    }
}
