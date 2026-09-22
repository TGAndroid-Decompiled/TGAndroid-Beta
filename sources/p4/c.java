package p4;
public final class c implements Runnable {
    public final int f40863a;
    public final androidx.emoji2.text.o f40864b;
    public final int f40865c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40863a = i11;
        this.f40864b = oVar;
        this.f40865c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40863a) {
            case 0:
                v vVar = ((e) ((lf.h) this.f40864b.f2350f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40865c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((lf.h) this.f40864b.f2350f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40865c);
                    return;
                }
                return;
        }
    }
}
