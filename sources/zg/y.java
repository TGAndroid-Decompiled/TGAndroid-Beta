package zg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class y extends ViewOutlineProvider {
    public final Rect f49461a = new Rect();
    public final RectF f49462b = new RectF();
    public final RectF f49463c = new RectF();
    public final b0 d;

    public y(b0 b0Var) {
        this.d = b0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        b0 b0Var = this.d;
        float lerp = AndroidUtilities.lerp(b0Var.e, AndroidUtilities.dp(8.0f), b0Var.f49253j);
        RectF rectF = this.f49462b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = b0Var.f49250f;
        float f7 = b0Var.f49253j;
        RectF rectF3 = this.f49463c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f49461a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
