package s4;

import org.telegram.ui.Components.i61;
public final class c implements Runnable {
    public final int f57049a;
    public final androidx.emoji2.text.q f57050b;
    public final int f57051c;

    public c(androidx.emoji2.text.q qVar, int i7, int i10) {
        this.f57049a = i10;
        this.f57050b = qVar;
        this.f57051c = i7;
    }

    @Override
    public final void run() {
        switch (this.f57049a) {
            case 0:
                v vVar = ((e) ((i61) this.f57050b.f2242f).d).d;
                if (vVar != null) {
                    vVar.j(this.f57051c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((i61) this.f57050b.f2242f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f57051c);
                    return;
                }
                return;
        }
    }
}
