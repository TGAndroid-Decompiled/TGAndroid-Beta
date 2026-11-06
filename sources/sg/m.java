package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import c8.j9;
public final class m extends View {
    public final Paint f55045a;
    public final Paint f55046b;
    public int f55047c;
    public int d;
    public final q f55048e;

    public m(q qVar, Context context) {
        super(context);
        this.f55048e = qVar;
        this.f55045a = new Paint(1);
        Paint paint = new Paint(1);
        this.f55046b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
    }

    public final void a() {
        int argb;
        int argb2;
        int i7 = this.f55047c;
        q qVar = this.f55048e;
        if (i7 != 1) {
            if (i7 != 2) {
                argb = Color.argb(255, 0, Color.green(qVar.f55093m1), Color.blue(qVar.f55093m1));
                argb2 = Color.argb(255, 255, Color.green(qVar.f55093m1), Color.blue(qVar.f55093m1));
            } else {
                argb = Color.argb(255, Color.red(qVar.f55093m1), Color.green(qVar.f55093m1), 0);
                argb2 = Color.argb(255, Color.red(qVar.f55093m1), Color.green(qVar.f55093m1), 255);
            }
        } else {
            argb = Color.argb(255, Color.red(qVar.f55093m1), 0, Color.blue(qVar.f55093m1));
            argb2 = Color.argb(255, Color.red(qVar.f55093m1), 255, Color.blue(qVar.f55093m1));
        }
        this.f55045a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        int argb;
        float L = org.telegram.messenger.g0.L(6.0f);
        float a10 = j9.a(((f10 - L) + (org.telegram.messenger.g0.L(13.0f) - (this.f55046b.getStrokeWidth() / 2.0f))) / (getWidth() - (L * 2.0f)), 0.0f, 1.0f);
        int i7 = this.f55047c;
        q qVar = this.f55048e;
        if (i7 != 1) {
            if (i7 != 2) {
                argb = Color.argb(255, (int) (a10 * 255.0f), Color.green(qVar.f55093m1), Color.blue(qVar.f55093m1));
            } else {
                argb = Color.argb(255, Color.red(qVar.f55093m1), Color.green(qVar.f55093m1), (int) (a10 * 255.0f));
            }
        } else {
            argb = Color.argb(255, Color.red(qVar.f55093m1), (int) (a10 * 255.0f), Color.blue(qVar.f55093m1));
        }
        qVar.I0(i0.a.o(argb, Color.alpha(qVar.f55093m1)), 4);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int green;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float L = org.telegram.messenger.g0.L(6.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(L, height - L, getWidth() - L, height + L);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), this.f55045a);
        int i7 = this.f55047c;
        q qVar = this.f55048e;
        if (i7 != 1) {
            if (i7 != 2) {
                green = Color.red(qVar.f55093m1);
            } else {
                green = Color.blue(qVar.f55093m1);
            }
        } else {
            green = Color.green(qVar.f55093m1);
        }
        float f10 = green / 255.0f;
        float L2 = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.f55046b;
        float strokeWidth = L2 - (paint.getStrokeWidth() / 2.0f);
        float max = Math.max(L + strokeWidth, (((getWidth() - (2.0f * L)) * f10) + L) - strokeWidth);
        canvas.drawCircle(max, height, L2, paint);
        tg.y0.A1(max, height, strokeWidth, this.d, canvas);
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
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
