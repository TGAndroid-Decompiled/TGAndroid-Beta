package p4;
public final class c implements Runnable {
    public final int f45367a;
    public final androidx.emoji2.text.o f45368b;
    public final int f45369c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45367a = i11;
        this.f45368b = oVar;
        this.f45369c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45367a) {
            case 0:
                v vVar = ((e) ((la.h) this.f45368b.f2620f).d).d;
                if (vVar != null) {
                    vVar.j(this.f45369c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f45368b.f2620f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f45369c);
                    return;
                }
                return;
        }
    }
}
