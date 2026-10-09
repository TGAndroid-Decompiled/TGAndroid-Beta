package p4;
public final class c implements Runnable {
    public final int f45321a;
    public final androidx.emoji2.text.o f45322b;
    public final int f45323c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45321a = i11;
        this.f45322b = oVar;
        this.f45323c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45321a) {
            case 0:
                v vVar = ((e) ((la.h) this.f45322b.f2620f).d).d;
                if (vVar != null) {
                    vVar.j(this.f45323c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f45322b.f2620f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f45323c);
                    return;
                }
                return;
        }
    }
}
