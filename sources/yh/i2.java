package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class i2 extends LinearLayout {
    public final int f47200a;
    public final y3 f47201b;

    public i2(y3 y3Var, Context context, int i10) {
        super(context);
        this.f47200a = i10;
        this.f47201b = y3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47200a) {
            case 0:
                if (!this.f47201b.Y0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f47201b.Y0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f47201b.Y0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f47201b.Y0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
