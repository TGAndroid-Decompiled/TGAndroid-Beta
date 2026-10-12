package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.r6;
import zf.q;
public final class d extends c {
    public final r6 d;
    public final ck0 e;
    public final ne.b f45834f;
    public float h;

    public d(u1 u1Var, c6 c6Var) {
        super(c6Var);
        ck0 ck0Var = new ck0(u1Var);
        this.e = ck0Var;
        ck0Var.d(null, true, false);
        ck0Var.v = 650.0f;
        ck0Var.e(0.69f, false);
        ck0Var.f24103p.setStrokeWidth(AndroidUtilities.dp(1.5f));
        this.f45834f = new ne.b(u1Var, es.h, 260L);
        r6 r6Var = new r6(true, false, false);
        this.d = r6Var;
        r6Var.x(AndroidUtilities.bold());
        r6Var.w(AndroidUtilities.dp(13.0f));
        r6Var.f28748b = 17;
        int w02 = g6.w0(g6.f19990i6, c6Var);
        if (this.f45832b != w02) {
            g6.C1(this.f45831a, w02, false);
            this.f45832b = w02;
        }
    }

    @Override
    public final void a(int i10) {
        this.f45831a.setAlpha(i10);
        this.d.B = i10;
    }

    public final float b() {
        return this.f45834f.e;
    }

    public final void c(int i10) {
        this.d.u(i10);
        this.e.f24102o = i10;
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
        float f7 = this.f45834f.e;
        if (f7 < 1.0f) {
            q.b(canvas, this.d, 1.0f - f7);
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
