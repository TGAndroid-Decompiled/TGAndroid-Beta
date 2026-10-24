package ri;
public final class c implements Runnable {
    public final int f46228a;
    public final o f46229b;
    public final i f46230c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f46228a = i10;
        this.f46229b = oVar;
        this.f46230c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f46228a) {
            case 0:
                k kVar = this.f46229b.f46260g;
                i iVar = this.f46230c;
                kVar.onOutputCompleted(iVar.f46239a, iVar.f46240b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f46229b.f46260g;
                i iVar2 = this.f46230c;
                kVar2.onBytesAvailable(iVar2.f46239a, iVar2.f46240b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f46229b.f46260g;
                i iVar3 = this.f46230c;
                kVar3.onOutputCompleted(iVar3.f46239a, iVar3.f46240b, this.d, this.e);
                return;
        }
    }
}
