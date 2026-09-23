package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tt0;
public final class k0 extends FrameLayout {
    public final tt0 f41379a;

    public k0(tt0 tt0Var, Context context) {
        super(context);
        this.f41379a = tt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        tt0 tt0Var = this.f41379a;
        Paint paint = tt0Var.B1;
        r1 r1Var = tt0Var.f41499u1;
        paint.setAlpha((int) ((1.0f - tt0Var.D1) * r1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        m0 m0Var = tt0Var.f41470c1;
        int top = m0Var.getTop();
        float translationY = r1Var.getTranslationY() + m0Var.getTranslationY() + r1Var.getTop() + top;
        float f7 = rectF.left;
        w1 w1Var = tt0Var.f41500v1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), tt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), tt0Var.D1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), tt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), tt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, tt0Var.D1));
        Paint paint2 = tt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * tt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            tt0 tt0Var = this.f41379a;
            if (tt0Var.E1) {
                tt0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
