package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pt0;
public final class i0 extends FrameLayout {
    public final pt0 f48270a;

    public i0(pt0 pt0Var, Context context) {
        super(context);
        this.f48270a = pt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        pt0 pt0Var = this.f48270a;
        Paint paint = pt0Var.f48377q1;
        p1 p1Var = pt0Var.f48369j1;
        paint.setAlpha((int) ((1.0f - pt0Var.f48381s1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        k0 k0Var = pt0Var.R0;
        int top = k0Var.getTop();
        float translationY = p1Var.getTranslationY() + k0Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        u1 u1Var = pt0Var.f48370k1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), pt0Var.f48381s1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), pt0Var.f48381s1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), pt0Var.f48381s1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), pt0Var.f48381s1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, pt0Var.f48381s1));
        Paint paint2 = pt0Var.f48379r1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * pt0Var.f48381s1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            pt0 pt0Var = this.f48270a;
            if (pt0Var.f48383t1) {
                pt0Var.y0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
