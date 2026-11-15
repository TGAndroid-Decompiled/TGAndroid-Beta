package ri;

import org.telegram.ui.Components.bw;
public final class i implements c5.h {
    public int f56102a;
    public final bw f56103b;
    public final q f56104c;

    public i(q qVar, bw bwVar) {
        this.f56104c = qVar;
        this.f56103b = bwVar;
        this.f56102a = bwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56103b.getScrollX();
        this.f56104c.h(scrollX - this.f56102a, 0);
        this.f56102a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56104c.f56125g++;
    }

    @Override
    public final void a(int i7) {
    }
}
