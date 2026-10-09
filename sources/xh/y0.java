package xh;

import android.view.MotionEvent;
import org.telegram.ui.Components.ea0;
public final class y0 extends ea0 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
