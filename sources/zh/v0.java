package zh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sv0;
public final class v0 extends GestureDetector.SimpleOnGestureListener {
    public float f48977a;
    public float f48978b;
    public final int f48979c;

    public v0(int i10) {
        sv0 sv0Var = x0.X;
        this.f48979c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        x0 x0Var = x0.Z;
        if (x0Var.H) {
            for (int i10 = 1; i10 < x0Var.e.getChildCount(); i10++) {
                View childAt = x0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    x0Var.G = childAt;
                    return true;
                }
            }
        }
        this.f48977a = x0Var.N;
        this.f48978b = x0Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        float dp;
        float f11;
        x0 x0Var = x0.Z;
        if (x0Var.E && !x0Var.F) {
            o1.k kVar = x0Var.P;
            kVar.f14124a = f7;
            float f12 = x0Var.N;
            kVar.f14125b = f12;
            kVar.f14126c = true;
            o1.l lVar = kVar.f14134u;
            int i10 = x0Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = AndroidUtilities.displaySize.x;
            if (f13 >= i11 / 2.0f) {
                dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
            } else {
                dp = AndroidUtilities.dp(16.0f);
            }
            lVar.f14140i = dp;
            x0Var.P.f();
            o1.k kVar2 = x0Var.Q;
            kVar2.f14124a = f7;
            kVar2.f14125b = x0Var.O;
            kVar2.f14126c = true;
            kVar2.f14134u.f14140i = w7.q.a((f10 / 10.0f) + f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
            x0Var.Q.f();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        x0 x0Var = x0.Z;
        if (!x0Var.E && x0Var.I == null && !x0Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f48979c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                x0Var.E = true;
                x0Var.P.c();
                x0Var.Q.c();
            }
        }
        if (x0Var.E) {
            WindowManager.LayoutParams layoutParams = x0Var.f49027c;
            float rawX = (motionEvent2.getRawX() + this.f48977a) - motionEvent.getRawX();
            x0Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = x0Var.f49027c;
            float rawY = (motionEvent2.getRawY() + this.f48978b) - motionEvent.getRawY();
            x0Var.O = rawY;
            layoutParams2.y = (int) rawY;
            AndroidUtilities.updateViewLayout(x0Var.f49026b, x0Var.d, x0Var.f49027c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        x0 x0Var = x0.Z;
        xh.x xVar = x0Var.U;
        if (x0Var.I == null) {
            if (x0Var.T) {
                AndroidUtilities.cancelRunOnUIThread(xVar);
                x0Var.T = false;
            }
            boolean z10 = !x0Var.H;
            x0Var.H = z10;
            x0Var.p(z10);
            if (x0Var.H && !x0Var.T) {
                AndroidUtilities.runOnUIThread(xVar, 2500L);
                x0Var.T = true;
            }
        }
        return true;
    }
}
