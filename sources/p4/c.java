package p4;
public final class c implements Runnable {
    public final int f43801a;
    public final androidx.emoji2.text.p f43802b;
    public final int f43803c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f43801a = i11;
        this.f43802b = pVar;
        this.f43803c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43801a) {
            case 0:
                v vVar = ((e) ((m2.t) this.f43802b.f1366f).d).d;
                if (vVar != null) {
                    vVar.j(this.f43803c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((m2.t) this.f43802b.f1366f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f43803c);
                    return;
                }
                return;
        }
    }
}
