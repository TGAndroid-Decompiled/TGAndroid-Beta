package rg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class u0 extends z4.g {
    public long f42514w0;
    public boolean f42515x0;
    public final t0 f42516y0;
    public final x0 f42517z0;

    public u0(x0 x0Var, Context context) {
        super(context);
        this.f42517z0 = x0Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            t0 t0Var = new t0(this, getContext());
            this.f42516y0 = t0Var;
            declaredField.set(this, t0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        t0 t0Var;
        if (motionEvent.getAction() == 0) {
            this.f42514w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f42514w0 <= ViewConfiguration.getTapTimeout() && (t0Var = this.f42516y0) != null && t0Var.isFinished()) {
                this.f42515x0 = true;
                x0 x0Var = this.f42517z0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (x0Var.G + 1 < x0Var.d.size()) {
                        x(x0Var.G + 1, true);
                    }
                } else {
                    int i10 = x0Var.G - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f42515x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f42514w0 = -1L;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f42517z0.L, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f42517z0.f42565w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
