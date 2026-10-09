package p4;
public final class c implements Runnable {
    public final int f45323a;
    public final androidx.emoji2.text.o f45324b;
    public final int f45325c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45323a = i11;
        this.f45324b = oVar;
        this.f45325c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45323a) {
            case 0:
                v vVar = ((e) ((la.h) this.f45324b.f2620f).d).d;
                if (vVar != null) {
                    vVar.j(this.f45325c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f45324b.f2620f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f45325c);
                    return;
                }
                return;
        }
    }
}
