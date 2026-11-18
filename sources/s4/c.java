package s4;

import org.telegram.ui.nd0;
public final class c implements Runnable {
    public final int f56923a;
    public final androidx.emoji2.text.q f56924b;
    public final int f56925c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f56923a = i10;
        this.f56924b = qVar;
        this.f56925c = i7;
    }

    @Override
    public final void run() {
        switch (this.f56923a) {
            case 0:
                v vVar = ((e) ((nd0) this.f56924b.f2271f).d).d;
                if (vVar != null) {
                    vVar.j(this.f56925c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((nd0) this.f56924b.f2271f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f56925c);
                    return;
                }
                return;
        }
    }
}
