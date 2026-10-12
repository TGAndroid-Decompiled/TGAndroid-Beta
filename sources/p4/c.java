package p4;

import m.f3;
public final class c implements Runnable {
    public final int f45210a;
    public final androidx.emoji2.text.o f45211b;
    public final int f45212c;

    public c(androidx.emoji2.text.o oVar, int i10, int i11) {
        this.f45210a = i11;
        this.f45211b = oVar;
        this.f45212c = i10;
    }

    @Override
    public final void run() {
        switch (this.f45210a) {
            case 0:
                w wVar = ((e) ((f3) this.f45211b.f2618f).d).d;
                if (wVar != null) {
                    wVar.j(this.f45212c);
                    return;
                }
                return;
            default:
                w wVar2 = ((e) ((f3) this.f45211b.f2618f).d).d;
                if (wVar2 != null) {
                    wVar2.k(this.f45212c);
                    return;
                }
                return;
        }
    }
}
