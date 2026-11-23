package wi;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fi.u2;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.p10;
public final class g extends p10 {
    public float f59953a;
    public float f59954b;
    public final int f59955c;
    public final h d;

    public g(h hVar, int i7) {
        this.d = hVar;
        this.f59955c = i7;
    }

    @Override
    public final boolean a() {
        h hVar = this.d;
        if (!hVar.K && !hVar.H && hVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z10;
        int i7;
        h hVar = this.d;
        a61 a61Var = hVar.F;
        l lVar = hVar.f59957b;
        if (hVar.b() && hVar.c()) {
            if (motionEvent.getX() >= hVar.f59976x * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long duration = lVar.getDuration();
            long l10 = lVar.l();
            if (z10) {
                i7 = 10000;
            } else {
                i7 = -10000;
            }
            long j3 = i7 + l10;
            if (j3 > duration) {
                j3 = duration;
            } else if (j3 < 0) {
                if (j3 >= -9000) {
                    j3 = 0;
                }
                return true;
            }
            if (l10 != j3) {
                a61Var.e(true);
                a61Var.d(!z10);
                long j10 = a61Var.f33325o + 10000;
                a61Var.f33325o = j10;
                a61Var.f33326p = hd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                lVar.c(j3);
                a61Var.g(0L);
                hVar.I = ((float) j3) / ((float) duration);
                u2 u2Var = hVar.f59968o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                d dVar = hVar.f59966m;
                if (dVar != null) {
                    dVar.invalidate();
                }
                if (!hVar.f59974u) {
                    hVar.f59974u = true;
                    hVar.o(true);
                    if (!hVar.f59975w) {
                        hVar.f59975w = true;
                        g0.h3(hVar.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        h hVar = this.d;
        if (hVar.f59974u) {
            for (int i7 = 1; i7 < hVar.f59962i.getChildCount(); i7++) {
                View childAt = hVar.f59962i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hVar.f59973t = childAt;
                    return true;
                }
            }
        }
        this.f59953a = hVar.B;
        this.f59954b = hVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        if (hVar.f59971r && !hVar.f59972s) {
            r1.g gVar = hVar.D;
            gVar.f56323a = f10;
            float f12 = hVar.B;
            gVar.f56324b = f12;
            gVar.f56325c = true;
            gVar.f56333m.f56341i = h.n((f10 / 7.0f) + f12, hVar.f59976x);
            hVar.D.h();
            r1.g gVar2 = hVar.E;
            gVar2.f56323a = f11;
            float f13 = hVar.C;
            gVar2.f56324b = f13;
            gVar2.f56325c = true;
            gVar2.f56333m.f56341i = h.e((f11 / 10.0f) + f13, hVar.f59977y);
            hVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        WindowManager.LayoutParams layoutParams = hVar.f59959e;
        if (!hVar.f59971r && hVar.v == null && !hVar.f59972s) {
            float abs = Math.abs(f10);
            float f12 = this.f59955c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                hVar.f59971r = true;
                hVar.D.d();
                hVar.E.d();
                hVar.L = false;
                hVar.f59957b.H();
                g0.r(hVar.N);
            }
        }
        if (hVar.f59971r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f59953a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f59954b) - motionEvent.getRawY();
            hVar.C = rawY;
            r1.g gVar = hVar.D;
            if (gVar.f56327f) {
                gVar.f56333m.f56341i = rawX;
            } else {
                hVar.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            hVar.r();
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        h hVar = this.d;
        e eVar = hVar.P;
        if (hVar.v == null) {
            if (hVar.f59975w) {
                g0.r(eVar);
                hVar.f59975w = false;
            }
            boolean z10 = !hVar.f59974u;
            hVar.f59974u = z10;
            hVar.o(z10);
            if (hVar.f59974u) {
                g0.h3(eVar, 2500L);
                hVar.f59975w = true;
            }
        }
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!a()) {
            onSingleTapConfirmed(motionEvent);
            return true;
        }
        return super.onSingleTapUp(motionEvent);
    }
}
