package wh;
public final class l2 implements Runnable {
    public final int f49860a;
    public final r3 f49861b;
    public final int f49862c;
    public final int d;

    public l2(r3 r3Var, int i10, int i11, int i12) {
        this.f49860a = i12;
        this.f49861b = r3Var;
        this.f49862c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f49860a) {
            case 0:
                this.f49861b.Y1(this.f49862c, this.d);
                return;
            default:
                this.f49861b.g4(this.f49862c, this.d);
                return;
        }
    }
}
