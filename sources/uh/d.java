package uh;

import ag.v;
import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r6;
public final class d extends c {
    public final r6 d;
    public final bk0 e;
    public final oe.b f49915f;
    public float h;

    public d(s1 s1Var, u6 u6Var) {
        super(u6Var);
        bk0 bk0Var = new bk0(s1Var);
        this.e = bk0Var;
        bk0Var.d(null, true, false);
        bk0Var.v = 650.0f;
        bk0Var.e(0.69f, false);
        bk0Var.f26890p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f49915f = new oe.b(s1Var, ds.h, 260L);
        r6 r6Var = new r6(true, false, false);
        this.d = r6Var;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.f32121b = 17;
        int w02 = y6.w0(y6.f23448i6, u6Var);
        if (this.f49913b != w02) {
            y6.E1(this.f49912a, w02, false);
            this.f49913b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f49912a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f49915f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f26889o = i10;
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
        float f7 = this.f49915f.e;
        if (f7 < 1.0f) {
            v.b(canvas, this.d, 1.0f - f7);
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
