package p4;

import m.g3;
public final class c implements Runnable {
    public final int f44088a;
    public final androidx.emoji2.text.p f44089b;
    public final int f44090c;

    public c(androidx.emoji2.text.p pVar, int i10, int i11) {
        this.f44088a = i11;
        this.f44089b = pVar;
        this.f44090c = i10;
    }

    @Override
    public final void run() {
        switch (this.f44088a) {
            case 0:
                v vVar = ((e) ((g3) this.f44089b.f3121f).d).d;
                if (vVar != null) {
                    vVar.j(this.f44090c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((g3) this.f44089b.f3121f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f44090c);
                    return;
                }
                return;
        }
    }
}
