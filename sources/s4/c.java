package s4;

import org.telegram.ui.md0;
public final class c implements Runnable {
    public final int f56964a;
    public final androidx.emoji2.text.q f56965b;
    public final int f56966c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f56964a = i10;
        this.f56965b = qVar;
        this.f56966c = i7;
    }

    @Override
    public final void run() {
        switch (this.f56964a) {
            case 0:
                v vVar = ((e) ((md0) this.f56965b.f2283f).d).d;
                if (vVar != null) {
                    vVar.j(this.f56966c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((md0) this.f56965b.f2283f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f56966c);
                    return;
                }
                return;
        }
    }
}
