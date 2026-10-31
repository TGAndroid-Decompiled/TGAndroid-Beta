package rh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.LinearLayout;
public final class m2 extends LinearLayout {
    public final int f47197a;
    public final e4 f47198b;

    public m2(e4 e4Var, Context context, int i10) {
        super(context);
        this.f47197a = i10;
        this.f47198b = e4Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f47197a) {
            case 0:
                if (!this.f47198b.T2.c(0)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 1:
                if (!this.f47198b.T2.c(1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 2:
                if (!this.f47198b.T2.c(2)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                if (!this.f47198b.T2.c(3)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
        }
    }
}
