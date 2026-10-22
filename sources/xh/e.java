package xh;
public final class e implements Runnable {
    public final int f49848a;
    public final k f49849b;

    public e(k kVar, int i10) {
        this.f49848a = i10;
        this.f49849b = kVar;
    }

    @Override
    public final void run() {
        switch (this.f49848a) {
            case 0:
                this.f49849b.e();
                return;
            case 1:
                k.k(this.f49849b.f49879q, true, true);
                return;
            default:
                this.f49849b.e();
                return;
        }
    }
}
