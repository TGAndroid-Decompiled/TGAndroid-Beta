package ug;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.a8;
public final class u0 extends c5.k {
    public long f56713w0;
    public boolean f56714x0;
    public final t0 f56715y0;
    public final w0 f56716z0;

    public u0(w0 w0Var, Context context) {
        super(context);
        this.f56716z0 = w0Var;
        try {
            Field declaredField = c5.k.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.f56715y0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        t0 t0Var;
        if (motionEvent.getAction() == 0) {
            this.f56713w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f56713w0 <= ViewConfiguration.getTapTimeout() && (t0Var = this.f56715y0) != null && t0Var.isFinished()) {
                this.f56714x0 = true;
                int i7 = (motionEvent.getX() > (getWidth() * 0.45f) ? 1 : (motionEvent.getX() == (getWidth() * 0.45f) ? 0 : -1));
                w0 w0Var = this.f56716z0;
                if (i7 > 0) {
                    if (w0Var.f56740x1 + 1 < w0Var.f56729k1.size()) {
                        x(w0Var.f56740x1 + 1, true);
                    }
                } else {
                    int i10 = w0Var.f56740x1 - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f56714x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f56713w0 = -1L;
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
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L + this.f56716z0.C1, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f56716z0.f56735s1) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
