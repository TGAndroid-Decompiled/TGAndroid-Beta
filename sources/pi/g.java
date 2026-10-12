package pi;
public final class g implements Runnable {
    public final int f45786a;
    public final t f45787b;
    public final n f45788c;
    public final long d;
    public final long f45789e;

    public g(t tVar, n nVar, long j3, long j10, int i10) {
        this.f45786a = i10;
        this.f45787b = tVar;
        this.f45788c = nVar;
        this.d = j3;
        this.f45789e = j10;
    }

    @Override
    public final void run() {
        switch (this.f45786a) {
            case 0:
                p pVar = this.f45787b.f45824f;
                n nVar = this.f45788c;
                pVar.onBytesAvailable(nVar.f45801a, nVar.f45802b, this.d, this.f45789e);
                return;
            case 1:
                p pVar2 = this.f45787b.f45824f;
                n nVar2 = this.f45788c;
                pVar2.onOutputCompleted(nVar2.f45801a, nVar2.f45802b, this.d, this.f45789e);
                return;
            default:
                p pVar3 = this.f45787b.f45824f;
                n nVar3 = this.f45788c;
                pVar3.onOutputCompleted(nVar3.f45801a, nVar3.f45802b, this.d, this.f45789e);
                return;
        }
    }
}
