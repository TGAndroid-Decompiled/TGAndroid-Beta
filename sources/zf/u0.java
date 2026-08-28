package zf;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u0 extends m2.g {
    public long f50709s0;
    public boolean f50710t0;
    public final t0 f50711u0;
    public final x0 f50712v0;

    public u0(x0 x0Var, Context context) {
        super(context);
        this.f50712v0 = x0Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.f50711u0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        t0 t0Var;
        if (motionEvent.getAction() == 0) {
            this.f50709s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f50709s0 <= ViewConfiguration.getTapTimeout() && (t0Var = this.f50711u0) != null && t0Var.isFinished()) {
                this.f50710t0 = true;
                x0 x0Var = this.f50712v0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (x0Var.C + 1 < x0Var.d.size()) {
                        x(x0Var.C + 1, true);
                    }
                } else {
                    int i9 = x0Var.C - 1;
                    if (i9 >= 0) {
                        x(i9, true);
                    }
                }
                this.f50710t0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f50709s0 = -1L;
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
    public final void onMeasure(int i9, int i10) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp + this.f50712v0.H, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f50712v0.f50779w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
