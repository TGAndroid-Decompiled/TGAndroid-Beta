package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44096a;
    public final androidx.emoji2.text.p f44097b;
    public final int f44098c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44096a = i11;
        this.f44097b = pVar;
        this.f44098c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44096a) {
            case 0:
                v vVar = ((e) ((g3) this.f44097b.f3117f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44098c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44097b.f3117f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44098c);
                    return;
                }
                return;
        }
    }
}
