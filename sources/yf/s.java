package yf;

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

    public final Paint f50064a;

    public final Paint f50065b;

    public final Paint f50066c;
    public float d;

    public float f50067e;

    public final Drawable f50068f;
    public final float[] h;

    public final x f50069n;

    public s(x xVar, Context context) {
        super(context);
        this.f50069n = xVar;
        this.f50064a = new Paint(1);
        this.f50065b = new Paint(1);
        Paint paint = new Paint(1);
        this.f50066c = paint;
        this.h = new float[3];
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        this.f50068f = context.getDrawable(R.drawable.knob_shadow);
    }

    public final void a(MotionEvent motionEvent) {
        this.d = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
        float y10 = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
        this.f50067e = y10;
        float[] fArr = this.h;
        fArr[0] = y10 * 360.0f;
        float f10 = this.d;
        if (f10 <= 0.22f || f10 >= 0.78f) {
            fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f10 <= 0.22f ? 1.0f - (f10 / 0.22f) : (f10 - 0.78f) / 0.22000003f);
            float f11 = this.d;
            fArr[2] = f11 > 0.22f ? AndroidUtilities.lerp(1.0f, 0.0f, (f11 - 0.78f) / 0.22000003f) : 1.0f;
        } else {
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
        }
        int iHSVToColor = Color.HSVToColor(fArr);
        x xVar = this.f50069n;
        xVar.f50115f = iHSVToColor;
        xVar.m(iHSVToColor, 0);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f50064a);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f50065b);
        float fDp = AndroidUtilities.dp(13.0f);
        Paint paint = this.f50066c;
        float strokeWidth = fDp - (paint.getStrokeWidth() / 2.0f);
        float fDp2 = AndroidUtilities.dp(16.0f);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float f10 = width;
        float fA = h7.n.a(this.d * f10, fDp2, f10 - fDp2) + getPaddingLeft();
        float f11 = height;
        float fA2 = h7.n.a(this.f50067e * f11, fDp2, f11 - fDp2) + getPaddingTop();
        Rect rect = AndroidUtilities.rectTmp2;
        Drawable drawable = this.f50068f;
        drawable.getPadding(rect);
        int i10 = (int) ((fA - fDp) - rect.left);
        int i11 = (int) ((fA2 - fDp) - rect.top);
        int i12 = rect.bottom;
        drawable.setBounds(i10, i11, (int) (fA + fDp + i12), (int) (fA2 + fDp + i12));
        drawable.draw(canvas);
        canvas.drawCircle(fA, fA2, fDp, paint);
        zf.i1.x1(fA, fA2, strokeWidth, i0.b.k(this.f50069n.f50115f, 255), canvas);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f50064a.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i11 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
        this.f50065b.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i10 - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            a(motionEvent);
        } else if (actionMasked == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            a(motionEvent);
        } else if (actionMasked == 2) {
            a(motionEvent);
        } else if (actionMasked == 3) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return true;
    }
}
