package zg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class z extends ViewOutlineProvider {
    public final Rect f49507a = new Rect();
    public final RectF f49508b = new RectF();
    public final RectF f49509c = new RectF();
    public final c0 d;

    public z(c0 c0Var) {
        this.d = c0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        c0 c0Var = this.d;
        float lerp = AndroidUtilities.lerp(c0Var.e, AndroidUtilities.dp(8.0f), c0Var.f49305j);
        RectF rectF = this.f49508b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = c0Var.f49302f;
        float f7 = c0Var.f49305j;
        RectF rectF3 = this.f49509c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f49507a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
