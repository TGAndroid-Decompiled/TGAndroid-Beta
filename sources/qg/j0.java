package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;
public final class j0 extends FrameLayout {
    public final au0 f41713a;

    public j0(au0 au0Var, Context context) {
        super(context);
        this.f41713a = au0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        au0 au0Var = this.f41713a;
        Paint paint = au0Var.B1;
        p1 p1Var = au0Var.f41816u1;
        paint.setAlpha((int) ((1.0f - au0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        l0 l0Var = au0Var.f41787c1;
        int top = l0Var.getTop();
        float translationY = p1Var.getTranslationY() + l0Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        u1 u1Var = au0Var.f41817v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), au0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), au0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), au0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), au0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, au0Var.D1));
        Paint paint2 = au0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * au0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            au0 au0Var = this.f41713a;
            if (au0Var.E1) {
                au0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
