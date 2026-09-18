package p4;
public final class c implements Runnable {
    public final int f40575a;
    public final androidx.emoji2.text.o f40576b;
    public final int f40577c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40575a = i11;
        this.f40576b = oVar;
        this.f40577c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40575a) {
            case 0:
                v vVar = ((e) ((lf.i) this.f40576b.f2351f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40577c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.i) this.f40576b.f2351f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40577c);
                    return;
                }
                return;
        }
    }
}
