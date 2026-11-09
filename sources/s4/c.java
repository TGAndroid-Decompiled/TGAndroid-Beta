package s4;

import org.telegram.ui.ky0;
public final class c implements Runnable {
    public final int f54796a;
    public final androidx.emoji2.text.p f54797b;
    public final int f54798c;

    public c(androidx.emoji2.text.p pVar, int i7, int i10) {
        this.f54796a = i10;
        this.f54797b = pVar;
        this.f54798c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54796a) {
            case 0:
                v vVar = ((e) ((ky0) this.f54797b.f2327f).d).d;
                if (vVar != null) {
                    vVar.j(this.f54798c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((ky0) this.f54797b.f2327f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f54798c);
                    return;
                }
                return;
        }
    }
}
