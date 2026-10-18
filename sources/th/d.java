package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.yj0;
import zf.p;
public final class d extends c {
    public final p6 d;
    public final yj0 e;
    public final ne.b f47200f;
    public float h;

    public d(u1 u1Var, d6 d6Var) {
        super(d6Var);
        yj0 yj0Var = new yj0(u1Var);
        this.e = yj0Var;
        yj0Var.d(null, true, false);
        yj0Var.v = 650.0f;
        yj0Var.e(0.69f, false);
        yj0Var.f32664p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f47200f = new ne.b(u1Var, bs.h, 260L);
        p6 p6Var = new p6(true, false, false);
        this.d = p6Var;
        p6Var.x(AndroidUtilities.bold());
        p6Var.w(AndroidUtilities.dp(13.0f));
        p6Var.f29192b = 17;
        int w02 = h6.w0(h6.f21075i6, d6Var);
        if (this.f47198b != w02) {
            h6.C1(this.f47197a, w02, false);
            this.f47198b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f47197a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f47200f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f32663o = i10;
    }

    public final void d(float f7) {
        if (this.h != f7) {
            this.h = f7;
            Rect bounds = getBounds();
            int i10 = (int) this.h;
            this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        float f7 = this.f47200f.e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.e.a(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        Rect bounds = getBounds();
        int i10 = (int) this.h;
        this.d.setBounds(bounds.left, bounds.top + i10, bounds.right, bounds.bottom + i10);
        int dp = AndroidUtilities.dp(11.0f);
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        this.e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
