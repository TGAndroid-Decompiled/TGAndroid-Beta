package ri;
public final class c implements Runnable {
    public final int f45794a;
    public final p f45795b;
    public final j f45796c;
    public final long d;
    public final long e;

    public c(p pVar, j jVar, long j10, long j11, int i10) {
        this.f45794a = i10;
        this.f45795b = pVar;
        this.f45796c = jVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45794a) {
            case 0:
                l lVar = this.f45795b.f45828f;
                j jVar = this.f45796c;
                lVar.onOutputCompleted(jVar.f45808a, jVar.f45809b, this.d, this.e);
                return;
            case 1:
                l lVar2 = this.f45795b.f45828f;
                j jVar2 = this.f45796c;
                lVar2.onBytesAvailable(jVar2.f45808a, jVar2.f45809b, this.d, this.e);
                return;
            default:
                l lVar3 = this.f45795b.f45828f;
                j jVar3 = this.f45796c;
                lVar3.onOutputCompleted(jVar3.f45808a, jVar3.f45809b, this.d, this.e);
                return;
        }
    }
}
