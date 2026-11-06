package q2;
public final class h implements Runnable {
    public final int f53614a;
    public final j f53615b;
    public final Object f53616c;

    public h(j jVar, k kVar, int i7) {
        this.f53614a = i7;
        this.f53615b = jVar;
        this.f53616c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53614a) {
            case 0:
                j jVar = this.f53615b;
                this.f53616c.z(jVar.f53619a, jVar.f53620b);
                return;
            default:
                j jVar2 = this.f53615b;
                this.f53616c.w(jVar2.f53619a, jVar2.f53620b);
                return;
        }
    }
}
