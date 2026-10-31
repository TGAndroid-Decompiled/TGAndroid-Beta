package sg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
public final class x extends ViewOutlineProvider {
    public final Rect f48484a = new Rect();
    public final RectF f48485b = new RectF();
    public final RectF f48486c = new RectF();
    public final b0 d;

    public x(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float T1 = org.telegram.messenger.i0.T1(b0Var.e, org.telegram.messenger.i0.L(8.0f), b0Var.f48281j);
        RectF rectF = this.f48485b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f48278f;
        float f7 = b0Var.f48281j;
        RectF rectF3 = this.f48486c;
        org.telegram.messenger.i0.Z1(rectF2, rectF, f7, rectF3);
        Rect rect = this.f48484a;
        rectF3.round(rect);
        outline.setRoundRect(rect, T1);
    }
}
