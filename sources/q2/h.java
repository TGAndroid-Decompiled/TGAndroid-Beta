package q2;
public final class h implements Runnable {
    public final int f55764a;
    public final j f55765b;
    public final Object f55766c;

    public h(j jVar, k kVar, int i7) {
        this.f55764a = i7;
        this.f55765b = jVar;
        this.f55766c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f55764a) {
            case 0:
                j jVar = this.f55765b;
                this.f55766c.z(jVar.f55769a, jVar.f55770b);
                return;
            default:
                j jVar2 = this.f55765b;
                this.f55766c.w(jVar2.f55769a, jVar2.f55770b);
                return;
        }
    }
}
