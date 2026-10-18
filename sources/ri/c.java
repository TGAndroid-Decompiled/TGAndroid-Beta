package ri;
public final class c implements Runnable {
    public final int f45842a;
    public final p f45843b;
    public final j f45844c;
    public final long d;
    public final long e;

    public c(p pVar, j jVar, long j10, long j11, int i10) {
        this.f45842a = i10;
        this.f45843b = pVar;
        this.f45844c = jVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45842a) {
            case 0:
                l lVar = this.f45843b.f45876f;
                j jVar = this.f45844c;
                lVar.onOutputCompleted(jVar.f45856a, jVar.f45857b, this.d, this.e);
                return;
            case 1:
                l lVar2 = this.f45843b.f45876f;
                j jVar2 = this.f45844c;
                lVar2.onBytesAvailable(jVar2.f45856a, jVar2.f45857b, this.d, this.e);
                return;
            default:
                l lVar3 = this.f45843b.f45876f;
                j jVar3 = this.f45844c;
                lVar3.onOutputCompleted(jVar3.f45856a, jVar3.f45857b, this.d, this.e);
                return;
        }
    }
}
