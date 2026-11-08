package q2;
public final class h implements Runnable {
    public final int f53732a;
    public final j f53733b;
    public final Object f53734c;

    public h(j jVar, k kVar, int i7) {
        this.f53732a = i7;
        this.f53733b = jVar;
        this.f53734c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53732a) {
            case 0:
                j jVar = this.f53733b;
                this.f53734c.z(jVar.f53737a, jVar.f53738b);
                return;
            default:
                j jVar2 = this.f53733b;
                this.f53734c.w(jVar2.f53737a, jVar2.f53738b);
                return;
        }
    }
}
