package xh;

import android.view.MotionEvent;
import org.telegram.ui.Components.q90;
public final class w0 extends q90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
