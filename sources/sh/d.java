package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
import yf.p;
public final class d extends c {
    public final o6 d;
    public final cj0 e;
    public final le.c f42941f;
    public float h;

    public d(t1 t1Var, d6 d6Var) {
        super(d6Var);
        cj0 cj0Var = new cj0(t1Var);
        this.e = cj0Var;
        cj0Var.d(null, true, false);
        cj0Var.v = 650.0f;
        cj0Var.e(0.69f, false);
        cj0Var.f23057p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f42941f = new le.c(t1Var, rr.h, 260L);
        o6 o6Var = new o6(true, false, false, false);
        this.d = o6Var;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.f26614b = 17;
        int v02 = h6.v0(h6.f18878i6, d6Var);
        if (this.f42939b != v02) {
            h6.B1(this.f42938a, v02, false);
            this.f42939b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f42938a.setAlpha(i10);
        this.d.f26631w = i10;
    }

    public final float b() {
        return this.f42941f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f23056o = i10;
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
        float f7 = this.f42941f.e;
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
