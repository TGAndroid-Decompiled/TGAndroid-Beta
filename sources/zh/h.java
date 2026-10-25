package zh;

import android.content.Context;
import android.view.MotionEvent;
import bi.yd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
public final class h extends yd {
    public final m m0;

    public h(m mVar, Context context, u6 u6Var) {
        super(context, u6Var);
        this.m0 = mVar;
    }

    @Override
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        m.U(this.m0);
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && motionEvent.getY() > getMeasuredHeight() - AndroidUtilities.dp(48.0f)) {
            return false;
        }
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void e(int i10) {
        m.T(this.m0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        m.T(this.m0, i10);
    }
}
