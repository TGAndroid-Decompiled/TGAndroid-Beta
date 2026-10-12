package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.q6;
import yf.p;
public final class d extends c {
    public final q6 d;
    public final jk0 f48410e;
    public final me.b f48411f;
    public float h;

    public d(u1 u1Var, c6 c6Var) {
        super(c6Var);
        jk0 jk0Var = new jk0(u1Var);
        this.f48410e = jk0Var;
        jk0Var.d(null, true, false);
        jk0Var.v = 650.0f;
        jk0Var.e(0.69f, false);
        jk0Var.f27543p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f48411f = new me.b(u1Var, js.h, 260L);
        q6 q6Var = new q6(true, false, false);
        this.d = q6Var;
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(13.0f));
        q6Var.f29712b = 17;
        int w02 = h6.w0(h6.f20650i6, c6Var);
        if (this.f48408b != w02) {
            h6.C1(this.f48407a, w02, false);
            this.f48408b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f48407a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f48411f.f16087e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.f48410e.f27542o = i10;
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
        float f7 = this.f48411f.f16087e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.f48410e.a(canvas);
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
        this.f48410e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
