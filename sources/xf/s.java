package xf;

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
    public final Paint f49346a;
    public final Paint f49347b;
    public final Paint f49348c;
    public float d;
    public float f49349e;
    public final Drawable f49350f;
    public final float[] h;
    public final x f49351n;

    public s(x xVar, Context context) {
        super(context);
        this.f49351n = xVar;
        this.f49346a = new Paint(1);
        this.f49347b = new Paint(1);
        Paint paint = new Paint(1);
        this.f49348c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f49350f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        float f10;
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y10 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f49349e = y10;
        float[] fArr = this.h;
        fArr[0] = y10 * 360.0f;
        float f11 = this.d;
        float f12 = 1.0f;
        int i9 = (f11 > 0.22f ? 1 : (f11 == 0.22f ? 0 : -1));
        if (i9 > 0 && f11 < 0.78f) {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        } else {
            if (i9 <= 0) {
                f10 = 1.0f - (f11 / 0.22f);
            } else {
                f10 = (f11 - 0.78f) / 0.22000003f;
            }
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f10);
            float f13 = this.d;
            if (f13 > 0.22f) {
                f12 = AndroidUtilities.lerp(1.0f, 0.0f, (f13 - 0.78f) / 0.22000003f);
            }
            fArr[2] = f12;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        x xVar = this.f49351n;
        xVar.f49411f = HSVToColor;
        xVar.m(HSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f49346a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f49347b);
        float dp = AndroidUtilities.dp(13.0f);
        Paint paint = this.f49348c;
        float dp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f10 = width;
        float a2 = g7.n.a(this.d * f10, dp2, f10 - dp2) + getPaddingLeft();
        float f11 = height;
        float a3 = g7.n.a(this.f49349e * f11, dp2, f11 - dp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f49350f;
        drawable.getPadding(rect);
        int i9 = rect.bottom;
        drawable.setBounds((int) ((a2 - dp) - rect.left), (int) ((a3 - dp) - rect.top), (int) (a2 + dp + i9), (int) (a3 + dp + i9));
        drawable.draw(canvas);
        canvas.drawCircle(a2, a3, dp, paint);
        yf.i1.x1(a2, a3, dp - (paint.getStrokeWidth() / 2.0f), i0.a.k(this.f49351n.f49411f, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        this.f49346a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i10 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f49347b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i9 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
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
