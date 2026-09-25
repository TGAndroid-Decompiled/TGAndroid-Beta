package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.st0;
public final class j0 extends FrameLayout {
    public final st0 f41700a;

    public j0(st0 st0Var, Context context) {
        super(context);
        this.f41700a = st0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        st0 st0Var = this.f41700a;
        Paint paint = st0Var.B1;
        p1 p1Var = st0Var.f41803u1;
        paint.setAlpha((int) ((1.0f - st0Var.D1) * p1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        p1Var.b(rectF);
        l0 l0Var = st0Var.f41774c1;
        int top = l0Var.getTop();
        float translationY = p1Var.getTranslationY() + l0Var.getTranslationY() + p1Var.getTop() + top;
        float f7 = rectF.left;
        u1 u1Var = st0Var.f41804v1;
        rectF.set(AndroidUtilities.lerp(f7, u1Var.getLeft(), st0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, u1Var.getTop() - u1Var.getTranslationY(), st0Var.D1), AndroidUtilities.lerp(rectF.right, u1Var.getRight(), st0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, u1Var.getBottom() - u1Var.getTranslationY(), st0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, st0Var.D1));
        Paint paint2 = st0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * st0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            st0 st0Var = this.f41700a;
            if (st0Var.E1) {
                st0Var.A0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
