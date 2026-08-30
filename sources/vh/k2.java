package vh;
public final class k2 implements Runnable {
    public final int f45975a;
    public final r3 f45976b;
    public final int f45977c;
    public final int d;

    public k2(r3 r3Var, int i10, int i11, int i12) {
        this.f45975a = i12;
        this.f45976b = r3Var;
        this.f45977c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f45975a) {
            case 0:
                this.f45976b.Y1(this.f45977c, this.d);
                return;
            default:
                this.f45976b.g4(this.f45977c, this.d);
                return;
        }
    }
}
