package q2;
public final class h implements Runnable {
    public final int f55799a;
    public final j f55800b;
    public final Object f55801c;

    public h(j jVar, k kVar, int i7) {
        this.f55799a = i7;
        this.f55800b = jVar;
        this.f55801c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f55799a) {
            case 0:
                j jVar = this.f55800b;
                this.f55801c.z(jVar.f55804a, jVar.f55805b);
                return;
            default:
                j jVar2 = this.f55800b;
                this.f55801c.w(jVar2.f55804a, jVar2.f55805b);
                return;
        }
    }
}
