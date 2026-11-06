package q2;
public final class h implements Runnable {
    public final int f53638a;
    public final j f53639b;
    public final Object f53640c;

    public h(j jVar, k kVar, int i7) {
        this.f53638a = i7;
        this.f53639b = jVar;
        this.f53640c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53638a) {
            case 0:
                j jVar = this.f53639b;
                this.f53640c.z(jVar.f53643a, jVar.f53644b);
                return;
            default:
                j jVar2 = this.f53639b;
                this.f53640c.w(jVar2.f53643a, jVar2.f53644b);
                return;
        }
    }
}
