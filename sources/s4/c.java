package s4;

import org.telegram.ui.hy0;
public final class c implements Runnable {
    public final int f54691a;
    public final androidx.emoji2.text.p f54692b;
    public final int f54693c;

    public c(androidx.emoji2.text.p pVar, int i7, int i10) {
        this.f54691a = i10;
        this.f54692b = pVar;
        this.f54693c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54691a) {
            case 0:
                v vVar = ((e) ((hy0) this.f54692b.f2327f).d).d;
                if (vVar != null) {
                    vVar.j(this.f54693c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((hy0) this.f54692b.f2327f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f54693c);
                    return;
                }
                return;
        }
    }
}
