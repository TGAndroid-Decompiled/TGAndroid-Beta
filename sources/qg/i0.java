package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;
public final class i0 extends FrameLayout {
    public final cu0 f46218a;

    public i0(cu0 cu0Var, Context context) {
        super(context);
        this.f46218a = cu0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cu0 cu0Var = this.f46218a;
        Paint paint = cu0Var.B1;
        o1 o1Var = cu0Var.f46337u1;
        paint.setAlpha((int) ((1.0f - cu0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        k0 k0Var = cu0Var.f46308c1;
        int top = k0Var.getTop();
        float translationY = o1Var.getTranslationY() + k0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = cu0Var.f46338v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), cu0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), cu0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), cu0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), cu0Var.D1));
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
            cu0 cu0Var = this.f46218a;
            if (cu0Var.E1) {
                cu0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
