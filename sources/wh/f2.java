package wh;
public final class f2 implements Runnable {
    public final int f49780a;
    public final r3 f49781b;
    public final int f49782c;

    public f2(r3 r3Var, int i10, int i11) {
        this.f49780a = i11;
        this.f49781b = r3Var;
        this.f49782c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49780a) {
            case 0:
                this.f49781b.c4(this.f49782c);
                return;
            case 1:
                this.f49781b.e4(this.f49782c);
                return;
            case 2:
                this.f49781b.scrollBy(0, this.f49782c);
                return;
            default:
                this.f49781b.d4(this.f49782c);
                return;
        }
    }
}
