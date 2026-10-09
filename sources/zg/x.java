package zg;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
public final class x extends ViewOutlineProvider {
    public final Rect f54680a = new Rect();
    public final RectF f54681b = new RectF();
    public final RectF f54682c = new RectF();
    public final a0 d;

    public x(a0 a0Var) {
        this.d = a0Var;
    }

    @Override
    public final void getOutline(View view, Outline outline) {
        a0 a0Var = this.d;
        float lerp = AndroidUtilities.lerp(a0Var.f54452e, AndroidUtilities.dp(8.0f), a0Var.f54456j);
        RectF rectF = this.f54681b;
        rectF.set(0.0f, 0.0f, view.getMeasuredWidth(), view.getMeasuredHeight());
        RectF rectF2 = a0Var.f54453f;
        float f7 = a0Var.f54456j;
        RectF rectF3 = this.f54682c;
        AndroidUtilities.lerp(rectF2, rectF, f7, rectF3);
        Rect rect = this.f54680a;
        rectF3.round(rect);
        outline.setRoundRect(rect, lerp);
    }
}
