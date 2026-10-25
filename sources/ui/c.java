package ui;
public final class c implements Runnable {
    public final int f49918a;
    public final o f49919b;
    public final i f49920c;
    public final long d;
    public final long e;

    public c(o oVar, i iVar, long j10, long j11, int i10) {
        this.f49918a = i10;
        this.f49919b = oVar;
        this.f49920c = iVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f49918a) {
            case 0:
                k kVar = this.f49919b.f49950g;
                i iVar = this.f49920c;
                kVar.onOutputCompleted(iVar.f49929a, iVar.f49930b, this.d, this.e);
                return;
            case 1:
                k kVar2 = this.f49919b.f49950g;
                i iVar2 = this.f49920c;
                kVar2.onBytesAvailable(iVar2.f49929a, iVar2.f49930b, this.d, this.e);
                return;
            default:
                k kVar3 = this.f49919b.f49950g;
                i iVar3 = this.f49920c;
                kVar3.onOutputCompleted(iVar3.f49929a, iVar3.f49930b, this.d, this.e);
                return;
        }
    }
}
