package uh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import bg.s;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
public final class d extends c {
    public final g6 d;
    public final gh0 f58422e;
    public final te.a f58423f;
    public float h;

    public d(View view, e6 e6Var) {
        super(e6Var);
        gh0 gh0Var = new gh0(view);
        this.f58422e = gh0Var;
        gh0Var.d(null, true, false);
        gh0Var.v = 650.0f;
        gh0Var.e(false, 0.69f);
        gh0Var.f34981p.setStrokeWidth(g0.L(1.5f));
        this.f58423f = new te.a(view, er.h, 260L);
        g6 g6Var = new g6(true, false, false);
        this.d = g6Var;
        g6Var.x(g0.o());
        g6Var.w(g0.L(13.0f));
        g6Var.f34833b = 17;
        int w02 = j6.w0(j6.f28941i6, e6Var);
        if (this.f58420b != w02) {
            j6.H1(this.f58419a, w02, false);
            this.f58420b = w02;
        }
    }

    @Override
    public final void a(int i7) {
        this.f58419a.setAlpha(i7);
        this.d.C = i7;
    }

    public final float b() {
        return this.f58423f.f57085e;
    }

    public final void c(int i7) {
        this.d.u(i7);
        this.f58422e.f34980o = i7;
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
        float f10 = this.f58423f.f57085e;
        if (f10 < 1.0f) {
            s.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f58422e.a(canvas);
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
        this.f58422e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
