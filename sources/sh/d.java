package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qr;
import yf.p;
public final class d extends c {
    public final m6 d;
    public final cj0 e;
    public final le.b f43011f;
    public float h;

    public d(t1 t1Var, f6 f6Var) {
        super(f6Var);
        cj0 cj0Var = new cj0(t1Var);
        this.e = cj0Var;
        cj0Var.d(null, true, false);
        cj0Var.v = 650.0f;
        cj0Var.e(0.69f, false);
        cj0Var.f23065p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f43011f = new le.b(t1Var, qr.h, 260L);
        m6 m6Var = new m6(true, false, false, false);
        this.d = m6Var;
        m6Var.u(AndroidUtilities.bold());
        m6Var.t(AndroidUtilities.dp(13.0f));
        m6Var.f26067b = 17;
        int v02 = j6.v0(j6.f18952i6, f6Var);
        if (this.f43009b != v02) {
            j6.B1(this.f43008a, v02, false);
            this.f43009b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f43008a.setAlpha(i10);
        this.d.f26084w = i10;
    }

    public final float b() {
        return this.f43011f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f23064o = i10;
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
        float f7 = this.f43011f.e;
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
