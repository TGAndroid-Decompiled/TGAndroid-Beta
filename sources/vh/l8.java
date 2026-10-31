package vh;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import org.telegram.ui.Components.r10;
import org.telegram.ui.Components.s81;
public final class l8 extends r10 {
    public final n8 f51458a;

    public l8(n8 n8Var) {
        this.f51458a = n8Var;
    }

    @Override
    public final boolean a() {
        t7 t7Var;
        o8 o8Var = this.f51458a.f51578n0;
        if (o8Var.f51622f0 == 0 && (t7Var = o8Var.B0) != null && !o8Var.S1 && t7Var.isInited() && !o8Var.P1 && !o8Var.O0.f51881x0) {
            a5 a5Var = o8Var.D0;
            if ((a5Var == null || (!a5Var.f50915y.f25390i && !a5Var.L)) && !o8Var.I() && o8Var.f51653p2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        o8 o8Var = this.f51458a.f51578n0;
        t7 t7Var = o8Var.B0;
        if (t7Var != null && !o8Var.S1 && !o8Var.P1 && t7Var.isInited() && o8Var.f51622f0 == 0 && o8Var.O1 != -1) {
            o8Var.B0.switchCamera();
            o8Var.O0.d(180.0f);
            o8.Z(o8Var.B0.isFrontface());
            if (o8Var.p0()) {
                o8Var.f51661s.c(null);
                return true;
            }
            o8Var.f51661s.d();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        t7 t7Var = this.f51458a.f51578n0.B0;
        if (t7Var != null) {
            t7Var.N = null;
            t7Var.K = -1L;
            return false;
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        n8 n8Var = this.f51458a;
        n8Var.f51577l0 = 0.0f;
        n8Var.m0 = 0.0f;
        return false;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f7, float f10) {
        a5 a5Var;
        t7 t7Var;
        s81 s81Var;
        c8 c8Var;
        boolean z10;
        boolean z11;
        n8 n8Var = this.f51458a;
        o8 o8Var = n8Var.f51578n0;
        ValueAnimator valueAnimator = o8Var.E;
        if ((valueAnimator != null && valueAnimator.isRunning()) || (((a5Var = o8Var.D0) != null && (a5Var.f50915y.f25390i || a5Var.L)) || o8Var.O0.f51881x0 || (((t7Var = o8Var.B0) != null && t7Var.f51989s) || n8Var.f51575j0 || (((s81Var = o8Var.V0) != null && (s81Var.F || s81Var.G)) || o8Var.H())))) {
            return false;
        }
        boolean z12 = true;
        n8Var.f51573h0 = true;
        if (o8Var.W) {
            if (Math.abs(o8Var.f51657r.f51215a) >= org.telegram.messenger.i0.L(1.0f)) {
                if ((f10 > 0.0f && Math.abs(f10) > 2000.0f && Math.abs(f10) > Math.abs(f7)) || o8Var.K > 0.4f) {
                    o8Var.p(true);
                } else {
                    o8.b(o8Var);
                }
            } else if (o8Var.M0 != null && !o8Var.L0 && o8Var.O1 != -1) {
                if (Math.abs(f10) > 200.0f && (!o8Var.M0.d.canScrollVertically(-1) || !o8Var.K0)) {
                    if (!o8Var.Q1 && f10 < 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o8Var.e(z11);
                } else {
                    if (!o8Var.Q1 && o8Var.M0.getTranslationY() < o8Var.M0.getPadding()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    o8Var.e(z10);
                }
            }
            o8Var.L0 = false;
            o8Var.W = false;
            o8Var.X = false;
            if (z12 && (c8Var = o8Var.A0) != null) {
                c8Var.d();
            }
            return z12;
        }
        z12 = false;
        o8Var.L0 = false;
        o8Var.W = false;
        o8Var.X = false;
        if (z12) {
            c8Var.d();
        }
        return z12;
    }

    @Override
    public final boolean onScroll(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        throw new UnsupportedOperationException("Method not decompiled: vh.l8.onScroll(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        t7 t7Var = this.f51458a.f51578n0.B0;
        if (t7Var != null) {
            t0 t0Var = t7Var.N;
            if (t0Var != null) {
                t0Var.run();
                t7Var.N = null;
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        o8 o8Var = this.f51458a.f51578n0;
        o8Var.W = false;
        o8Var.X = false;
        if (!a() && onSingleTapConfirmed(motionEvent)) {
            return true;
        }
        if (!o8Var.I() || motionEvent.getY() >= o8Var.M0.g()) {
            return false;
        }
        o8Var.e(false);
        return true;
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
