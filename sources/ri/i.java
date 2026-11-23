package ri;

import org.telegram.ui.Components.gw;
public final class i implements c5.h {
    public int f56799a;
    public final gw f56800b;
    public final q f56801c;

    public i(q qVar, gw gwVar) {
        this.f56801c = qVar;
        this.f56800b = gwVar;
        this.f56799a = gwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56800b.getScrollX();
        this.f56801c.h(scrollX - this.f56799a, 0);
        this.f56799a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56801c.f56822g++;
    }

    @Override
    public final void a(int i7) {
    }
}
