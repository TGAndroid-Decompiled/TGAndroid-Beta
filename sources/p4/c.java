package p4;
public final class c implements Runnable {
    public final int f40570a;
    public final androidx.emoji2.text.o f40571b;
    public final int f40572c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40570a = i11;
        this.f40571b = oVar;
        this.f40572c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40570a) {
            case 0:
                v vVar = ((e) ((lf.i) this.f40571b.f2351f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40572c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.i) this.f40571b.f2351f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40572c);
                    return;
                }
                return;
        }
    }
}
