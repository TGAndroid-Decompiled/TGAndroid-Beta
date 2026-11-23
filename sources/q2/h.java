package q2;
public final class h implements Runnable {
    public final int f55877a;
    public final j f55878b;
    public final Object f55879c;

    public h(j jVar, k kVar, int i7) {
        this.f55877a = i7;
        this.f55878b = jVar;
        this.f55879c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f55877a) {
            case 0:
                j jVar = this.f55878b;
                this.f55879c.z(jVar.f55882a, jVar.f55883b);
                return;
            default:
                j jVar2 = this.f55878b;
                this.f55879c.w(jVar2.f55882a, jVar2.f55883b);
                return;
        }
    }
}
