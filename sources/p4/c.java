package p4;
public final class c implements Runnable {
    public final int f45391a;
    public final androidx.emoji2.text.o f45392b;
    public final int f45393c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45391a = i11;
        this.f45392b = oVar;
        this.f45393c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45391a) {
            case 0:
                v vVar = ((e) ((la.h) this.f45392b.f2620f).d).d;
                if (vVar != null) {
                    vVar.j(this.f45393c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f45392b.f2620f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f45393c);
                    return;
                }
                return;
        }
    }
}
