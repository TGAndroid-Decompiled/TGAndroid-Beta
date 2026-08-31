package qh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.n20;
public final class z9 extends n20 {
    public final ba f46395a;

    public z9(ba baVar) {
        this.f46395a = baVar;
    }

    @Override
    public final boolean a() {
        g9 g9Var;
        ca caVar = this.f46395a.B0;
        if (caVar.f45082c0 == 0 && (g9Var = caVar.f45154y0) != null && !caVar.P1 && g9Var.isInited() && !caVar.M1 && !caVar.L0.f45973u0) {
            b6 b6Var = caVar.A0;
            if ((b6Var == null || (!b6Var.f45003x.h && !b6Var.I)) && !caVar.J() && caVar.f45114m2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ca caVar = this.f46395a.B0;
        g9 g9Var = caVar.f45154y0;
        if (g9Var != null && !caVar.P1 && !caVar.M1 && g9Var.isInited() && caVar.f45082c0 == 0 && caVar.L1 != -1) {
            caVar.f45154y0.switchCamera();
            caVar.L0.d(180.0f);
            ca.a0(caVar.f45154y0.isFrontface());
            if (caVar.q0()) {
                caVar.f45132s.c(null);
                return true;
            }
            caVar.f45132s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        g9 g9Var = this.f46395a.B0.f45154y0;
        if (g9Var != null) {
            g9Var.K = null;
            g9Var.H = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ba baVar = this.f46395a;
        baVar.f45030z0 = 0.0f;
        baVar.A0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        b6 b6Var;
        g9 g9Var;
        i91 i91Var;
        p9 p9Var;
        boolean z4;
        boolean z10;
        ba baVar = this.f46395a;
        ca caVar = baVar.B0;
        ValueAnimator valueAnimator = caVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((b6Var = caVar.A0) != null && (b6Var.f45003x.h || b6Var.I)) || caVar.L0.f45973u0 || (((g9Var = caVar.f45154y0) != null && g9Var.f46176s) || baVar.f45028x0 || (((i91Var = caVar.S0) != null && (i91Var.C || i91Var.D)) || caVar.I())))) {
            return false;
        }
        boolean z11 = true;
        baVar.f45026v0 = true;
        if (caVar.T) {
            if (Math.abs(caVar.f45128r.f46126a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || caVar.H > 0.4f) {
                    caVar.q(true);
                } else {
                    ca.c(caVar);
                }
            } else if (caVar.J0 != null && !caVar.I0 && caVar.L1 != -1) {
                if (Math.abs(f11) > 200.0f && (!caVar.J0.d.canScrollVertically(-1) || !caVar.H0)) {
                    if (!caVar.N1 && f11 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    caVar.f(z10);
                } else {
                    if (!caVar.N1 && caVar.J0.getTranslationY() < caVar.J0.getPadding()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    caVar.f(z4);
                }
            }
            caVar.I0 = false;
            caVar.T = false;
            caVar.U = false;
            if (z11 && (p9Var = caVar.f45150x0) != null) {
                p9Var.d();
            }
            return z11;
        }
        z11 = false;
        caVar.I0 = false;
        caVar.T = false;
        caVar.U = false;
        if (z11) {
            p9Var.d();
        }
        return z11;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: qh.z9.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        g9 g9Var = this.f46395a.B0.f45154y0;
        if (g9Var != null) {
            u0 u0Var = g9Var.K;
            if (u0Var != null) {
                u0Var.run();
                g9Var.K = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ca caVar = this.f46395a.B0;
        caVar.T = false;
        caVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!caVar.J() || motionEvent.getY() >= caVar.J0.g()) {
            return false;
        }
        caVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
