package ri;
public final class c implements Runnable {
    public final int f45822a;
    public final p f45823b;
    public final j f45824c;
    public final long d;
    public final long e;

    public c(p pVar, j jVar, long j10, long j11, int i10) {
        this.f45822a = i10;
        this.f45823b = pVar;
        this.f45824c = jVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45822a) {
            case 0:
                l lVar = this.f45823b.f45856f;
                j jVar = this.f45824c;
                lVar.onOutputCompleted(jVar.f45836a, jVar.f45837b, this.d, this.e);
                return;
            case 1:
                l lVar2 = this.f45823b.f45856f;
                j jVar2 = this.f45824c;
                lVar2.onBytesAvailable(jVar2.f45836a, jVar2.f45837b, this.d, this.e);
                return;
            default:
                l lVar3 = this.f45823b.f45856f;
                j jVar3 = this.f45824c;
                lVar3.onOutputCompleted(jVar3.f45836a, jVar3.f45837b, this.d, this.e);
                return;
        }
    }
}
