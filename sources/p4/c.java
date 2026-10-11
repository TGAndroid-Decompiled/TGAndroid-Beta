package p4;
public final class c implements Runnable {
    public final int f45357a;
    public final androidx.emoji2.text.o f45358b;
    public final int f45359c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45357a = i11;
        this.f45358b = oVar;
        this.f45359c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45357a) {
            case 0:
                v vVar = ((e) ((la.h) this.f45358b.f2620f).d).d;
                if (vVar != null) {
                    vVar.j(this.f45359c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f45358b.f2620f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f45359c);
                    return;
                }
                return;
        }
    }
}
