package xf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r extends View {
    public final Paint f49336a;
    public final Paint f49337b;
    public int f49338c;
    public int d;
    public final x f49339e;

    public r(x xVar, Context context) {
        super(context);
        this.f49339e = xVar;
        this.f49336a = new Paint(1);
        Paint paint = new Paint(1);
        this.f49337b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i9 = this.f49338c;
        x xVar = this.f49339e;
        if (i9 != 1) {
            if (i9 != 2) {
                argb = Color.argb(255, 0, Color.green(xVar.f49411f), Color.blue(xVar.f49411f));
                argb2 = Color.argb(255, 255, Color.green(xVar.f49411f), Color.blue(xVar.f49411f));
            } else {
                argb = Color.argb(255, Color.red(xVar.f49411f), Color.green(xVar.f49411f), 0);
                argb2 = Color.argb(255, Color.red(xVar.f49411f), Color.green(xVar.f49411f), 255);
            }
        } else {
            argb = Color.argb(255, Color.red(xVar.f49411f), 0, Color.blue(xVar.f49411f));
            argb2 = Color.argb(255, Color.red(xVar.f49411f), 255, Color.blue(xVar.f49411f));
        }
        this.f49336a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        int argb;
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = g7.n.a(((f10 - dp) + (AndroidUtilities.dp(13.0f) - (this.f49337b.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        int i9 = this.f49338c;
        x xVar = this.f49339e;
        if (i9 != 1) {
            if (i9 != 2) {
                argb = Color.argb(255, (int) (a2 * 255.0f), Color.green(xVar.f49411f), Color.blue(xVar.f49411f));
            } else {
                argb = Color.argb(255, Color.red(xVar.f49411f), Color.green(xVar.f49411f), (int) (a2 * 255.0f));
            }
        } else {
            argb = Color.argb(255, Color.red(xVar.f49411f), (int) (a2 * 255.0f), Color.blue(xVar.f49411f));
        }
        xVar.m(i0.a.k(argb, Color.alpha(xVar.f49411f)), 4);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int green;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float dp = AndroidUtilities.dp(6.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(dp, height - dp, getWidth() - dp, height + dp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f49336a);
        int i9 = this.f49338c;
        x xVar = this.f49339e;
        if (i9 != 1) {
            if (i9 != 2) {
                green = Color.red(xVar.f49411f);
            } else {
                green = Color.blue(xVar.f49411f);
            }
        } else {
            green = Color.green(xVar.f49411f);
        }
        float f10 = green / 255.0f;
        float dp2 = AndroidUtilities.dp(13.0f);
        Paint paint = this.f49337b;
        float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * f10) + dp) - strokeWidth);
        canvas.drawCircle(max, height, dp2, paint);
        yf.i1.x1(max, height, strokeWidth, this.d, canvas);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
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
