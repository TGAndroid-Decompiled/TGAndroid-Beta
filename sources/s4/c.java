package s4;

import org.telegram.ui.hy0;
public final class c implements Runnable {
    public final int f54784a;
    public final androidx.emoji2.text.p f54785b;
    public final int f54786c;

    public c(androidx.emoji2.text.p pVar, int i7, int i10) {
        this.f54784a = i10;
        this.f54785b = pVar;
        this.f54786c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54784a) {
            case 0:
                v vVar = ((e) ((hy0) this.f54785b.f2327f).d).d;
                if (vVar != null) {
                    vVar.j(this.f54786c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((hy0) this.f54785b.f2327f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f54786c);
                    return;
                }
                return;
        }
    }
}
