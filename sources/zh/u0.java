package zh;

import android.view.MotionEvent;
import org.telegram.ui.Components.aa0;
public final class u0 extends aa0 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
