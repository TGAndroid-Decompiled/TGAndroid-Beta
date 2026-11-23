package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.rh0;
public final class d extends c {
    public final m6 d;
    public final rh0 f59114e;
    public final te.a f59115f;
    public float h;

    public d(View view, i6 i6Var) {
        super(i6Var);
        rh0 rh0Var = new rh0(view);
        this.f59114e = rh0Var;
        rh0Var.d(null, true, false);
        rh0Var.v = 650.0f;
        rh0Var.e(false, 0.69f);
        rh0Var.f39309p.setStrokeWidth(g0.L(1.5f));
        this.f59115f = new te.a(view, kr.h, 260L);
        m6 m6Var = new m6(true, false, false);
        this.d = m6Var;
        m6Var.x(g0.o());
        m6Var.w(g0.L(13.0f));
        m6Var.f37394b = 17;
        int w02 = n6.w0(n6.f29543i6, i6Var);
        if (this.f59112b != w02) {
            n6.H1(this.f59111a, w02, false);
            this.f59112b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f59111a.setAlpha(i7);
        this.d.C = i7;
    }

    public final float b() {
        return this.f59115f.f57779e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f59114e.f39308o = i7;
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
        float f10 = this.f59115f.f57779e;
        if (f10 < 1.0f) {
            t.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f59114e.a(canvas);
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
        this.f59114e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
