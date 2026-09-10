package p4;

import m.e3;
public final class c implements Runnable {
    public final int f39673a;
    public final androidx.emoji2.text.p f39674b;
    public final int f39675c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f39673a = i11;
        this.f39674b = pVar;
        this.f39675c = i10;
    }

    @Override
    public final void run() {
        switch (this.f39673a) {
            case 0:
                v vVar = ((e) ((e3) this.f39674b.f1044f).d).d;
                if (vVar != null) {
                    vVar.j(this.f39675c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((e3) this.f39674b.f1044f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f39675c);
                    return;
                }
                return;
        }
    }
}
