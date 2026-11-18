package ri;

import org.telegram.ui.Components.hw;
public final class i implements c5.h {
    public int f56676a;
    public final hw f56677b;
    public final q f56678c;

    public i(q qVar, hw hwVar) {
        this.f56678c = qVar;
        this.f56677b = hwVar;
        this.f56676a = hwVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        int scrollX = this.f56677b.getScrollX();
        this.f56678c.h(scrollX - this.f56676a, 0);
        this.f56676a = scrollX;
    }

    @Override
    public final void c(int i7) {
        this.f56678c.f56699g++;
    }

    @Override
    public final void a(int i7) {
    }
}
