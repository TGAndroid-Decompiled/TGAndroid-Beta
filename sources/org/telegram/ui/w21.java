package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f38688a;
    public final y21 f38689b;
    public final int f38690c;
    public final int d;

    public w21(y21 y21Var, int i10, int i11, int i12) {
        this.f38688a = i12;
        this.f38689b = y21Var;
        this.f38690c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f38688a) {
            case 0:
                this.f38689b.b(this.f38690c, this.d);
                return;
            case 1:
                this.f38689b.b(this.f38690c, this.d);
                return;
            default:
                this.f38689b.b(this.f38690c, this.d);
                return;
        }
    }
}
