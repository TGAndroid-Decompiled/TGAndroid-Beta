package ri;

import org.telegram.ui.Components.jw;
public final class i implements c5.h {
    public int f56721a;
    public final jw f56722b;
    public final q f56723c;

    public i(q qVar, jw jwVar) {
        this.f56723c = qVar;
        this.f56722b = jwVar;
        this.f56721a = jwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56722b.getScrollX();
        this.f56723c.h(scrollX - this.f56721a, 0);
        this.f56721a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56723c.f56744g++;
    }

    @Override
    public final void a(int i7) {
    }
}
