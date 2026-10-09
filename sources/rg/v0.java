package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class v0 extends z4.g {
    public long f47472w0;
    public boolean f47473x0;
    public final u0 f47474y0;
    public final y0 f47475z0;

    public v0(y0 y0Var, Context context) {
        super(context);
        this.f47475z0 = y0Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            u0 u0Var = new u0(this, getContext());
            this.f47474y0 = u0Var;
            declaredField.set(this, u0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        u0 u0Var;
        if (motionEvent.getAction() == 0) {
            this.f47472w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f47472w0 <= ViewConfiguration.getTapTimeout() && (u0Var = this.f47474y0) != null && u0Var.isFinished()) {
                this.f47473x0 = true;
                int i10 = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                y0 y0Var = this.f47475z0;
                if (i10 > 0) {
                    if (y0Var.G + 1 < y0Var.d.size()) {
                        x(y0Var.G + 1, true);
                    }
                } else {
                    int i11 = y0Var.G - 1;
                    if (i11 >= 0) {
                        x(i11, true);
                    }
                }
                this.f47473x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f47472w0 = -1L;
        }
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f47475z0.L, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f47475z0.f47528w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
