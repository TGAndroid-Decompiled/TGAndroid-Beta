package zh;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
public final class b4 extends z4.g {
    public boolean f48305w0;
    public final g4 f48306x0;
    public final g4 f48307y0;

    public b4(g4 g4Var, Context context) {
        super(context);
        this.f48307y0 = g4Var;
        this.f48306x0 = g4Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48305w0 = true;
        }
        if (this.f48305w0 && this.f48306x0.f48448x <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48305w0 = true;
        }
        if (this.f48305w0 && this.f48306x0.f48448x <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f48307y0.getCurrentTopOffset();
        if (y3 < currentTopOffset && motionEvent.getAction() == 0) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        g4 g4Var = this.f48307y0;
        currentTopOffset = g4Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = g4Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - g4Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return A(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float currentTopOffset2;
        float y3 = motionEvent.getY();
        g4 g4Var = this.f48307y0;
        currentTopOffset = g4Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = g4Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - g4Var.d) > AndroidUtilities.dp(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
