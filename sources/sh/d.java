package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.qr;
import yf.p;
public final class d extends c {
    public final n6 d;
    public final lj0 e;
    public final le.b f43291f;
    public float h;

    public d(u1 u1Var, f6 f6Var) {
        super(f6Var);
        lj0 lj0Var = new lj0(u1Var);
        this.e = lj0Var;
        lj0Var.d(null, true, false);
        lj0Var.v = 650.0f;
        lj0Var.e(0.69f, false);
        lj0Var.f26163p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f43291f = new le.b(u1Var, qr.h, 260L);
        n6 n6Var = new n6(true, false, false, false);
        this.d = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.t(AndroidUtilities.dp(13.0f));
        n6Var.f26575b = 17;
        int v02 = j6.v0(j6.f19184i6, f6Var);
        if (this.f43289b != v02) {
            j6.B1(this.f43288a, v02, false);
            this.f43289b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f43288a.setAlpha(i10);
        this.d.f26592w = i10;
    }

    public final float b() {
        return this.f43291f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f26162o = i10;
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
        float f7 = this.f43291f.e;
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
