package ri;
public final class c implements Runnable {
    public final int f44719a;
    public final q f44720b;
    public final k f44721c;
    public final long d;
    public final long e;

    public c(q qVar, k kVar, long j10, long j11, int i10) {
        this.f44719a = i10;
        this.f44720b = qVar;
        this.f44721c = kVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f44719a) {
            case 0:
                m mVar = this.f44720b.f44756f;
                k kVar = this.f44721c;
                mVar.onOutputCompleted(kVar.f44736a, kVar.f44737b, this.d, this.e);
                return;
            case 1:
                m mVar2 = this.f44720b.f44756f;
                k kVar2 = this.f44721c;
                mVar2.onBytesAvailable(kVar2.f44736a, kVar2.f44737b, this.d, this.e);
                return;
            default:
                m mVar3 = this.f44720b.f44756f;
                k kVar3 = this.f44721c;
                mVar3.onOutputCompleted(kVar3.f44736a, kVar3.f44737b, this.d, this.e);
                return;
        }
    }
}
