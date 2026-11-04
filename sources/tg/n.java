package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import b8.be;
public final class n extends View {
    public final Paint f55255a;
    public final Paint f55256b;
    public final Paint f55257c;
    public float d;
    public float f55258e;
    public final Drawable f55259f;
    public final float[] h;
    public final q f55260n;

    public n(q qVar, Context context) {
        super(context);
        this.f55260n = qVar;
        this.f55255a = new Paint(1);
        this.f55256b = new Paint(1);
        Paint paint = new Paint(1);
        this.f55257c = paint;
        this.h = new float[3];
        setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        this.f55259f = context.getDrawable(2131231599);
    }

    public final void a(MotionEvent motionEvent) {
        float f10;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y9 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f55258e = y9;
        float[] fArr = this.h;
        fArr[0] = y9 * 360.0f;
        float f11 = this.d;
        int i3 = (f11 > 0.22f ? 1 : (f11 == 0.22f ? 0 : -1));
        float f12 = 1.0f;
        if (i3 > 0 && f11 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i3 <= 0) {
                f10 = 1.0f - (f11 / 0.22f);
            } else {
                f10 = (f11 - 0.78f) / 0.22000003f;
            }
            fArr[1] = org.telegram.messenger.g0.T1(1.0f, 0.0f, f10);
            float f13 = this.d;
            if (f13 > 0.22f) {
                f12 = org.telegram.messenger.g0.T1(1.0f, 0.0f, (f13 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f12;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        q qVar = this.f55260n;
        qVar.f55288n1 = HSVToColor;
        qVar.I0(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f55255a);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f55256b);
        float L = org.telegram.messenger.g0.L(13.0f);
        Paint paint = this.f55257c;
        float L2 = org.telegram.messenger.g0.L(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f10 = width;
        float a10 = be.a(this.d * f10, L2, f10 - L2) + getPaddingLeft();
        float f11 = height;
        float a11 = be.a(this.f55258e * f11, L2, f11 - L2) + getPaddingTop();
        Rect rect = org.telegram.messenger.g0.Q;
        Drawable drawable = this.f55259f;
        drawable.getPadding(rect);
        int i3 = rect.bottom;
        drawable.setBounds((int) ((a10 - L) - rect.left), (int) ((a11 - L) - rect.top), (int) (a10 + L + i3), (int) (a11 + L + i3));
        drawable.draw(canvas);
        canvas.drawCircle(a10, a11, L, paint);
        ug.x0.A1(a10, a11, L - (paint.getStrokeWidth() / 2.0f), i0.a.o(this.f55260n.f55288n1, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        this.f55255a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i10 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f55256b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i3 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
                } else {
                    a(motionEvent);
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                a(motionEvent);
            }
        } else {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(motionEvent);
        }
        return true;
    }
}
