package zf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ys0;

public final class f0 extends d {
    public final Paint h;

    public long f50405n;

    public float f50406r;

    public float f50407s;
    public final ys0 v;

    public f0(ys0 ys0Var, Context context, e0 e0Var) {
        super(context, e0Var);
        this.v = ys0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int stickyX;
        int stickyY;
        float f10;
        float f11;
        Canvas canvas2;
        super.onDraw(canvas);
        long jMin = Math.min(16L, System.currentTimeMillis() - this.f50405n);
        this.f50405n = System.currentTimeMillis();
        ys0 ys0Var = this.v;
        j jVar = ys0Var.O0;
        if (jVar == null || jVar.f50464r || !jVar.f50463n) {
            stickyX = 0;
            stickyY = 0;
        } else {
            stickyX = jVar.getStickyX();
            stickyY = ys0Var.O0.getStickyY();
        }
        if (stickyX != 0) {
            float f12 = this.f50406r;
            if (f12 != 1.0f) {
                this.f50406r = Math.min(1.0f, (jMin / 150.0f) + f12);
                invalidate();
            } else if (stickyX == 0) {
                f10 = this.f50406r;
                if (f10 != 0.0f) {
                    this.f50406r = Math.max(0.0f, f10 - (jMin / 150.0f));
                    invalidate();
                }
            }
        } else if (stickyX == 0) {
            f10 = this.f50406r;
            if (f10 != 0.0f) {
                this.f50406r = Math.max(0.0f, f10 - (jMin / 150.0f));
                invalidate();
            }
        }
        if (stickyY != 0) {
            float f13 = this.f50407s;
            if (f13 != 1.0f) {
                this.f50407s = Math.min(1.0f, (jMin / 150.0f) + f13);
                invalidate();
            } else if (stickyY == 0) {
                f11 = this.f50407s;
                if (f11 != 0.0f) {
                    this.f50407s = Math.max(0.0f, f11 - (jMin / 150.0f));
                    invalidate();
                }
            }
        } else if (stickyY == 0) {
            f11 = this.f50407s;
            if (f11 != 0.0f) {
                this.f50407s = Math.max(0.0f, f11 - (jMin / 150.0f));
                invalidate();
            }
        }
        float f14 = this.f50407s;
        Paint paint = this.h;
        if (f14 != 0.0f) {
            paint.setAlpha((int) (f14 * 255.0f));
            float measuredHeight = getMeasuredHeight() / 2.0f;
            canvas2 = canvas;
            canvas2.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, paint);
        } else {
            canvas2 = canvas;
        }
        float f15 = this.f50406r;
        if (f15 != 0.0f) {
            paint.setAlpha((int) (f15 * 255.0f));
            float measuredWidth = getMeasuredWidth() / 2.0f;
            canvas2.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), paint);
        }
    }
}
