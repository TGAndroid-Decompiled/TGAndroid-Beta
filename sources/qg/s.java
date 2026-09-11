package qg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class s extends View {
    public final Paint f44554a;
    public final Paint f44555b;
    public final Paint f44556c;
    public float d;
    public float f44557e;
    public final Drawable f44558f;
    public final float[] h;
    public final x f44559n;

    public s(x xVar, Context context) {
        super(context);
        this.f44559n = xVar;
        this.f44554a = new Paint(1);
        this.f44555b = new Paint(1);
        Paint paint = new Paint(1);
        this.f44556c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f44558f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        float f7;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y3 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f44557e = y3;
        float[] fArr = this.h;
        fArr[0] = y3 * 360.0f;
        float f10 = this.d;
        float f11 = 1.0f;
        int i10 = (f10 > 0.22f ? 1 : (f10 == 0.22f ? 0 : -1));
        if (i10 > 0 && f10 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i10 <= 0) {
                f7 = 1.0f - (f10 / 0.22f);
            } else {
                f7 = (f10 - 0.78f) / 0.22000003f;
            }
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f7);
            float f12 = this.d;
            if (f12 > 0.22f) {
                f11 = AndroidUtilities.lerp(1.0f, 0.0f, (f12 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f11;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        x xVar = this.f44559n;
        xVar.f44619f = HSVToColor;
        xVar.m(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f44554a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f44555b);
        float dp = AndroidUtilities.dp(13.0f);
        Paint paint = this.f44556c;
        float dp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f7 = width;
        float a2 = w7.p.a(this.d * f7, dp2, f7 - dp2) + getPaddingLeft();
        float f10 = height;
        float a10 = w7.p.a(this.f44557e * f10, dp2, f10 - dp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f44558f;
        drawable.getPadding(rect);
        int i10 = rect.bottom;
        drawable.setBounds((int) ((a2 - dp) - rect.left), (int) ((a10 - dp) - rect.top), (int) (a2 + dp + i10), (int) (a10 + dp + i10));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a10, dp, paint);
        rg.k1.w1(a2, a10, dp - (paint.getStrokeWidth() / 2.0f), i0.a.k(this.f44559n.f44619f, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f44554a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f44555b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
