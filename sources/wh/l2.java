package wh;
public final class l2 implements Runnable {
    public final int f49861a;
    public final r3 f49862b;
    public final int f49863c;
    public final int d;

    public l2(r3 r3Var, int i10, int i11, int i12) {
        this.f49861a = i12;
        this.f49862b = r3Var;
        this.f49863c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f49861a) {
            case 0:
                this.f49862b.Y1(this.f49863c, this.d);
                return;
            default:
                this.f49862b.g4(this.f49863c, this.d);
                return;
        }
    }
}
