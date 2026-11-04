package vg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
public final class t0 extends b5.l {
    public final v0 A0;
    public long f56854x0;
    public boolean f56855y0;
    public final s0 f56856z0;

    public t0(v0 v0Var, Context context) {
        super(context);
        this.A0 = v0Var;
        try {
            Field declaredField = b5.l.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            s0 s0Var = new s0(this, getContext());
            this.f56856z0 = s0Var;
            declaredField.set(this, s0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        s0 s0Var;
        if (motionEvent.getAction() == 0) {
            this.f56854x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f56854x0 <= ViewConfiguration.getTapTimeout() && (s0Var = this.f56856z0) != null && s0Var.isFinished()) {
                this.f56855y0 = true;
                int i3 = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                v0 v0Var = this.A0;
                if (i3 > 0) {
                    if (v0Var.f56887y1 + 1 < v0Var.f56875l1.size()) {
                        x(v0Var.f56887y1 + 1, true);
                    }
                } else {
                    int i10 = v0Var.f56887y1 - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f56855y0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f56854x0 = -1L;
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
    public final void onMeasure(int i3, int i10) {
        int L = org.telegram.messenger.g0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L + this.A0.D1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.f56882t1) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
