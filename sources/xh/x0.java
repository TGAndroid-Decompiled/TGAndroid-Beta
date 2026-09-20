package xh;

import android.view.MotionEvent;
import org.telegram.ui.Components.k90;
public final class x0 extends k90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
