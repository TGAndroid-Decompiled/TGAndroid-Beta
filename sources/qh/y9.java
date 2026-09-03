package qh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.n20;
public final class y9 extends n20 {
    public final aa f46377a;

    public y9(aa aaVar) {
        this.f46377a = aaVar;
    }

    @Override
    public final boolean a() {
        f9 f9Var;
        ba baVar = this.f46377a.B0;
        if (baVar.f45048c0 == 0 && (f9Var = baVar.f45120y0) != null && !baVar.P1 && f9Var.isInited() && !baVar.M1 && !baVar.L0.f45952u0) {
            a6 a6Var = baVar.A0;
            if ((a6Var == null || (!a6Var.f44980x.h && !a6Var.I)) && !baVar.J() && baVar.f45080m2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ba baVar = this.f46377a.B0;
        f9 f9Var = baVar.f45120y0;
        if (f9Var != null && !baVar.P1 && !baVar.M1 && f9Var.isInited() && baVar.f45048c0 == 0 && baVar.L1 != -1) {
            baVar.f45120y0.switchCamera();
            baVar.L0.d(180.0f);
            ba.a0(baVar.f45120y0.isFrontface());
            if (baVar.q0()) {
                baVar.f45098s.c(null);
                return true;
            }
            baVar.f45098s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        f9 f9Var = this.f46377a.B0.f45120y0;
        if (f9Var != null) {
            f9Var.K = null;
            f9Var.H = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        aa aaVar = this.f46377a;
        aaVar.f45007z0 = 0.0f;
        aaVar.A0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        a6 a6Var;
        f9 f9Var;
        h91 h91Var;
        o9 o9Var;
        boolean z4;
        boolean z10;
        aa aaVar = this.f46377a;
        ba baVar = aaVar.B0;
        ValueAnimator valueAnimator = baVar.B;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((a6Var = baVar.A0) != null && (a6Var.f44980x.h || a6Var.I)) || baVar.L0.f45952u0 || (((f9Var = baVar.f45120y0) != null && f9Var.f46194s) || aaVar.f45005x0 || (((h91Var = baVar.S0) != null && (h91Var.C || h91Var.D)) || baVar.I())))) {
            return false;
        }
        boolean z11 = true;
        aaVar.f45003v0 = true;
        if (baVar.T) {
            if (Math.abs(baVar.f45094r.f46106a) >= AndroidUtilities.dp(1.0f)) {
                if ((f11 > 0.0f && Math.abs(f11) > 2000.0f && Math.abs(f11) > Math.abs(f10)) || baVar.H > 0.4f) {
                    baVar.q(true);
                } else {
                    ba.c(baVar);
                }
            } else if (baVar.J0 != null && !baVar.I0 && baVar.L1 != -1) {
                if (Math.abs(f11) > 200.0f && (!baVar.J0.d.canScrollVertically(-1) || !baVar.H0)) {
                    if (!baVar.N1 && f11 < 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    baVar.f(z10);
                } else {
                    if (!baVar.N1 && baVar.J0.getTranslationY() < baVar.J0.getPadding()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    baVar.f(z4);
                }
            }
            baVar.I0 = false;
            baVar.T = false;
            baVar.U = false;
            if (z11 && (o9Var = baVar.f45116x0) != null) {
                o9Var.d();
            }
            return z11;
        }
        z11 = false;
        baVar.I0 = false;
        baVar.T = false;
        baVar.U = false;
        if (z11) {
            o9Var.d();
        }
        return z11;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: qh.y9.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        f9 f9Var = this.f46377a.B0.f45120y0;
        if (f9Var != null) {
            u0 u0Var = f9Var.K;
            if (u0Var != null) {
                u0Var.run();
                f9Var.K = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ba baVar = this.f46377a.B0;
        baVar.T = false;
        baVar.U = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!baVar.J() || motionEvent.getY() >= baVar.J0.g()) {
            return false;
        }
        baVar.f(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
