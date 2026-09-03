package wh;
public final class l2 implements Runnable {
    public final int f49897a;
    public final r3 f49898b;
    public final int f49899c;
    public final int d;

    public l2(r3 r3Var, int i10, int i11, int i12) {
        this.f49897a = i12;
        this.f49898b = r3Var;
        this.f49899c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f49897a) {
            case 0:
                this.f49898b.X1(this.f49899c, this.d);
                return;
            default:
                this.f49898b.f4(this.f49899c, this.d);
                return;
        }
    }
}
