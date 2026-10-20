package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44093a;
    public final androidx.emoji2.text.p f44094b;
    public final int f44095c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44093a = i11;
        this.f44094b = pVar;
        this.f44095c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44093a) {
            case 0:
                v vVar = ((e) ((g3) this.f44094b.f3117f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44095c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44094b.f3117f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44095c);
                    return;
                }
                return;
        }
    }
}
