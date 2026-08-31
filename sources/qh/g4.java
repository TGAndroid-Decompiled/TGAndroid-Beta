package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class g4 extends FrameLayout {
    public final f9 f45358a;

    public g4(f9 f9Var, Context context) {
        super(context);
        this.f45358a = f9Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f9 f9Var = this.f45358a;
        Paint paint = f9Var.f44971o1;
        eg.i2 i2Var = f9Var.f44960i1;
        paint.setAlpha((int) ((1.0f - f9Var.f44975q1) * i2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        y4 y4Var = f9Var.Q0;
        int top = y4Var.getTop();
        float translationY = i2Var.getTranslationY() + y4Var.getTranslationY() + i2Var.getTop() + top;
        float f10 = rectF.left;
        eg.o2 o2Var = f9Var.f44962j1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), f9Var.f44975q1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), f9Var.f44975q1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), f9Var.f44975q1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), f9Var.f44975q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, f9Var.f44975q1));
        Paint paint2 = f9Var.f44973p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * f9Var.f44975q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            f9 f9Var = this.f45358a;
            if (f9Var.f44977r1) {
                f9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
