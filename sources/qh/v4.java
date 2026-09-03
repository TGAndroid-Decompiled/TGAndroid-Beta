package qh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class v4 extends eg.d {
    public final Paint h;
    public long f46205n;
    public float f46206r;
    public float f46207s;
    public int v;
    public int f46208w;
    public final e9 f46209x;

    public v4(e9 e9Var, Context context, u4 u4Var) {
        super(context, u4Var);
        this.f46209x = e9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f46209x.f44940j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.v4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e9 e9Var = this.f46209x;
        v4 v4Var = e9Var.O0;
        if (e9Var.O1 <= 0) {
            e9Var.O1 = v4Var.getMeasuredWidth();
        }
        if (e9Var.P1 <= 0) {
            e9Var.P1 = v4Var.getMeasuredHeight();
        }
        e9Var.H0();
    }
}
