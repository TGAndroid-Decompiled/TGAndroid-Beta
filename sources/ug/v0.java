package ug;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
public final class v0 extends c5.l {
    public final x0 A0;
    public long f58347x0;
    public boolean f58348y0;
    public final u0 f58349z0;

    public v0(x0 x0Var, Context context) {
        super(context);
        this.A0 = x0Var;
        try {
            Field declaredField = c5.l.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            u0 u0Var = new u0(this, getContext());
            this.f58349z0 = u0Var;
            declaredField.set(this, u0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        u0 u0Var;
        if (motionEvent.getAction() == 0) {
            this.f58347x0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f58347x0 <= ViewConfiguration.getTapTimeout() && (u0Var = this.f58349z0) != null && u0Var.isFinished()) {
                this.f58348y0 = true;
                int i7 = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                x0 x0Var = this.A0;
                if (i7 > 0) {
                    if (x0Var.B1 + 1 < x0Var.f58371o1.size()) {
                        x(x0Var.B1 + 1, true);
                    }
                } else {
                    int i10 = x0Var.B1 - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f58348y0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f58347x0 = -1L;
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
    public final void onMeasure(int i7, int i10) {
        int L = org.telegram.messenger.g0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L + this.A0.G1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0.f58379w1) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
