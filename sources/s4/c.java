package s4;

import org.telegram.ui.hy0;
public final class c implements Runnable {
    public final int f54783a;
    public final androidx.emoji2.text.p f54784b;
    public final int f54785c;

    public c(androidx.emoji2.text.p pVar, int i7, int i10) {
        this.f54783a = i10;
        this.f54784b = pVar;
        this.f54785c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54783a) {
            case 0:
                v vVar = ((e) ((hy0) this.f54784b.f2327f).d).d;
                if (vVar != null) {
                    vVar.j(this.f54785c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((hy0) this.f54784b.f2327f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f54785c);
                    return;
                }
                return;
        }
    }
}
