package p4;
public final class c implements Runnable {
    public final int f40813a;
    public final androidx.emoji2.text.o f40814b;
    public final int f40815c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40813a = i11;
        this.f40814b = oVar;
        this.f40815c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40813a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40814b.f2345f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40815c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40814b.f2345f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40815c);
                    return;
                }
                return;
        }
    }
}
