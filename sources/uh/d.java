package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sh0;
public final class d extends c {
    public final n6 d;
    public final sh0 f58997e;
    public final te.a f58998f;
    public float h;

    public d(View view, h6 h6Var) {
        super(h6Var);
        sh0 sh0Var = new sh0(view);
        this.f58997e = sh0Var;
        sh0Var.d(null, true, false);
        sh0Var.v = 650.0f;
        sh0Var.e(false, 0.69f);
        sh0Var.f39548p.setStrokeWidth(g0.L(1.5f));
        this.f58998f = new te.a(view, nr.h, 260L);
        n6 n6Var = new n6(true, false, false);
        this.d = n6Var;
        n6Var.x(g0.o());
        n6Var.w(g0.L(13.0f));
        n6Var.f37751b = 17;
        int w02 = m6.w0(m6.f29439i6, h6Var);
        if (this.f58995b != w02) {
            m6.H1(this.f58994a, w02, false);
            this.f58995b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f58994a.setAlpha(i7);
        this.d.C = i7;
    }

    public final float b() {
        return this.f58998f.f57665e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f58997e.f39547o = i7;
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
        float f10 = this.f58998f.f57665e;
        if (f10 < 1.0f) {
            t.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f58997e.a(canvas);
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
        this.f58997e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
