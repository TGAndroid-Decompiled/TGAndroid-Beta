package q2;
public final class h implements Runnable {
    public final int f53744a;
    public final j f53745b;
    public final Object f53746c;

    public h(j jVar, k kVar, int i7) {
        this.f53744a = i7;
        this.f53745b = jVar;
        this.f53746c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53744a) {
            case 0:
                j jVar = this.f53745b;
                this.f53746c.z(jVar.f53749a, jVar.f53750b);
                return;
            default:
                j jVar2 = this.f53745b;
                this.f53746c.w(jVar2.f53749a, jVar2.f53750b);
                return;
        }
    }
}
