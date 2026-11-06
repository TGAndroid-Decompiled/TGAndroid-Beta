package q2;
public final class h implements Runnable {
    public final int f53639a;
    public final j f53640b;
    public final Object f53641c;

    public h(j jVar, k kVar, int i7) {
        this.f53639a = i7;
        this.f53640b = jVar;
        this.f53641c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53639a) {
            case 0:
                j jVar = this.f53640b;
                this.f53641c.z(jVar.f53644a, jVar.f53645b);
                return;
            default:
                j jVar2 = this.f53640b;
                this.f53641c.w(jVar2.f53644a, jVar2.f53645b);
                return;
        }
    }
}
