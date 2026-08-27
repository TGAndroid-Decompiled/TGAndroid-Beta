package yf;

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

    public final Paint f50044a;

    public final Paint f50045b;

    public int f50046c;
    public int d;

    public final x f50047e;

    public r(x xVar, Context context) {
        super(context);
        this.f50047e = xVar;
        this.f50044a = new Paint(1);
        Paint paint = new Paint(1);
        this.f50045b = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }

    public final void a() {
        int iArgb;
        int iArgb2;
        int i10 = this.f50046c;
        x xVar = this.f50047e;
        if (i10 == 1) {
            iArgb = Color.argb(255, Color.red(xVar.f50115f), 0, Color.blue(xVar.f50115f));
            iArgb2 = Color.argb(255, Color.red(xVar.f50115f), 255, Color.blue(xVar.f50115f));
        } else if (i10 != 2) {
            iArgb = Color.argb(255, 0, Color.green(xVar.f50115f), Color.blue(xVar.f50115f));
            iArgb2 = Color.argb(255, 255, Color.green(xVar.f50115f), Color.blue(xVar.f50115f));
        } else {
            iArgb = Color.argb(255, Color.red(xVar.f50115f), Color.green(xVar.f50115f), 0);
            iArgb2 = Color.argb(255, Color.red(xVar.f50115f), Color.green(xVar.f50115f), 255);
        }
        this.f50044a.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{iArgb, iArgb2}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void b(float f10) {
        int iArgb;
        float fDp = AndroidUtilities.dp(6.0f);
        float fA = h7.n.a(((f10 - fDp) + (AndroidUtilities.dp(13.0f) - (this.f50045b.getStrokeWidth() / 2.0f))) / (getWidth() - (fDp * 2.0f)), 0.0f, 1.0f);
        int i10 = this.f50046c;
        x xVar = this.f50047e;
        if (i10 != 1) {
            iArgb = i10 != 2 ? Color.argb(255, (int) (fA * 255.0f), Color.green(xVar.f50115f), Color.blue(xVar.f50115f)) : Color.argb(255, Color.red(xVar.f50115f), Color.green(xVar.f50115f), (int) (fA * 255.0f));
        } else {
            iArgb = Color.argb(255, Color.red(xVar.f50115f), (int) (fA * 255.0f), Color.blue(xVar.f50115f));
        }
        xVar.m(i0.b.k(iArgb, Color.alpha(xVar.f50115f)), 4);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int iGreen;
        super.onDraw(canvas);
        float height = getHeight() / 2.0f;
        float fDp = AndroidUtilities.dp(6.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(fDp, height - fDp, getWidth() - fDp, height + fDp);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f50044a);
        int i10 = this.f50046c;
        x xVar = this.f50047e;
        if (i10 != 1) {
            iGreen = i10 != 2 ? Color.red(xVar.f50115f) : Color.blue(xVar.f50115f);
        } else {
            iGreen = Color.green(xVar.f50115f);
        }
        float f10 = iGreen / 255.0f;
        float fDp2 = AndroidUtilities.dp(13.0f);
        Paint paint = this.f50045b;
        float strokeWidth = fDp2 - (paint.getStrokeWidth() / 2.0f);
        float fMax = Math.max(fDp + strokeWidth, (((getWidth() - (2.0f * fDp)) * f10) + fDp) - strokeWidth);
        canvas.drawCircle(fMax, height, fDp2, paint);
        zf.i1.x1(fMax, height, strokeWidth, this.d, canvas);
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
            if (actionMasked == 1) {
                b(motionEvent.getX());
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        b(motionEvent.getX());
        return true;
    }
}
