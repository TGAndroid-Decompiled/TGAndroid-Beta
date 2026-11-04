package p2;
public final class h implements Runnable {
    public final int f53110a;
    public final j f53111b;
    public final Object f53112c;

    public h(j jVar, k kVar, int i3) {
        this.f53110a = i3;
        this.f53111b = jVar;
        this.f53112c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f53110a) {
            case 0:
                j jVar = this.f53111b;
                this.f53112c.b(jVar.f53115a, jVar.f53116b);
                return;
            default:
                j jVar2 = this.f53111b;
                this.f53112c.I(jVar2.f53115a, jVar2.f53116b);
                return;
        }
    }
}
