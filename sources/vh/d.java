package vh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import cg.r;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.xq;
public final class d extends c {
    public final g6 d;
    public final gh0 f56956e;
    public final qe.a f56957f;
    public float h;

    public d(View view, e6 e6Var) {
        super(e6Var);
        gh0 gh0Var = new gh0(view);
        this.f56956e = gh0Var;
        gh0Var.d(null, true, false);
        gh0Var.v = 650.0f;
        gh0Var.e(false, 0.69f);
        gh0Var.f34109p.setStrokeWidth(g0.L(1.5f));
        this.f56957f = new qe.a(view, xq.h, 260L);
        g6 g6Var = new g6(true, false, false);
        this.d = g6Var;
        g6Var.x(g0.o());
        g6Var.w(g0.L(13.0f));
        g6Var.f33983b = 17;
        int w02 = k6.w0(k6.f27972i6, e6Var);
        if (this.f56954b != w02) {
            k6.H1(this.f56953a, w02, false);
            this.f56954b = w02;
        }
    }

    @Override
    public final void a(int i3) {
        this.f56953a.setAlpha(i3);
        this.d.B = i3;
    }

    public final float b() {
        return this.f56957f.f53840e;
    }

    public final void c(int i3) {
        this.d.u(i3);
        this.f56956e.f34108o = i3;
    }

    public final void d(float f10) {
        if (this.h != f10) {
            this.h = f10;
            Rect bounds = getBounds();
            int i3 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i3, bounds.right, bounds.bottom + i3);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f10 = this.f56957f.f53840e;
        if (f10 < 1.0f) {
            r.b(canvas, this.d, 1.0f - f10);
        }
        if (f10 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f10, f10, exactCenterX, exactCenterY);
            this.f56956e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i3 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i3, bounds.right, bounds.bottom + i3);
        int L = g0.L(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.f56956e.f(centerX - L, centerY - L, centerX + L, centerY + L);
    }
}
