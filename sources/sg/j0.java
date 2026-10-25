package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nt0;
public final class j0 extends FrameLayout {
    public final nt0 f48264a;

    public j0(nt0 nt0Var, Context context) {
        super(context);
        this.f48264a = nt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        nt0 nt0Var = this.f48264a;
        Paint paint = nt0Var.f48348q1;
        q1 q1Var = nt0Var.f48340j1;
        paint.setAlpha((int) ((1.0f - nt0Var.f48352s1) * q1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        q1Var.b(rectF);
        l0 l0Var = nt0Var.R0;
        int top = l0Var.getTop();
        float translationY = q1Var.getTranslationY() + l0Var.getTranslationY() + q1Var.getTop() + top;
        float f7 = rectF.left;
        v1 v1Var = nt0Var.f48341k1;
        rectF.set(AndroidUtilities.lerp(f7, v1Var.getLeft(), nt0Var.f48352s1), AndroidUtilities.lerp(rectF.top + translationY, v1Var.getTop() - v1Var.getTranslationY(), nt0Var.f48352s1), AndroidUtilities.lerp(rectF.right, v1Var.getRight(), nt0Var.f48352s1), AndroidUtilities.lerp(translationY + rectF.bottom, v1Var.getBottom() - v1Var.getTranslationY(), nt0Var.f48352s1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, nt0Var.f48352s1));
        Paint paint2 = nt0Var.f48350r1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * nt0Var.f48352s1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            nt0 nt0Var = this.f48264a;
            if (nt0Var.f48354t1) {
                nt0Var.y0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
