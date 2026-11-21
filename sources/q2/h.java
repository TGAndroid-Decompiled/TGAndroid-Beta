package q2;
public final class h implements Runnable {
    public final int f55795a;
    public final j f55796b;
    public final Object f55797c;

    public h(j jVar, k kVar, int i7) {
        this.f55795a = i7;
        this.f55796b = jVar;
        this.f55797c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f55795a) {
            case 0:
                j jVar = this.f55796b;
                this.f55797c.z(jVar.f55800a, jVar.f55801b);
                return;
            default:
                j jVar2 = this.f55796b;
                this.f55797c.w(jVar2.f55800a, jVar2.f55801b);
                return;
        }
    }
}
