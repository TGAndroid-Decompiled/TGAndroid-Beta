package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.wq;
public final class d extends c {
    public final h6 d;
    public final dh0 f56920e;
    public final te.a f56921f;
    public float h;

    public d(View view, org.telegram.ui.ActionBar.h6 h6Var) {
        super(h6Var);
        dh0 dh0Var = new dh0(view);
        this.f56920e = dh0Var;
        dh0Var.d(null, true, false);
        dh0Var.v = 650.0f;
        dh0Var.e(false, 0.69f);
        dh0Var.f32987p.setStrokeWidth(g0.L(1.5f));
        this.f56921f = new te.a(view, wq.h, 260L);
        h6 h6Var2 = new h6(true, false, false);
        this.d = h6Var2;
        h6Var2.x(g0.o());
        h6Var2.w(g0.L(13.0f));
        h6Var2.f34187b = 17;
        int w02 = m6.w0(m6.f27982i6, h6Var);
        if (this.f56918b != w02) {
            m6.H1(this.f56917a, w02, false);
            this.f56918b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f56917a.setAlpha(i7);
        this.d.B = i7;
    }

    public final float b() {
        return this.f56921f.f55498e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f56920e.f32986o = i7;
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
        float f10 = this.f56921f.f55498e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f56920e.a(canvas);
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
        this.f56920e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
