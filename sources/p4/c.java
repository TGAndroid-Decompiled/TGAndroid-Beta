package p4;

import m.f3;
public final class c implements Runnable {
    public final int f45215a;
    public final androidx.emoji2.text.o f45216b;
    public final int f45217c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45215a = i11;
        this.f45216b = oVar;
        this.f45217c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45215a) {
            case 0:
                w wVar = ((e) ((f3) this.f45216b.f2618f).d).d;
                if (wVar != null) {
                    wVar.j(this.f45217c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((f3) this.f45216b.f2618f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.f45217c);
                    return;
                }
                return;
        }
    }
}
