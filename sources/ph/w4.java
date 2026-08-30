package ph;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class w4 extends dg.d {
    public final Paint h;
    public long f42502n;
    public float f42503r;
    public float f42504s;
    public int v;
    public int f42505w;
    public final h9 f42506x;

    public w4(h9 h9Var, Context context, v4 v4Var) {
        super(context, v4Var);
        this.f42506x = h9Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f42506x.f41344j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: ph.w4.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        h9 h9Var = this.f42506x;
        w4 w4Var = h9Var.O0;
        if (h9Var.O1 <= 0) {
            h9Var.O1 = w4Var.getMeasuredWidth();
        }
        if (h9Var.P1 <= 0) {
            h9Var.P1 = w4Var.getMeasuredHeight();
        }
        h9Var.H0();
    }
}
