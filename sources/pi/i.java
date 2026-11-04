package pi;

import org.telegram.ui.Components.uv;
public final class i implements b5.h {
    public int f53584a;
    public final uv f53585b;
    public final q f53586c;

    public i(q qVar, uv uvVar) {
        this.f53586c = qVar;
        this.f53585b = uvVar;
        this.f53584a = uvVar.getScrollX();
    }

    @Override
    public final void b(float f10, int i3, int i10) {
        int scrollX = this.f53585b.getScrollX();
        this.f53586c.h(scrollX - this.f53584a, 0);
        this.f53584a = scrollX;
    }

    @Override
    public final void c(int i3) {
        this.f53586c.f53607g++;
    }

    @Override
    public final void a(int i3) {
    }
}
