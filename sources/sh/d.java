package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q6;
import yf.p;
public final class d extends c {
    public final q6 d;
    public final ik0 f48269e;
    public final me.b f48270f;
    public float h;

    public d(u1 u1Var, d6 d6Var) {
        super(d6Var);
        ik0 ik0Var = new ik0(u1Var);
        this.f48269e = ik0Var;
        ik0Var.d(null, true, false);
        ik0Var.v = 650.0f;
        ik0Var.e(0.69f, false);
        ik0Var.f27378p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f48270f = new me.b(u1Var, is.h, 260L);
        q6 q6Var = new q6(true, false, false);
        this.d = q6Var;
        q6Var.x(AndroidUtilities.bold());
        q6Var.w(AndroidUtilities.dp(13.0f));
        q6Var.f30019b = 17;
        int w02 = h6.w0(h6.f20877i6, d6Var);
        if (this.f48267b != w02) {
            h6.C1(this.f48266a, w02, false);
            this.f48267b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f48266a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f48270f.f16365e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.f48269e.f27377o = i10;
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
        float f7 = this.f48270f.f16365e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.f48269e.a(canvas);
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
        this.f48269e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
