package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.it0;
public final class i0 extends FrameLayout {
    public final it0 f45796a;

    public i0(it0 it0Var, Context context) {
        super(context);
        this.f45796a = it0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        it0 it0Var = this.f45796a;
        Paint paint = it0Var.B1;
        p1 p1Var = it0Var.f45914u1;
        paint.setAlpha((int) ((1.0f - it0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        k0 k0Var = it0Var.f45885c1;
        int top = k0Var.getTop();
        float translationY = p1Var.getTranslationY() + k0Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        u1 u1Var = it0Var.f45915v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), it0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), it0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), it0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), it0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, it0Var.D1));
        Paint paint2 = it0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * it0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            it0 it0Var = this.f45796a;
            if (it0Var.E1) {
                it0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
