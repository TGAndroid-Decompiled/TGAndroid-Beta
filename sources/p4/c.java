package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44131a;
    public final androidx.emoji2.text.p f44132b;
    public final int f44133c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44131a = i11;
        this.f44132b = pVar;
        this.f44133c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44131a) {
            case 0:
                v vVar = ((e) ((g3) this.f44132b.f3121f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44133c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44132b.f3121f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44133c);
                    return;
                }
                return;
        }
    }
}
