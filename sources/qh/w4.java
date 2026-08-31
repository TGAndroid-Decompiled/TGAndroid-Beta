package qh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends eg.d {
    public final Paint h;
    public long f46222n;
    public float f46223r;
    public float f46224s;
    public int v;
    public int f46225w;
    public final f9 f46226x;

    public w4(f9 f9Var, Context context, v4 v4Var) {
        super(context, v4Var);
        this.f46226x = f9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f46226x.f44963j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qh.w4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        f9 f9Var = this.f46226x;
        w4 w4Var = f9Var.O0;
        if (f9Var.O1 <= 0) {
            f9Var.O1 = w4Var.getMeasuredWidth();
        }
        if (f9Var.P1 <= 0) {
            f9Var.P1 = w4Var.getMeasuredHeight();
        }
        f9Var.H0();
    }
}
