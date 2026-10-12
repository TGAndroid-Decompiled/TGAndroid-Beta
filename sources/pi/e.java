package pi;
public final class e implements Runnable {
    public final int f45775a;
    public final s f45776b;
    public final m f45777c;
    public final long d;
    public final long f45778e;

    public e(s sVar, m mVar, long j3, long j10, int i10) {
        this.f45775a = i10;
        this.f45776b = sVar;
        this.f45777c = mVar;
        this.d = j3;
        this.f45778e = j10;
    }

    @Override
    public final void run() {
        switch (this.f45775a) {
            case 0:
                o oVar = this.f45776b.f45816f;
                m mVar = this.f45777c;
                oVar.onBytesAvailable(mVar.f45793a, mVar.f45794b, this.d, this.f45778e);
                return;
            case 1:
                o oVar2 = this.f45776b.f45816f;
                m mVar2 = this.f45777c;
                oVar2.onOutputCompleted(mVar2.f45793a, mVar2.f45794b, this.d, this.f45778e);
                return;
            default:
                o oVar3 = this.f45776b.f45816f;
                m mVar3 = this.f45777c;
                oVar3.onOutputCompleted(mVar3.f45793a, mVar3.f45794b, this.d, this.f45778e);
                return;
        }
    }
}
