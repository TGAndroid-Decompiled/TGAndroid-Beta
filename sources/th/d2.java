package th;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nd;
import org.telegram.ui.kp;
public final class d2 implements mj0 {
    public final z2 f48886a;

    public d2(z2 z2Var) {
        this.f48886a = z2Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final boolean h() {
        return this.f48886a.L0();
    }

    @Override
    public final void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
        z2 z2Var = this.f48886a;
        Paint paint = z2Var.W1;
        j2.f fVar = z2Var.f49794y1;
        float f12 = -f10;
        float f13 = -f11;
        fVar.x(f12, f13, z2Var.getMeasuredWidth() + f12, z2Var.getMeasuredHeight() + f13);
        if (f7 > 0.0f) {
            canvas.drawRoundRect(rectF, f7, f7, (Paint) fVar.f9348a);
            canvas.drawRoundRect(rectF, f7, f7, paint);
            return;
        }
        canvas.drawRect(rectF, (Paint) fVar.f9348a);
        canvas.drawRect(rectF, paint);
    }

    @Override
    public final void t() {
        ((f7) this.f48886a.f49797z1).b(false);
    }

    @Override
    public final void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        z2 z2Var = this.f48886a;
        if (!z10) {
            z2Var.l0(new kp(this, view, o0Var, z10, z11));
        } else {
            org.telegram.ui.Components.s4.Z(z2Var.f49744l2, 1, z2Var.f49740k1, new nd(this, z10, o0Var, view));
        }
    }
}
