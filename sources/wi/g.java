package wi;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fi.u2;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.x51;
public final class g extends m10 {
    public float f59942a;
    public float f59943b;
    public final int f59944c;
    public final h d;

    public g(h hVar, int i7) {
        this.d = hVar;
        this.f59944c = i7;
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
        x51 x51Var = hVar.F;
        l lVar = hVar.f59946b;
        if (hVar.b() && hVar.c()) {
            if (motionEvent.getX() >= hVar.f59965x * 0.5f) {
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
                x51Var.e(true);
                x51Var.d(!z10);
                long j10 = x51Var.f41920o + 10000;
                x51Var.f41920o = j10;
                x51Var.f41921p = gd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                lVar.c(j3);
                x51Var.g(0L);
                hVar.I = ((float) j3) / ((float) duration);
                u2 u2Var = hVar.f59957o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                d dVar = hVar.f59955m;
                if (dVar != null) {
                    dVar.invalidate();
                }
                if (!hVar.f59963u) {
                    hVar.f59963u = true;
                    hVar.o(true);
                    if (!hVar.f59964w) {
                        hVar.f59964w = true;
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
        if (hVar.f59963u) {
            for (int i7 = 1; i7 < hVar.f59951i.getChildCount(); i7++) {
                View childAt = hVar.f59951i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hVar.f59962t = childAt;
                    return true;
                }
            }
        }
        this.f59942a = hVar.B;
        this.f59943b = hVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        if (hVar.f59960r && !hVar.f59961s) {
            r1.g gVar = hVar.D;
            gVar.f56313a = f10;
            float f12 = hVar.B;
            gVar.f56314b = f12;
            gVar.f56315c = true;
            gVar.f56323m.f56331i = h.n((f10 / 7.0f) + f12, hVar.f59965x);
            hVar.D.h();
            r1.g gVar2 = hVar.E;
            gVar2.f56313a = f11;
            float f13 = hVar.C;
            gVar2.f56314b = f13;
            gVar2.f56315c = true;
            gVar2.f56323m.f56331i = h.e((f11 / 10.0f) + f13, hVar.f59966y);
            hVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        WindowManager.LayoutParams layoutParams = hVar.f59948e;
        if (!hVar.f59960r && hVar.v == null && !hVar.f59961s) {
            float abs = Math.abs(f10);
            float f12 = this.f59944c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                hVar.f59960r = true;
                hVar.D.d();
                hVar.E.d();
                hVar.L = false;
                hVar.f59946b.H();
                g0.r(hVar.N);
            }
        }
        if (hVar.f59960r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f59942a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f59943b) - motionEvent.getRawY();
            hVar.C = rawY;
            r1.g gVar = hVar.D;
            if (gVar.f56317f) {
                gVar.f56323m.f56331i = rawX;
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
            if (hVar.f59964w) {
                g0.r(eVar);
                hVar.f59964w = false;
            }
            boolean z10 = !hVar.f59963u;
            hVar.f59963u = z10;
            hVar.o(z10);
            if (hVar.f59963u) {
                g0.h3(eVar, 2500L);
                hVar.f59964w = true;
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
