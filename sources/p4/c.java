package p4;
public final class c implements Runnable {
    public final int f40842a;
    public final androidx.emoji2.text.o f40843b;
    public final int f40844c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40842a = i11;
        this.f40843b = oVar;
        this.f40844c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40842a) {
            case 0:
                v vVar = ((e) ((lf.h) this.f40843b.f2351f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40844c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.h) this.f40843b.f2351f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40844c);
                    return;
                }
                return;
        }
    }
}
