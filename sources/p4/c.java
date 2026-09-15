package p4;

import m.e3;
public final class c implements Runnable {
    public final int f40548a;
    public final androidx.emoji2.text.o f40549b;
    public final int f40550c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f40548a = i11;
        this.f40549b = oVar;
        this.f40550c = i10;
    }

    @Override
    public final void run() {
        switch (this.f40548a) {
            case 0:
                v vVar = ((e) ((e3) this.f40549b.f2346f).d).d;
                if (vVar != null) {
                    vVar.j(this.f40550c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((e3) this.f40549b.f2346f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f40550c);
                    return;
                }
                return;
        }
    }
}
