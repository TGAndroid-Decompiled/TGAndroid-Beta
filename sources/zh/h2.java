package zh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class h2 extends LinearLayout {
    public final int f51977a;
    public final w3 f51978b;

    public h2(w3 w3Var, Context context, int i10) {
        super(context);
        this.f51977a = i10;
        this.f51978b = w3Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f51977a) {
            case 0:
                if (!this.f51978b.Y0.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f51978b.Y0.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f51978b.Y0.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f51978b.Y0.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
