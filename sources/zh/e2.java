package zh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.je;
import org.telegram.ui.Components.ok0;
public final class e2 implements ok0 {
    public final a3 f48368a;

    public e2(a3 a3Var) {
        this.f48368a = a3Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final boolean k() {
        return this.f48368a.N0();
    }

    @Override
    public final void l(View view, yg.p0 p0Var, boolean z10, boolean z11) {
        a3 a3Var = this.f48368a;
        if (!z10) {
            a3Var.n0(new xh.m5(this, view, p0Var, z10, z11));
        } else {
            org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new je(this, z10, p0Var, view));
        }
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        a3 a3Var = this.f48368a;
        Paint paint = a3Var.f48194n2;
        com.google.firebase.messaging.n nVar = a3Var.P1;
        float f12 = -f10;
        float f13 = -f11;
        nVar.z(f12, f13, a3Var.getMeasuredWidth() + f12, a3Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) nVar.f6103a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) nVar.f6103a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void s() {
        ((l7) this.f48368a.Q1).b(false);
    }

    @Override
    public final boolean t() {
        return false;
    }
}
