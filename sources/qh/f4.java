package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class f4 extends FrameLayout {
    public final e9 f45339a;

    public f4(e9 e9Var, Context context) {
        super(context);
        this.f45339a = e9Var;
        setWillNotDraw(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        e9 e9Var = this.f45339a;
        Paint paint = e9Var.f44948o1;
        eg.i2 i2Var = e9Var.f44937i1;
        paint.setAlpha((int) ((1.0f - e9Var.f44952q1) * i2Var.getAlpha() * 20.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        i2Var.b(rectF);
        x4 x4Var = e9Var.Q0;
        int top = x4Var.getTop();
        float translationY = i2Var.getTranslationY() + x4Var.getTranslationY() + i2Var.getTop() + top;
        float f10 = rectF.left;
        eg.o2 o2Var = e9Var.f44939j1;
        rectF.set(AndroidUtilities.lerp(f10, o2Var.getLeft(), e9Var.f44952q1), AndroidUtilities.lerp(rectF.top + translationY, o2Var.getTop() - o2Var.getTranslationY(), e9Var.f44952q1), AndroidUtilities.lerp(rectF.right, o2Var.getRight(), e9Var.f44952q1), AndroidUtilities.lerp(translationY + rectF.bottom, o2Var.getBottom() - o2Var.getTranslationY(), e9Var.f44952q1));
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, e9Var.f44952q1));
        Paint paint2 = e9Var.f44950p1;
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * e9Var.f44952q1));
        canvas.drawRoundRect(rectF, dp, dp, paint2);
        paint2.setAlpha(alpha);
        canvas.drawRoundRect(rectF, dp, dp, paint);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            e9 e9Var = this.f45339a;
            if (e9Var.f44954r1) {
                e9Var.P0(false);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
