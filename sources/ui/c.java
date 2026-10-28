package ui;
public final class c implements Runnable {
    public final int f49956a;
    public final o f49957b;
    public final i f49958c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f49956a = i10;
        this.f49957b = oVar;
        this.f49958c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f49956a) {
            case 0:
                k kVar = this.f49957b.f49988g;
                i iVar = this.f49958c;
                kVar.onOutputCompleted(iVar.f49967a, iVar.f49968b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f49957b.f49988g;
                i iVar2 = this.f49958c;
                kVar2.onBytesAvailable(iVar2.f49967a, iVar2.f49968b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f49957b.f49988g;
                i iVar3 = this.f49958c;
                kVar3.onOutputCompleted(iVar3.f49967a, iVar3.f49968b, this.d, this.e);
                return;
        }
    }
}
