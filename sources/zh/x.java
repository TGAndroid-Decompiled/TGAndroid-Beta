package zh;

import android.view.MotionEvent;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class x extends EditTextBoldCursor {
    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
