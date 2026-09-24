package p4;
public final class c implements Runnable {
    public final int f40801a;
    public final androidx.emoji2.text.o f40802b;
    public final int f40803c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40801a = i11;
        this.f40802b = oVar;
        this.f40803c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40801a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40802b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40803c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40802b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40803c);
                    return;
                }
                return;
        }
    }
}
