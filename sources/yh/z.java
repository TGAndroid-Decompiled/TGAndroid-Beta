package yh;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class z extends EditTextBoldCursor {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
