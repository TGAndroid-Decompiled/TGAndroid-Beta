package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gt0;
public final class h0 extends FrameLayout {
    public final gt0 f45362a;

    public h0(gt0 gt0Var, Context context) {
        super(context);
        this.f45362a = gt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        gt0 gt0Var = this.f45362a;
        Paint paint = gt0Var.B1;
        o1 o1Var = gt0Var.f45505u1;
        paint.setAlpha((int) ((1.0f - gt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        j0 j0Var = gt0Var.f45476c1;
        int top = j0Var.getTop();
        float translationY = o1Var.getTranslationY() + j0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = gt0Var.f45506v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), gt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), gt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), gt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), gt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, gt0Var.D1));
        Paint paint2 = gt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * gt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            gt0 gt0Var = this.f45362a;
            if (gt0Var.E1) {
                gt0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
