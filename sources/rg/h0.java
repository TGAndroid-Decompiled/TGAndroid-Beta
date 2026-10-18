package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.it0;
public final class h0 extends FrameLayout {
    public final it0 f45355a;

    public h0(it0 it0Var, Context context) {
        super(context);
        this.f45355a = it0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        it0 it0Var = this.f45355a;
        Paint paint = it0Var.B1;
        o1 o1Var = it0Var.f45498u1;
        paint.setAlpha((int) ((1.0f - it0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        j0 j0Var = it0Var.f45469c1;
        int top = j0Var.getTop();
        float translationY = o1Var.getTranslationY() + j0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = it0Var.f45499v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), it0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), it0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), it0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), it0Var.D1));
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
            it0 it0Var = this.f45355a;
            if (it0Var.E1) {
                it0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
