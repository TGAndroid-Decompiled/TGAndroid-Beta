package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qh0;
public final class d extends c {
    public final m6 d;
    public final qh0 f58989e;
    public final te.a f58990f;
    public float h;

    public d(View view, i6 i6Var) {
        super(i6Var);
        qh0 qh0Var = new qh0(view);
        this.f58989e = qh0Var;
        qh0Var.d(null, true, false);
        qh0Var.v = 650.0f;
        qh0Var.e(false, 0.69f);
        qh0Var.f38804p.setStrokeWidth(g0.L(1.5f));
        this.f58990f = new te.a(view, lr.h, 260L);
        m6 m6Var = new m6(true, false, false);
        this.d = m6Var;
        m6Var.x(g0.o());
        m6Var.w(g0.L(13.0f));
        m6Var.f37377b = 17;
        int w02 = n6.w0(n6.f29488i6, i6Var);
        if (this.f58987b != w02) {
            n6.H1(this.f58986a, w02, false);
            this.f58987b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f58986a.setAlpha(i7);
        this.d.C = i7;
    }

    public final float b() {
        return this.f58990f.f57657e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f58989e.f38803o = i7;
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
        float f10 = this.f58990f.f57657e;
        if (f10 < 1.0f) {
            t.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f58989e.a(canvas);
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
        this.f58989e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
