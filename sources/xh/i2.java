package xh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class i2 extends LinearLayout {
    public final int f45537a;
    public final x3 f45538b;

    public i2(x3 x3Var, Context context, int i10) {
        super(context);
        this.f45537a = i10;
        this.f45538b = x3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45537a) {
            case 0:
                if (!this.f45538b.Y0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f45538b.Y0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f45538b.Y0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f45538b.Y0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
