package p4;
public final class c implements Runnable {
    public final int f44157a;
    public final androidx.emoji2.text.o f44158b;
    public final int f44159c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f44157a = i11;
        this.f44158b = oVar;
        this.f44159c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44157a) {
            case 0:
                v vVar = ((e) ((la.h) this.f44158b.f2541f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44159c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f44158b.f2541f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44159c);
                    return;
                }
                return;
        }
    }
}
