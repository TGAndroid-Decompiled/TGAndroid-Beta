package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.au0;
public final class k0 extends FrameLayout {
    public final au0 f41423a;

    public k0(au0 au0Var, Context context) {
        super(context);
        this.f41423a = au0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        au0 au0Var = this.f41423a;
        Paint paint = au0Var.B1;
        r1 r1Var = au0Var.f41543u1;
        paint.setAlpha((int) ((1.0f - au0Var.D1) * r1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        r1Var.b(rectF);
        m0 m0Var = au0Var.f41514c1;
        int top = m0Var.getTop();
        float translationY = r1Var.getTranslationY() + m0Var.getTranslationY() + r1Var.getTop() + top;
        float f7 = rectF.left;
        w1 w1Var = au0Var.f41544v1;
        rectF.set(AndroidUtilities.lerp(f7, w1Var.getLeft(), au0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, w1Var.getTop() - w1Var.getTranslationY(), au0Var.D1), AndroidUtilities.lerp(rectF.right, w1Var.getRight(), au0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, w1Var.getBottom() - w1Var.getTranslationY(), au0Var.D1));
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
            au0 au0Var = this.f41423a;
            if (au0Var.E1) {
                au0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
