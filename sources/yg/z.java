package yg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class z extends ViewOutlineProvider {
    public final Rect f47164a = new Rect();
    public final RectF f47165b = new RectF();
    public final RectF f47166c = new RectF();
    public final c0 d;

    public z(c0 c0Var) {
        this.d = c0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        c0 c0Var = this.d;
        float lerp = AndroidUtilities.lerp(c0Var.e, AndroidUtilities.dp(8.0f), c0Var.f46956j);
        RectF rectF = this.f47165b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = c0Var.f46953f;
        float f7 = c0Var.f46956j;
        RectF rectF3 = this.f47166c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f47164a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
