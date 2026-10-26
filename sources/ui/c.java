package ui;
public final class c implements Runnable {
    public final int f49921a;
    public final o f49922b;
    public final i f49923c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f49921a = i10;
        this.f49922b = oVar;
        this.f49923c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f49921a) {
            case 0:
                k kVar = this.f49922b.f49953g;
                i iVar = this.f49923c;
                kVar.onOutputCompleted(iVar.f49932a, iVar.f49933b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f49922b.f49953g;
                i iVar2 = this.f49923c;
                kVar2.onBytesAvailable(iVar2.f49932a, iVar2.f49933b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f49922b.f49953g;
                i iVar3 = this.f49923c;
                kVar3.onOutputCompleted(iVar3.f49932a, iVar3.f49933b, this.d, this.e);
                return;
        }
    }
}
