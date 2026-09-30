package p4;
public final class c implements Runnable {
    public final int f40817a;
    public final androidx.emoji2.text.o f40818b;
    public final int f40819c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40817a = i11;
        this.f40818b = oVar;
        this.f40819c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40817a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40818b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40819c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40818b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40819c);
                    return;
                }
                return;
        }
    }
}
