package ri;

import org.telegram.ui.Components.jw;
public final class i implements c5.h {
    public int f56717a;
    public final jw f56718b;
    public final q f56719c;

    public i(q qVar, jw jwVar) {
        this.f56719c = qVar;
        this.f56718b = jwVar;
        this.f56717a = jwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56718b.getScrollX();
        this.f56719c.h(scrollX - this.f56717a, 0);
        this.f56717a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56719c.f56740g++;
    }

    @Override
    public final void a(int i7) {
    }
}
