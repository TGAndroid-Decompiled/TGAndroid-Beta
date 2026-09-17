package p4;
public final class c implements Runnable {
    public final int f43829a;
    public final androidx.emoji2.text.p f43830b;
    public final int f43831c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f43829a = i11;
        this.f43830b = pVar;
        this.f43831c = i10;
    }

    @Override
    public final void run() {
        switch (this.f43829a) {
            case 0:
                v vVar = ((e) ((m2.t) this.f43830b.f1378f).d).d;
                if (vVar != null) {
                    vVar.j(this.f43831c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((m2.t) this.f43830b.f1378f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f43831c);
                    return;
                }
                return;
        }
    }
}
