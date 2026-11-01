package th;

import android.graphics.Point;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import org.telegram.ui.Components.pu0;
public final class u0 extends GestureDetector.SimpleOnGestureListener {
    public float f49516a;
    public float f49517b;
    public final int f49518c;

    public u0(int i10) {
        pu0 pu0Var = w0.X;
        this.f49518c = i10;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        w0 w0Var = w0.Z;
        if (w0Var.H) {
            for (int i10 = 1; i10 < w0Var.e.getChildCount(); i10++) {
                View childAt = w0Var.e.getChildAt(i10);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    w0Var.G = childAt;
                    return true;
                }
            }
        }
        this.f49516a = w0Var.N;
        this.f49517b = w0Var.O;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        Point point;
        float L;
        float f11;
        w0 w0Var = w0.Z;
        if (w0Var.E && !w0Var.F) {
            o1.j jVar = w0Var.P;
            jVar.f13949a = f7;
            float f12 = w0Var.N;
            jVar.f13950b = f12;
            jVar.f13951c = true;
            o1.k kVar = jVar.f13958m;
            int i10 = w0Var.J;
            float f13 = (f7 / 7.0f) + (i10 / 2.0f) + f12;
            int i11 = org.telegram.messenger.i0.f16172q.x;
            if (f13 >= i11 / 2.0f) {
                L = (i11 - i10) - org.telegram.messenger.i0.L(16.0f);
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            kVar.f13965i = L;
            w0Var.P.h();
            o1.j jVar2 = w0Var.Q;
            jVar2.f13949a = f7;
            jVar2.f13950b = w0Var.O;
            jVar2.f13951c = true;
            jVar2.f13958m.f13965i = w7.u.a((f10 / 10.0f) + f11, org.telegram.messenger.i0.L(16.0f), (point.y - w0Var.K) - org.telegram.messenger.i0.L(16.0f));
            w0Var.Q.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        w0 w0Var = w0.Z;
        if (!w0Var.E && w0Var.I == null && !w0Var.F) {
            float abs = Math.abs(f7);
            float f11 = this.f49518c;
            if (abs >= f11 || Math.abs(f10) >= f11) {
                w0Var.E = true;
                w0Var.P.d();
                w0Var.Q.d();
            }
        }
        if (w0Var.E) {
            WindowManager.LayoutParams layoutParams = w0Var.f49565c;
            float rawX = (motionEvent2.getRawX() + this.f49516a) - motionEvent.getRawX();
            w0Var.N = rawX;
            layoutParams.x = (int) rawX;
            WindowManager.LayoutParams layoutParams2 = w0Var.f49565c;
            float rawY = (motionEvent2.getRawY() + this.f49517b) - motionEvent.getRawY();
            w0Var.O = rawY;
            layoutParams2.y = (int) rawY;
            org.telegram.messenger.i0.S3(w0Var.f49564b, w0Var.d, w0Var.f49565c);
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        w0 w0Var = w0.Z;
        sg.v vVar = w0Var.U;
        if (w0Var.I == null) {
            if (w0Var.T) {
                org.telegram.messenger.i0.r(vVar);
                w0Var.T = false;
            }
            boolean z10 = !w0Var.H;
            w0Var.H = z10;
            w0Var.j(z10);
            if (w0Var.H && !w0Var.T) {
                org.telegram.messenger.i0.h3(vVar, 2500L);
                w0Var.T = true;
            }
        }
        return true;
    }
}
