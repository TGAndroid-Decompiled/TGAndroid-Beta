package ri;
public final class c implements Runnable {
    public final int f46229a;
    public final o f46230b;
    public final i f46231c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f46229a = i10;
        this.f46230b = oVar;
        this.f46231c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f46229a) {
            case 0:
                k kVar = this.f46230b.f46261g;
                i iVar = this.f46231c;
                kVar.onOutputCompleted(iVar.f46240a, iVar.f46241b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f46230b.f46261g;
                i iVar2 = this.f46231c;
                kVar2.onBytesAvailable(iVar2.f46240a, iVar2.f46241b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f46230b.f46261g;
                i iVar3 = this.f46231c;
                kVar3.onOutputCompleted(iVar3.f46240a, iVar3.f46241b, this.d, this.e);
                return;
        }
    }
}
