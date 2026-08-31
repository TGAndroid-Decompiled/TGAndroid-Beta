package qh;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class x4 extends FrameLayout {
    public final f9 f46286a;

    public x4(f9 f9Var, Context context) {
        super(context);
        this.f46286a = f9Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f46286a.f44963j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
