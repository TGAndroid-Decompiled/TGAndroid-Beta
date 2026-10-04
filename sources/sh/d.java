package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.tr;
import yf.p;
public final class d extends c {
    public final o6 d;
    public final oj0 f46869e;
    public final le.b f46870f;
    public float h;

    public d(u1 u1Var, d6 d6Var) {
        super(d6Var);
        oj0 oj0Var = new oj0(u1Var);
        this.f46869e = oj0Var;
        oj0Var.d(null, true, false);
        oj0Var.v = 650.0f;
        oj0Var.e(0.69f, false);
        oj0Var.f29384p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f46870f = new le.b(u1Var, tr.h, 260L);
        o6 o6Var = new o6(true, false, false, false);
        this.d = o6Var;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.f29240b = 17;
        int v02 = i6.v0(i6.f20909i6, d6Var);
        if (this.f46867b != v02) {
            i6.B1(this.f46866a, v02, false);
            this.f46867b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f46866a.setAlpha(i10);
        this.d.f29258w = i10;
    }

    public final float b() {
        return this.f46870f.f15435e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.f46869e.f29383o = i10;
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
        float f7 = this.f46870f.f15435e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.f46869e.a(canvas);
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
        this.f46869e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
