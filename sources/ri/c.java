package ri;
public final class c implements Runnable {
    public final int f45808a;
    public final o f45809b;
    public final i f45810c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f45808a = i10;
        this.f45809b = oVar;
        this.f45810c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45808a) {
            case 0:
                k kVar = this.f45809b.f45840g;
                i iVar = this.f45810c;
                kVar.onOutputCompleted(iVar.f45819a, iVar.f45820b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f45809b.f45840g;
                i iVar2 = this.f45810c;
                kVar2.onBytesAvailable(iVar2.f45819a, iVar2.f45820b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f45809b.f45840g;
                i iVar3 = this.f45810c;
                kVar3.onOutputCompleted(iVar3.f45819a, iVar3.f45820b, this.d, this.e);
                return;
        }
    }
}
