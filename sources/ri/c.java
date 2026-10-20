package ri;
public final class c implements Runnable {
    public final int f45804a;
    public final o f45805b;
    public final i f45806c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f45804a = i10;
        this.f45805b = oVar;
        this.f45806c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f45804a) {
            case 0:
                k kVar = this.f45805b.f45836g;
                i iVar = this.f45806c;
                kVar.onOutputCompleted(iVar.f45815a, iVar.f45816b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f45805b.f45836g;
                i iVar2 = this.f45806c;
                kVar2.onBytesAvailable(iVar2.f45815a, iVar2.f45816b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f45805b.f45836g;
                i iVar3 = this.f45806c;
                kVar3.onOutputCompleted(iVar3.f45815a, iVar3.f45816b, this.d, this.e);
                return;
        }
    }
}
