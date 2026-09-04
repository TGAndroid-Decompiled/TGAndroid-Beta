package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import yf.p;
public final class d extends c {
    public final p6 d;
    public final bj0 f46575e;
    public final le.b f46576f;
    public float h;

    public d(t1 t1Var, f6 f6Var) {
        super(f6Var);
        bj0 bj0Var = new bj0(t1Var);
        this.f46575e = bj0Var;
        bj0Var.d(null, true, false);
        bj0Var.v = 650.0f;
        bj0Var.e(0.69f, false);
        bj0Var.f24731p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f46576f = new le.b(t1Var, pr.h, 260L);
        p6 p6Var = new p6(true, false, false, false);
        this.d = p6Var;
        p6Var.u(AndroidUtilities.bold());
        p6Var.t(AndroidUtilities.dp(13.0f));
        p6Var.f29285b = 17;
        int v02 = j6.v0(j6.f20753i6, f6Var);
        if (this.f46573b != v02) {
            j6.B1(this.f46572a, v02, false);
            this.f46573b = v02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f46572a.setAlpha(i10);
        this.d.f29303w = i10;
    }

    public final float b() {
        return this.f46576f.f15368e;
    }

    public final void c(int i10) {
        this.d.r(i10);
        this.f46575e.f24730o = i10;
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
        float f7 = this.f46576f.f15368e;
        if (f7 < 1.0f) {
            p.b(canvas, this.d, 1.0f - f7);
        }
        if (f7 > 0.0f) {
            float exactCenterX = getBounds().exactCenterX();
            float exactCenterY = getBounds().exactCenterY();
            canvas.save();
            canvas.scale(f7, f7, exactCenterX, exactCenterY);
            this.f46575e.a(canvas);
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
        this.f46575e.f(centerX - dp, centerY - dp, centerX + dp, centerY + dp);
    }
}
