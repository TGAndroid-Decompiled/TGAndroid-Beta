package p4;
public final class c implements Runnable {
    public final int f43802a;
    public final androidx.emoji2.text.p f43803b;
    public final int f43804c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f43802a = i11;
        this.f43803b = pVar;
        this.f43804c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43802a) {
            case 0:
                v vVar = ((e) ((m2.t) this.f43803b.f1366f).d).d;
                if (vVar != null) {
                    vVar.j(this.f43804c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((m2.t) this.f43803b.f1366f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f43804c);
                    return;
                }
                return;
        }
    }
}
