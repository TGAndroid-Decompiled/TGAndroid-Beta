package s4;

import org.telegram.ui.md0;
public final class c implements Runnable {
    public final int f56968a;
    public final androidx.emoji2.text.q f56969b;
    public final int f56970c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f56968a = i10;
        this.f56969b = qVar;
        this.f56970c = i7;
    }

    @Override
    public final void run() {
        switch (this.f56968a) {
            case 0:
                v vVar = ((e) ((md0) this.f56969b.f2290f).d).d;
                if (vVar != null) {
                    vVar.j(this.f56970c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((md0) this.f56969b.f2290f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f56970c);
                    return;
                }
                return;
        }
    }
}
