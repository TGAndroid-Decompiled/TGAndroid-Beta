package p4;
public final class c implements Runnable {
    public final int f40814a;
    public final androidx.emoji2.text.o f40815b;
    public final int f40816c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40814a = i11;
        this.f40815b = oVar;
        this.f40816c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40814a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40815b.f2343f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40816c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40815b.f2343f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40816c);
                    return;
                }
                return;
        }
    }
}
