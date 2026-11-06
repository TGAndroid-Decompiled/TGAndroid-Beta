package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.xq;
public final class d extends c {
    public final i6 d;
    public final dh0 f56820e;
    public final te.a f56821f;
    public float h;

    public d(View view, f6 f6Var) {
        super(f6Var);
        dh0 dh0Var = new dh0(view);
        this.f56820e = dh0Var;
        dh0Var.d(null, true, false);
        dh0Var.v = 650.0f;
        dh0Var.e(false, 0.69f);
        dh0Var.f32885p.setStrokeWidth(g0.L(1.5f));
        this.f56821f = new te.a(view, xq.h, 260L);
        i6 i6Var = new i6(true, false, false);
        this.d = i6Var;
        i6Var.x(g0.o());
        i6Var.w(g0.L(13.0f));
        i6Var.f34477b = 17;
        int w02 = k6.w0(k6.f27940i6, f6Var);
        if (this.f56818b != w02) {
            k6.H1(this.f56817a, w02, false);
            this.f56818b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f56817a.setAlpha(i7);
        this.d.B = i7;
    }

    public final float b() {
        return this.f56821f.f55395e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f56820e.f32884o = i7;
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
        float f10 = this.f56821f.f55395e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f56820e.a(canvas);
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
        this.f56820e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
