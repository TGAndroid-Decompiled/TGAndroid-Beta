package sh;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
import yf.p;
public final class d extends c {
    public final o6 d;
    public final mj0 e;
    public final le.c f43263f;
    public float h;

    public d(u1 u1Var, d6 d6Var) {
        super(d6Var);
        mj0 mj0Var = new mj0(u1Var);
        this.e = mj0Var;
        mj0Var.d(null, true, false);
        mj0Var.v = 650.0f;
        mj0Var.e(0.69f, false);
        mj0Var.f26517p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f43263f = new le.c(u1Var, rr.h, 260L);
        o6 o6Var = new o6(true, false, false, false);
        this.d = o6Var;
        o6Var.u(AndroidUtilities.bold());
        o6Var.t(AndroidUtilities.dp(13.0f));
        o6Var.f26925b = 17;
        int v02 = h6.v0(h6.f19134i6, d6Var);
        if (this.f43261b != v02) {
            h6.B1(this.f43260a, v02, false);
            this.f43261b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f43260a.setAlpha(i10);
        this.d.f26942w = i10;
    }

    public final float b() {
        return this.f43263f.e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.e.f26516o = i10;
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
        float f7 = this.f43263f.e;
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
