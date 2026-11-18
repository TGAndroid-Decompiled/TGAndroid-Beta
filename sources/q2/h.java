package q2;
public final class h implements Runnable {
    public final int f55754a;
    public final j f55755b;
    public final Object f55756c;

    public h(j jVar, k kVar, int i7) {
        this.f55754a = i7;
        this.f55755b = jVar;
        this.f55756c = kVar;
    }

    @Override
    public final void run() {
        switch (this.f55754a) {
            case 0:
                j jVar = this.f55755b;
                this.f55756c.z(jVar.f55759a, jVar.f55760b);
                return;
            default:
                j jVar2 = this.f55755b;
                this.f55756c.w(jVar2.f55759a, jVar2.f55760b);
                return;
        }
    }
}
