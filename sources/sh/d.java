package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import yf.p;
public final class d extends c {
    public final o6 d;
    public final mj0 e;
    public final le.b f43247f;
    public float h;

    public d(u1 u1Var, e6 e6Var) {
        super(e6Var);
        mj0 mj0Var = new mj0(u1Var);
        this.e = mj0Var;
        mj0Var.d(null, true, false);
        mj0Var.v = 650.0f;
        mj0Var.e(0.69f, false);
        mj0Var.f26435p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f43247f = new le.b(u1Var, qr.h, 260L);
        o6 o6Var = new o6(true, false, false, false);
        this.d = o6Var;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.f26868b = 17;
        int v02 = j6.v0(j6.f19152i6, e6Var);
        if (this.f43245b != v02) {
            j6.B1(this.f43244a, v02, false);
            this.f43245b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f43244a.setAlpha(i10);
        this.d.f26885w = i10;
    }

    public final float b() {
        return this.f43247f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f26434o = i10;
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
        float f7 = this.f43247f.e;
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
