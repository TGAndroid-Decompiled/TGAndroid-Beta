package qg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class p extends View {
    public final Paint f45010a;
    public final Paint f45011b;
    public float f45012c;
    public final y d;

    public p(y yVar, Context context) {
        super(context);
        this.d = yVar;
        this.f45010a = new Paint(1);
        Paint paint = new Paint(1);
        this.f45011b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }

    public final void a() {
        this.f45010a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, this.d.f45128f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f7) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = w7.r.a(((f7 - dp) + (AndroidUtilities.dp(13.0f) - (this.f45011b.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.f45012c = a2;
        y yVar = this.d;
        yVar.m(i0.a.o(yVar.f45128f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        float f7 = height - dp;
        float f10 = height + dp;
        rectF.set(dp, f7, getWidth() - dp, f10);
        canvas.save();
        y yVar = this.d;
        yVar.e.rewind();
        yVar.e.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.clipPath(yVar.e);
        rg.j1.C1(canvas, rectF, AndroidUtilities.dp(6.0f));
        canvas.restore();
        rectF.set(dp, f7, getWidth() - dp, f10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f45010a);
        float dp2 = AndroidUtilities.dp(13.0f);
        Paint paint = this.f45011b;
        float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.f45012c) + dp) - strokeWidth);
        canvas.drawCircle(max, height, dp2, paint);
        rg.j1.D1(max, height, strokeWidth, i0.a.o(yVar.f45128f, (int) (this.f45012c * 255.0f)), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        a();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            } else {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
