package s4;

import org.telegram.ui.ld0;
public final class c implements Runnable {
    public final int f56349a;
    public final androidx.emoji2.text.q f56350b;
    public final int f56351c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f56349a = i10;
        this.f56350b = qVar;
        this.f56351c = i7;
    }

    @Override
    public final void run() {
        switch (this.f56349a) {
            case 0:
                v vVar = ((e) ((ld0) this.f56350b.f2279f).d).d;
                if (vVar != null) {
                    vVar.j(this.f56351c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((ld0) this.f56350b.f2279f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f56351c);
                    return;
                }
                return;
        }
    }
}
