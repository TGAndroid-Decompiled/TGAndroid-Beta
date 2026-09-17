package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;
public final class k0 extends FrameLayout {
    public final cu0 f41449a;

    public k0(cu0 cu0Var, Context context) {
        super(context);
        this.f41449a = cu0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cu0 cu0Var = this.f41449a;
        Paint paint = cu0Var.B1;
        r1 r1Var = cu0Var.f41569u1;
        paint.setAlpha((int) ((1.0f - cu0Var.D1) * r1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        m0 m0Var = cu0Var.f41540c1;
        int top = m0Var.getTop();
        float translationY = r1Var.getTranslationY() + m0Var.getTranslationY() + r1Var.getTop() + top;
        float f7 = rectF.left;
        w1 w1Var = cu0Var.f41570v1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), cu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), cu0Var.D1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), cu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), cu0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, cu0Var.D1));
        Paint paint2 = cu0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * cu0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            cu0 cu0Var = this.f41449a;
            if (cu0Var.E1) {
                cu0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
