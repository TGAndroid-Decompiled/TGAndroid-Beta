package p4;
public final class c implements Runnable {
    public final int f40499a;
    public final androidx.emoji2.text.o f40500b;
    public final int f40501c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40499a = i11;
        this.f40500b = oVar;
        this.f40501c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40499a) {
            case 0:
                v vVar = ((e) ((lf.i) this.f40500b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40501c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.i) this.f40500b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40501c);
                    return;
                }
                return;
        }
    }
}
