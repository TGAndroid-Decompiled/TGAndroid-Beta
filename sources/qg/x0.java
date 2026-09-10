package qg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class x0 extends z4.g {
    public long f40979w0;
    public boolean f40980x0;
    public final w0 f40981y0;
    public final a1 f40982z0;

    public x0(a1 a1Var, Context context) {
        super(context);
        this.f40982z0 = a1Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            w0 w0Var = new w0(this, getContext());
            this.f40981y0 = w0Var;
            declaredField.set(this, w0Var);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        w0 w0Var;
        if (motionEvent.getAction() == 0) {
            this.f40979w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.f40979w0 <= ViewConfiguration.getTapTimeout() && (w0Var = this.f40981y0) != null && w0Var.isFinished()) {
                this.f40980x0 = true;
                a1 a1Var = this.f40982z0;
                if (motionEvent.getX() > getWidth() * 0.45f) {
                    if (a1Var.G + 1 < a1Var.d.size()) {
                        x(a1Var.G + 1, true);
                    }
                } else {
                    int i10 = a1Var.G - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                }
                this.f40980x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f40979w0 = -1L;
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.f40982z0.L, 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f40982z0.f40666w) {
            boolean A = A(motionEvent);
            if (!super.onTouchEvent(motionEvent) && !A) {
                return false;
            }
            return true;
        }
        return false;
    }
}
