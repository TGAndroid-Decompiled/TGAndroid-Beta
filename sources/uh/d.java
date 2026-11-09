package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
public final class d extends c {
    public final i6 d;
    public final eh0 f56924e;
    public final te.a f56925f;
    public float h;

    public d(View view, g6 g6Var) {
        super(g6Var);
        eh0 eh0Var = new eh0(view);
        this.f56924e = eh0Var;
        eh0Var.d(null, true, false);
        eh0Var.v = 650.0f;
        eh0Var.e(false, 0.69f);
        eh0Var.f33402p.setStrokeWidth(g0.L(1.5f));
        this.f56925f = new te.a(view, xq.h, 260L);
        i6 i6Var = new i6(true, false, false);
        this.d = i6Var;
        i6Var.x(g0.o());
        i6Var.w(g0.L(13.0f));
        i6Var.f34587b = 17;
        int w02 = l6.w0(l6.f27957i6, g6Var);
        if (this.f56922b != w02) {
            l6.H1(this.f56921a, w02, false);
            this.f56922b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f56921a.setAlpha(i7);
        this.d.B = i7;
    }

    public final float b() {
        return this.f56925f.f55499e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f56924e.f33401o = i7;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i7 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i7, bounds.right, bounds.bottom + i7);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.f56925f.f55499e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f56924e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i7 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i7, bounds.right, bounds.bottom + i7);
        int L = g0.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.f56924e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
