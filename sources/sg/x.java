package sg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class x extends ViewOutlineProvider {
    public final Rect f48495a = new Rect();
    public final RectF f48496b = new RectF();
    public final RectF f48497c = new RectF();
    public final b0 d;

    public x(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.i0.T1(b0Var.e, org.telegram.messenger.i0.L(8.0f), b0Var.f48292j);
        RectF rectF = this.f48496b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f48289f;
        float f7 = b0Var.f48292j;
        RectF rectF3 = this.f48497c;
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF3);
        Rect rect = this.f48495a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
