package zh;

import android.view.MotionEvent;
import org.telegram.ui.Components.z90;
public final class u0 extends z90 {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (getAlpha() < 0.95f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
