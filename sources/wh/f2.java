package wh;
public final class f2 implements Runnable {
    public final int f49744a;
    public final r3 f49745b;
    public final int f49746c;

    public f2(r3 r3Var, int i10, int i11) {
        this.f49744a = i11;
        this.f49745b = r3Var;
        this.f49746c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49744a) {
            case 0:
                this.f49745b.d4(this.f49746c);
                return;
            case 1:
                this.f49745b.f4(this.f49746c);
                return;
            case 2:
                this.f49745b.scrollBy(0, this.f49746c);
                return;
            default:
                this.f49745b.e4(this.f49746c);
                return;
        }
    }
}
