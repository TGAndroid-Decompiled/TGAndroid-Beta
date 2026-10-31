package vh;

import android.content.Context;
import android.graphics.Paint;
import android.view.MotionEvent;
public final class x3 extends jg.d {
    public final Paint h;
    public long f52163n;
    public float f52164r;
    public float f52165s;
    public int f52166w;
    public int f52167x;
    public final s7 f52168y;

    public x3(s7 s7Var, Context context, s9.g gVar) {
        super(context, gVar);
        this.f52168y = s7Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f52168y.V1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: vh.x3.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        s7 s7Var = this.f52168y;
        x3 x3Var = s7Var.A0;
        if (s7Var.A1 <= 0) {
            s7Var.A1 = x3Var.getMeasuredWidth();
        }
        if (s7Var.B1 <= 0) {
            s7Var.B1 = x3Var.getMeasuredHeight();
        }
        s7Var.E0();
    }
}
