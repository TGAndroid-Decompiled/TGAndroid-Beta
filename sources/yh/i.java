package yh;

import ai.he;
import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
public final class i extends he {
    public final n m0;

    public i(n nVar, Context context, d6 d6Var) {
        super(context, d6Var);
        this.m0 = nVar;
    }

    @Override
    public final boolean d(float f7) {
        if (getProgress() <= 0.99d && f7 <= getMeasuredWidth() * 0.9f) {
            return false;
        }
        n.V(this.m0);
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
        n.U(this.m0, i10);
    }

    @Override
    public final void setValue(int i10) {
        super.setValue(i10);
        n.U(this.m0, i10);
    }
}
