package ph;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.n20;
public final class aa extends n20 {
    public final ca f41311a;

    public aa(ca caVar) {
        this.f41311a = caVar;
    }

    @Override
    public final boolean a() {
        i9 i9Var;
        da daVar = this.f41311a.B0;
        if (daVar.f41518c0 == 0 && (i9Var = daVar.f41589y0) != null && !daVar.P1 && i9Var.isInited() && !daVar.M1 && !daVar.L0.f42364u0) {
            c6 c6Var = daVar.A0;
            if ((c6Var == null || (!c6Var.f41423x.h && !c6Var.I)) && !daVar.J() && daVar.f41549m2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        da daVar = this.f41311a.B0;
        i9 i9Var = daVar.f41589y0;
        if (i9Var != null && !daVar.P1 && !daVar.M1 && i9Var.isInited() && daVar.f41518c0 == 0 && daVar.L1 != -1) {
            daVar.f41589y0.switchCamera();
            daVar.L0.d(180.0f);
            da.a0(daVar.f41589y0.isFrontface());
            if (daVar.q0()) {
                daVar.f41567s.c(null);
                return true;
            }
            daVar.f41567s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        i9 i9Var = this.f41311a.B0.f41589y0;
        if (i9Var != null) {
            i9Var.K = null;
            i9Var.H = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        ca caVar = this.f41311a;
        caVar.f41450z0 = 0.0f;
        caVar.A0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        c6 c6Var;
        i9 i9Var;
        h91 h91Var;
        r9 r9Var;
        boolean z4;
        boolean z10;
        ca caVar = this.f41311a;
        da daVar = caVar.B0;
        ValueAnimator valueAnimator = daVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((c6Var = daVar.A0) != null && (c6Var.f41423x.h || c6Var.I)) || daVar.L0.f42364u0 || (((i9Var = daVar.f41589y0) != null && i9Var.f42494s) || caVar.f41448x0 || (((h91Var = daVar.S0) != null && (h91Var.C || h91Var.D)) || daVar.I())))) {
            return false;
        }
        boolean z11 = true;
        caVar.f41446v0 = true;
        if (daVar.T) {
            if (Math.abs(daVar.f41563r.f42519a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || daVar.H > 0.4f) {
                    daVar.q(true);
                } else {
                    da.c(daVar);
                }
            } else if (daVar.J0 != null && !daVar.I0 && daVar.L1 != -1) {
                if (Math.abs(f11) > 200.0f && (!daVar.J0.d.canScrollVertically(-1) || !daVar.H0)) {
                    if (!daVar.N1 && f11 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    daVar.f(z10);
                } else {
                    if (!daVar.N1 && daVar.J0.getTranslationY() < daVar.J0.getPadding()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    daVar.f(z4);
                }
            }
            daVar.I0 = false;
            daVar.T = false;
            daVar.U = false;
            if (z11 && (r9Var = daVar.f41585x0) != null) {
                r9Var.d();
            }
            return z11;
        }
        z11 = false;
        daVar.I0 = false;
        daVar.T = false;
        daVar.U = false;
        if (z11) {
            r9Var.d();
        }
        return z11;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: ph.aa.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        i9 i9Var = this.f41311a.B0.f41589y0;
        if (i9Var != null) {
            u0 u0Var = i9Var.K;
            if (u0Var != null) {
                u0Var.run();
                i9Var.K = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        da daVar = this.f41311a.B0;
        daVar.T = false;
        daVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!daVar.J() || motionEvent.getY() >= daVar.J0.g()) {
            return false;
        }
        daVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
