package wh;
public final class f2 implements Runnable {
    public final int f49743a;
    public final r3 f49744b;
    public final int f49745c;

    public f2(r3 r3Var, int i10, int i11) {
        this.f49743a = i11;
        this.f49744b = r3Var;
        this.f49745c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49743a) {
            case 0:
                this.f49744b.d4(this.f49745c);
                return;
            case 1:
                this.f49744b.f4(this.f49745c);
                return;
            case 2:
                this.f49744b.scrollBy(0, this.f49745c);
                return;
            default:
                this.f49744b.e4(this.f49745c);
                return;
        }
    }
}
