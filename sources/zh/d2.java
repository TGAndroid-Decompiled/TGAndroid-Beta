package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class d2 extends LinearLayout {
    public final int f50375a;
    public final r3 f50376b;

    public d2(r3 r3Var, Context context, int i10) {
        super(context);
        this.f50375a = i10;
        this.f50376b = r3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f50375a) {
            case 0:
                if (!this.f50376b.Z0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f50376b.Z0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f50376b.Z0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f50376b.Z0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
