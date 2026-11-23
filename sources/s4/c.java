package s4;

import org.telegram.ui.md0;
public final class c implements Runnable {
    public final int f56933a;
    public final androidx.emoji2.text.q f56934b;
    public final int f56935c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f56933a = i10;
        this.f56934b = qVar;
        this.f56935c = i7;
    }

    @Override
    public final void run() {
        switch (this.f56933a) {
            case 0:
                v vVar = ((e) ((md0) this.f56934b.f2241f).d).d;
                if (vVar != null) {
                    vVar.j(this.f56935c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((md0) this.f56934b.f2241f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f56935c);
                    return;
                }
                return;
        }
    }
}
