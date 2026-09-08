package p4;
public final class c implements Runnable {
    public final int f43828a;
    public final androidx.emoji2.text.p f43829b;
    public final int f43830c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f43828a = i11;
        this.f43829b = pVar;
        this.f43830c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43828a) {
            case 0:
                v vVar = ((e) ((m2.t) this.f43829b.f1378f).d).d;
                if (vVar != null) {
                    vVar.j(this.f43830c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((m2.t) this.f43829b.f1378f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f43830c);
                    return;
                }
                return;
        }
    }
}
