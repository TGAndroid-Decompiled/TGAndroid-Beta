package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;
public final class i0 extends FrameLayout {
    public final au0 f41643a;

    public i0(au0 au0Var, Context context) {
        super(context);
        this.f41643a = au0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        au0 au0Var = this.f41643a;
        Paint paint = au0Var.B1;
        o1 o1Var = au0Var.f41769u1;
        paint.setAlpha((int) ((1.0f - au0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        k0 k0Var = au0Var.f41740c1;
        int top = k0Var.getTop();
        float translationY = o1Var.getTranslationY() + k0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = au0Var.f41770v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), au0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), au0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), au0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), au0Var.D1));
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
            au0 au0Var = this.f41643a;
            if (au0Var.E1) {
                au0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
