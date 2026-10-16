package p4;

import m.h3;
public final class c implements Runnable {
    public final int f42701a;
    public final androidx.emoji2.text.p f42702b;
    public final int f42703c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f42701a = i11;
        this.f42702b = pVar;
        this.f42703c = i10;
    }

    @Override
    public final void run() {
        switch (this.f42701a) {
            case 0:
                v vVar = ((e) ((h3) this.f42702b.f1509f).d).d;
                if (vVar != null) {
                    vVar.j(this.f42703c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((h3) this.f42702b.f1509f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f42703c);
                    return;
                }
                return;
        }
    }
}
