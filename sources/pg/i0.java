package pg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zt0;
public final class i0 extends FrameLayout {
    public final zt0 f40023a;

    public i0(zt0 zt0Var, Context context) {
        super(context);
        this.f40023a = zt0Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        zt0 zt0Var = this.f40023a;
        Paint paint = zt0Var.B1;
        o1 o1Var = zt0Var.f40155u1;
        paint.setAlpha((int) ((1.0f - zt0Var.D1) * o1Var.getAlpha() * 102.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        o1Var.b(rectF);
        k0 k0Var = zt0Var.f40126c1;
        int top = k0Var.getTop();
        float translationY = o1Var.getTranslationY() + k0Var.getTranslationY() + o1Var.getTop() + top;
        float f7 = rectF.left;
        t1 t1Var = zt0Var.f40156v1;
        rectF.set(AndroidUtilities.lerp(f7, t1Var.getLeft(), zt0Var.D1), AndroidUtilities.lerp(rectF.top + translationY, t1Var.getTop() - t1Var.getTranslationY(), zt0Var.D1), AndroidUtilities.lerp(rectF.right, t1Var.getRight(), zt0Var.D1), AndroidUtilities.lerp(translationY + rectF.bottom, t1Var.getBottom() - t1Var.getTranslationY(), zt0Var.D1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, zt0Var.D1));
        Paint paint2 = zt0Var.C1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * zt0Var.D1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            zt0 zt0Var = this.f40023a;
            if (zt0Var.E1) {
                zt0Var.z0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
