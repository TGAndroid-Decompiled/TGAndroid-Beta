package vh;
public final class f2 implements Runnable {
    public final int f45969a;
    public final s3 f45970b;
    public final int f45971c;

    public f2(s3 s3Var, int i10, int i11) {
        this.f45969a = i11;
        this.f45970b = s3Var;
        this.f45971c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45969a) {
            case 0:
                this.f45970b.c4(this.f45971c);
                return;
            case 1:
                this.f45970b.e4(this.f45971c);
                return;
            case 2:
                this.f45970b.scrollBy(0, this.f45971c);
                return;
            default:
                this.f45970b.d4(this.f45971c);
                return;
        }
    }
}
