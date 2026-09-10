package rh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import xf.p;
public final class d extends c {
    public final n6 d;
    public final lj0 e;
    public final le.b f41537f;
    public float h;

    public d(t1 t1Var, f6 f6Var) {
        super(f6Var);
        lj0 lj0Var = new lj0(t1Var);
        this.e = lj0Var;
        lj0Var.d(null, true, false);
        lj0Var.v = 650.0f;
        lj0Var.e(0.69f, false);
        lj0Var.f25011p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f41537f = new le.b(t1Var, wr.h, 260L);
        n6 n6Var = new n6(true, false, false, false);
        this.d = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.f25425b = 17;
        int v02 = j6.v0(j6.f18017i6, f6Var);
        if (this.f41535b != v02) {
            j6.B1(this.f41534a, v02, false);
            this.f41535b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f41534a.setAlpha(i10);
        this.d.f25442w = i10;
    }

    public final float b() {
        return this.f41537f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f25010o = i10;
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
        float f7 = this.f41537f.e;
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
