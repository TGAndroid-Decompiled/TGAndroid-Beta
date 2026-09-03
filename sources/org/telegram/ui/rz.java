package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class rz extends FrameLayout {
    public final int f40964a = 0;
    public float f40965b;
    public Path f40966c;
    public Object d;
    public Object f40967e;

    public rz(Context context) {
        super(context);
    }

    public void a(float f10, float f11) {
        float[] fArr = (float[]) this.f40967e;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rz.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f40964a) {
            case 1:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f40965b) {
                    ((qh.c8) this.f40967e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f40965b) {
                    ((th.i0) this.f40967e).dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40964a) {
            case 0:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.f40966c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f40965b), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f40965b));
                float[] fArr = (float[]) this.f40967e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.d;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f40965b), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f40965b), AndroidUtilities.dp(8.0f));
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40964a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    public rz(th.i0 i0Var, Context context) {
        super(context);
        this.f40967e = i0Var;
        this.d = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.f40966c = new Path();
    }

    public rz(qh.c8 c8Var, Context context) {
        super(context);
        this.f40967e = c8Var;
        this.d = new org.telegram.ui.Components.z5(this, 250L, org.telegram.ui.Components.pr.h);
        this.f40966c = new Path();
    }
}
