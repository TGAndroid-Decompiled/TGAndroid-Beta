package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44111a;
    public final androidx.emoji2.text.p f44112b;
    public final int f44113c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44111a = i11;
        this.f44112b = pVar;
        this.f44113c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44111a) {
            case 0:
                v vVar = ((e) ((g3) this.f44112b.f3120f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44113c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44112b.f3120f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44113c);
                    return;
                }
                return;
        }
    }
}
