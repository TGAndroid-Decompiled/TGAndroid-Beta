package wh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import xh.o8;
public final class h extends o8 {
    public final m m0;

    public h(m mVar, Context context, f6 f6Var) {
        super(context, f6Var);
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
