package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44512a;
    public final androidx.emoji2.text.p f44513b;
    public final int f44514c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44512a = i11;
        this.f44513b = pVar;
        this.f44514c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44512a) {
            case 0:
                v vVar = ((e) ((g3) this.f44513b.f3124f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44514c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44513b.f3124f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44514c);
                    return;
                }
                return;
        }
    }
}
