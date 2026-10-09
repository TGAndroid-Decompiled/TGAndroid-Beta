package yh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class e2 extends LinearLayout {
    public final int f52426a;
    public final s3 f52427b;

    public e2(s3 s3Var, Context context, int i10) {
        super(context);
        this.f52426a = i10;
        this.f52427b = s3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f52426a) {
            case 0:
                if (!this.f52427b.Z0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f52427b.Z0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f52427b.Z0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f52427b.Z0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
