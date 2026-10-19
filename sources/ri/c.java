package ri;
public final class c implements Runnable {
    public final int f45796a;
    public final p f45797b;
    public final j f45798c;
    public final long d;
    public final long e;

    public c(p pVar, j jVar, long j10, long j11, int i10) {
        this.f45796a = i10;
        this.f45797b = pVar;
        this.f45798c = jVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45796a) {
            case 0:
                l lVar = this.f45797b.f45830f;
                j jVar = this.f45798c;
                lVar.onOutputCompleted(jVar.f45810a, jVar.f45811b, this.d, this.e);
                return;
            case 1:
                l lVar2 = this.f45797b.f45830f;
                j jVar2 = this.f45798c;
                lVar2.onBytesAvailable(jVar2.f45810a, jVar2.f45811b, this.d, this.e);
                return;
            default:
                l lVar3 = this.f45797b.f45830f;
                j jVar3 = this.f45798c;
                lVar3.onOutputCompleted(jVar3.f45810a, jVar3.f45811b, this.d, this.e);
                return;
        }
    }
}
