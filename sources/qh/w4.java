package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class w4 extends FrameLayout {
    public final e9 f46259a;

    public w4(e9 e9Var, Context context) {
        super(context);
        this.f46259a = e9Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f46259a.f44940j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
