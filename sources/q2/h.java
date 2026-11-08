package q2;
public final class h implements Runnable {
    public final int f53731a;
    public final j f53732b;
    public final Object f53733c;

    public h(j jVar, k kVar, int i7) {
        this.f53731a = i7;
        this.f53732b = jVar;
        this.f53733c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53731a) {
            case 0:
                j jVar = this.f53732b;
                this.f53733c.z(jVar.f53736a, jVar.f53737b);
                return;
            default:
                j jVar2 = this.f53732b;
                this.f53733c.w(jVar2.f53736a, jVar2.f53737b);
                return;
        }
    }
}
