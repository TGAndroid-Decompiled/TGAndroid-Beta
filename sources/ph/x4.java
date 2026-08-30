package ph;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
public final class x4 extends FrameLayout {
    public final h9 f42557a;

    public x4(h9 h9Var, Context context) {
        super(context);
        this.f42557a = h9Var;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f42557a.f41344j2) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
