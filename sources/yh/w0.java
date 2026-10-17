package yh;

import android.view.MotionEvent;
import org.telegram.ui.Components.x90;
public final class w0 extends x90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
