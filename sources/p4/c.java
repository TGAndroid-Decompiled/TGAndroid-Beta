package p4;
public final class c implements Runnable {
    public final int f44150a;
    public final androidx.emoji2.text.o f44151b;
    public final int f44152c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f44150a = i11;
        this.f44151b = oVar;
        this.f44152c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44150a) {
            case 0:
                v vVar = ((e) ((la.h) this.f44151b.f2541f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44152c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f44151b.f2541f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44152c);
                    return;
                }
                return;
        }
    }
}
