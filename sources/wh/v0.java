package wh;

import android.view.MotionEvent;
import org.telegram.ui.Components.m90;
public final class v0 extends m90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
