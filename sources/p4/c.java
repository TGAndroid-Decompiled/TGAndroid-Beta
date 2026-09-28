package p4;
public final class c implements Runnable {
    public final int f40815a;
    public final androidx.emoji2.text.o f40816b;
    public final int f40817c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40815a = i11;
        this.f40816b = oVar;
        this.f40817c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40815a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40816b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40817c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40816b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40817c);
                    return;
                }
                return;
        }
    }
}
