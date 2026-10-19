package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44083a;
    public final androidx.emoji2.text.p f44084b;
    public final int f44085c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44083a = i11;
        this.f44084b = pVar;
        this.f44085c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44083a) {
            case 0:
                v vVar = ((e) ((g3) this.f44084b.f3119f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44085c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44084b.f3119f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44085c);
                    return;
                }
                return;
        }
    }
}
