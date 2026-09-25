package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class h2 extends LinearLayout {
    public final int f47469a;
    public final x3 f47470b;

    public h2(x3 x3Var, Context context, int i10) {
        super(context);
        this.f47469a = i10;
        this.f47470b = x3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47469a) {
            case 0:
                if (!this.f47470b.Y0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f47470b.Y0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f47470b.Y0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f47470b.Y0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
