package qi;
public final class c implements Runnable {
    public final int f43395a;
    public final q f43396b;
    public final k f43397c;
    public final long d;
    public final long e;

    public c(q qVar, k kVar, long j10, long j11, int i10) {
        this.f43395a = i10;
        this.f43396b = qVar;
        this.f43397c = kVar;
        this.d = j10;
        this.e = j11;
    }

    @Override
    public final void run() {
        switch (this.f43395a) {
            case 0:
                m mVar = this.f43396b.f43432f;
                k kVar = this.f43397c;
                mVar.onOutputCompleted(kVar.f43412a, kVar.f43413b, this.d, this.e);
                return;
            case 1:
                m mVar2 = this.f43396b.f43432f;
                k kVar2 = this.f43397c;
                mVar2.onBytesAvailable(kVar2.f43412a, kVar2.f43413b, this.d, this.e);
                return;
            default:
                m mVar3 = this.f43396b.f43432f;
                k kVar3 = this.f43397c;
                mVar3.onOutputCompleted(kVar3.f43412a, kVar3.f43413b, this.d, this.e);
                return;
        }
    }
}
