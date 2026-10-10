package xh;

import android.view.MotionEvent;
import org.telegram.ui.Components.fa0;
public final class x0 extends fa0 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
