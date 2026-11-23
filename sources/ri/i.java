package ri;

import org.telegram.ui.Components.jw;
public final class i implements c5.h {
    public int f56686a;
    public final jw f56687b;
    public final q f56688c;

    public i(q qVar, jw jwVar) {
        this.f56688c = qVar;
        this.f56687b = jwVar;
        this.f56686a = jwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56687b.getScrollX();
        this.f56688c.h(scrollX - this.f56686a, 0);
        this.f56686a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56688c.f56709g++;
    }

    @Override
    public final void a(int i7) {
    }
}
