package th;

import android.content.Context;
import android.view.MotionEvent;
public final class a4 extends z4.g {
    public boolean f48793w0;
    public final f4 f48794x0;
    public final f4 f48795y0;

    public a4(f4 f4Var, Context context) {
        super(context);
        this.f48795y0 = f4Var;
        this.f48794x0 = f4Var;
    }

    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48793w0 = true;
        }
        if (this.f48793w0 && this.f48794x0.f48984y <= 0) {
            try {
                return super.onInterceptTouchEvent(motionEvent);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final boolean B(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f48793w0 = true;
        }
        if (this.f48793w0 && this.f48794x0.f48984y <= 0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float currentTopOffset;
        float y3 = motionEvent.getY();
        currentTopOffset = this.f48795y0.getCurrentTopOffset();
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
        f4 f4Var = this.f48795y0;
        currentTopOffset = f4Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = f4Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - f4Var.d) > org.telegram.messenger.i0.L(1.0f)) {
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
        f4 f4Var = this.f48795y0;
        currentTopOffset = f4Var.getCurrentTopOffset();
        if (y3 >= currentTopOffset) {
            currentTopOffset2 = f4Var.getCurrentTopOffset();
            if (Math.abs(currentTopOffset2 - f4Var.d) > org.telegram.messenger.i0.L(1.0f)) {
                return false;
            }
            return B(motionEvent);
        }
        return false;
    }
}
