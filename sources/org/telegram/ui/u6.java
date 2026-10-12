package org.telegram.ui;

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
public final class u6 extends View {
    public final int f40545a = 0;
    public Paint f40546b;
    public Paint f40547c;
    public float d;
    public Object e;

    public u6(Context context) {
        super(context);
    }

    public void a() {
        this.f40546b.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ((qg.x) this.e).f43611f}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public void b(float f7) {
        float dp = AndroidUtilities.dp(6.0f);
        float a2 = w7.s.a(((f7 - dp) + (AndroidUtilities.dp(13.0f) - (this.f40547c.getStrokeWidth() / 2.0f))) / (getWidth() - (dp * 2.0f)), 0.0f, 1.0f);
        this.d = a2;
        qg.x xVar = (qg.x) this.e;
        xVar.n(i0.a.k(xVar.f43611f, (int) (a2 * 255.0f)), 1);
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f40545a) {
            case 0:
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f40547c);
                rectF.set(0.0f, 0.0f, ((org.telegram.ui.Components.g6) this.e).d(this.d, false) * getMeasuredWidth(), getMeasuredHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.f40546b);
                return;
            default:
                super.onDraw(canvas);
                float height = getHeight() / 2.0f;
                float dp = AndroidUtilities.dp(6.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f7 = height - dp;
                float f10 = height + dp;
                rectF2.set(dp, f7, getWidth() - dp, f10);
                canvas.save();
                qg.x xVar = (qg.x) this.e;
                xVar.e.rewind();
                xVar.e.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
                canvas.clipPath(xVar.e);
                rg.k1.x1(canvas, rectF2, AndroidUtilities.dp(6.0f));
                canvas.restore();
                rectF2.set(dp, f7, getWidth() - dp, f10);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.f40546b);
                float dp2 = AndroidUtilities.dp(13.0f);
                Paint paint = this.f40547c;
                float strokeWidth = dp2 - (paint.getStrokeWidth() / 2.0f);
                float max = Math.max(dp + strokeWidth, (((getWidth() - (2.0f * dp)) * this.d) + dp) - strokeWidth);
                canvas.drawCircle(max, height, dp2, paint);
                rg.k1.y1(max, height, strokeWidth, i0.a.k(xVar.f43611f, (int) (this.d * 255.0f)), canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40545a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                a();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40545a) {
            case 1:
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
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public u6(qg.x xVar, Context context) {
        super(context);
        this.e = xVar;
        this.f40546b = new Paint(1);
        Paint paint = new Paint(1);
        this.f40547c = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
    }
}
