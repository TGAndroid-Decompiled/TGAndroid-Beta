package s4;

import org.telegram.ui.ly0;
public final class c implements Runnable {
    public final int f54795a;
    public final androidx.emoji2.text.p f54796b;
    public final int f54797c;

    public c(androidx.emoji2.text.p pVar, int i7, int i10) {
        this.f54795a = i10;
        this.f54796b = pVar;
        this.f54797c = i7;
    }

    @Override
    public final void run() {
        switch (this.f54795a) {
            case 0:
                v vVar = ((e) ((ly0) this.f54796b.f2327f).d).d;
                if (vVar != null) {
                    vVar.j(this.f54797c);
                    return;
                }
                return;
            default:
                v vVar2 = ((e) ((ly0) this.f54796b.f2327f).d).d;
                if (vVar2 != null) {
                    vVar2.k(this.f54797c);
                    return;
                }
                return;
        }
    }
}
