package ri;
public final class c implements Runnable {
    public final int f45807a;
    public final o f45808b;
    public final i f45809c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f45807a = i10;
        this.f45808b = oVar;
        this.f45809c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45807a) {
            case 0:
                k kVar = this.f45808b.f45839g;
                i iVar = this.f45809c;
                kVar.onOutputCompleted(iVar.f45818a, iVar.f45819b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f45808b.f45839g;
                i iVar2 = this.f45809c;
                kVar2.onBytesAvailable(iVar2.f45818a, iVar2.f45819b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f45808b.f45839g;
                i iVar3 = this.f45809c;
                kVar3.onOutputCompleted(iVar3.f45818a, iVar3.f45819b, this.d, this.e);
                return;
        }
    }
}
