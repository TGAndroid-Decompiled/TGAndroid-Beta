package pi;
public final class f implements Runnable {
    public final int f45783a;
    public final t f45784b;
    public final n f45785c;
    public final byte[] d;

    public f(t tVar, n nVar, byte[] bArr, int i10) {
        this.f45783a = i10;
        this.f45784b = tVar;
        this.f45785c = nVar;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f45783a) {
            case 0:
                t tVar = this.f45784b;
                tVar.getClass();
                tVar.g(this.f45785c.f45802b, this.d);
                return;
            default:
                t tVar2 = this.f45784b;
                tVar2.getClass();
                tVar2.g(this.f45785c.f45802b, this.d);
                return;
        }
    }
}
