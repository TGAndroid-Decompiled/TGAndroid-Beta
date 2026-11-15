package wi;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fi.w2;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.m51;
public final class g extends f10 {
    public float f59378a;
    public float f59379b;
    public final int f59380c;
    public final h d;

    public g(h hVar, int i7) {
        this.d = hVar;
        this.f59380c = i7;
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
        m51 m51Var = hVar.F;
        l lVar = hVar.f59382b;
        if (hVar.b() && hVar.c()) {
            if (motionEvent.getX() >= hVar.f59401x * 0.5f) {
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
                m51Var.e(true);
                m51Var.d(!z10);
                long j10 = m51Var.f37074o + 10000;
                m51Var.f37074o = j10;
                m51Var.f37075p = hd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                lVar.c(j3);
                m51Var.g(0L);
                hVar.I = ((float) j3) / ((float) duration);
                w2 w2Var = hVar.f59393o;
                if (w2Var != null) {
                    w2Var.invalidate();
                }
                d dVar = hVar.f59391m;
                if (dVar != null) {
                    dVar.invalidate();
                }
                if (!hVar.f59399u) {
                    hVar.f59399u = true;
                    hVar.o(true);
                    if (!hVar.f59400w) {
                        hVar.f59400w = true;
                        g0.i3(hVar.P, 2500L);
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
        if (hVar.f59399u) {
            for (int i7 = 1; i7 < hVar.f59387i.getChildCount(); i7++) {
                View childAt = hVar.f59387i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hVar.f59398t = childAt;
                    return true;
                }
            }
        }
        this.f59378a = hVar.B;
        this.f59379b = hVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        if (hVar.f59396r && !hVar.f59397s) {
            r1.g gVar = hVar.D;
            gVar.f55738a = f10;
            float f12 = hVar.B;
            gVar.f55739b = f12;
            gVar.f55740c = true;
            gVar.f55748m.f55756i = h.n((f10 / 7.0f) + f12, hVar.f59401x);
            hVar.D.h();
            r1.g gVar2 = hVar.E;
            gVar2.f55738a = f11;
            float f13 = hVar.C;
            gVar2.f55739b = f13;
            gVar2.f55740c = true;
            gVar2.f55748m.f55756i = h.e((f11 / 10.0f) + f13, hVar.f59402y);
            hVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        WindowManager.LayoutParams layoutParams = hVar.f59384e;
        if (!hVar.f59396r && hVar.v == null && !hVar.f59397s) {
            float abs = Math.abs(f10);
            float f12 = this.f59380c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                hVar.f59396r = true;
                hVar.D.d();
                hVar.E.d();
                hVar.L = false;
                hVar.f59382b.G();
                g0.r(hVar.N);
            }
        }
        if (hVar.f59396r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f59378a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f59379b) - motionEvent.getRawY();
            hVar.C = rawY;
            r1.g gVar = hVar.D;
            if (gVar.f55742f) {
                gVar.f55748m.f55756i = rawX;
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
            if (hVar.f59400w) {
                g0.r(eVar);
                hVar.f59400w = false;
            }
            boolean z10 = !hVar.f59399u;
            hVar.f59399u = z10;
            hVar.o(z10);
            if (hVar.f59399u) {
                g0.i3(eVar, 2500L);
                hVar.f59400w = true;
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
