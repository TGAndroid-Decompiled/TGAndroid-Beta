package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.zr;
import zf.p;
public final class d extends c {
    public final n6 d;
    public final bk0 e;
    public final ne.b f47647f;
    public float h;

    public d(t1 t1Var, g6 g6Var) {
        super(g6Var);
        bk0 bk0Var = new bk0(t1Var);
        this.e = bk0Var;
        bk0Var.d(null, true, false);
        bk0Var.v = 650.0f;
        bk0Var.e(0.69f, false);
        bk0Var.f25035p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f47647f = new ne.b(t1Var, zr.h, 260L);
        n6 n6Var = new n6(true, false, false);
        this.d = n6Var;
        n6Var.x(AndroidUtilities.bold());
        n6Var.w(AndroidUtilities.dp(13.0f));
        n6Var.f28797b = 17;
        int w02 = k6.w0(k6.f21273i6, g6Var);
        if (this.f47645b != w02) {
            k6.E1(this.f47644a, w02, false);
            this.f47645b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f47644a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f47647f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f25034o = i10;
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
        float f7 = this.f47647f.e;
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
