package p4;
public final class c implements Runnable {
    public final int f40816a;
    public final androidx.emoji2.text.o f40817b;
    public final int f40818c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40816a = i11;
        this.f40817b = oVar;
        this.f40818c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40816a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40817b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40818c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40817b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40818c);
                    return;
                }
                return;
        }
    }
}
