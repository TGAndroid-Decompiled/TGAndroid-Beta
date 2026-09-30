package p4;
public final class c implements Runnable {
    public final int f40914a;
    public final androidx.emoji2.text.o f40915b;
    public final int f40916c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40914a = i11;
        this.f40915b = oVar;
        this.f40916c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40914a) {
            case 0:
                v vVar = ((e) ((la.h) this.f40915b.f2350f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40916c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((la.h) this.f40915b.f2350f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40916c);
                    return;
                }
                return;
        }
    }
}
