package wi;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import fi.u2;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.n10;
import org.telegram.ui.Components.z51;
public final class g extends n10 {
    public float f60071a;
    public float f60072b;
    public final int f60073c;
    public final h d;

    public g(h hVar, int i7) {
        this.d = hVar;
        this.f60073c = i7;
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
        z51 z51Var = hVar.F;
        l lVar = hVar.f60075b;
        if (hVar.b() && hVar.c()) {
            if (motionEvent.getX() >= hVar.f60094x * 0.5f) {
                z10 = true;
            } else {
                z10 = false;
            }
            long duration = lVar.getDuration();
            long n10 = lVar.n();
            if (z10) {
                i7 = 10000;
            } else {
                i7 = -10000;
            }
            long j3 = i7 + n10;
            if (j3 > duration) {
                j3 = duration;
            } else if (j3 < 0) {
                if (j3 >= -9000) {
                    j3 = 0;
                }
                return true;
            }
            if (n10 != j3) {
                z51Var.e(true);
                z51Var.d(!z10);
                long j10 = z51Var.f42717o + 10000;
                z51Var.f42717o = j10;
                z51Var.f42718p = gd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                lVar.c(j3);
                z51Var.g(0L);
                hVar.I = ((float) j3) / ((float) duration);
                u2 u2Var = hVar.f60086o;
                if (u2Var != null) {
                    u2Var.invalidate();
                }
                d dVar = hVar.f60084m;
                if (dVar != null) {
                    dVar.invalidate();
                }
                if (!hVar.f60092u) {
                    hVar.f60092u = true;
                    hVar.o(true);
                    if (!hVar.f60093w) {
                        hVar.f60093w = true;
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
        if (hVar.f60092u) {
            for (int i7 = 1; i7 < hVar.f60080i.getChildCount(); i7++) {
                View childAt = hVar.f60080i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    hVar.f60091t = childAt;
                    return true;
                }
            }
        }
        this.f60071a = hVar.B;
        this.f60072b = hVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        if (hVar.f60089r && !hVar.f60090s) {
            r1.g gVar = hVar.D;
            gVar.f56436a = f10;
            float f12 = hVar.B;
            gVar.f56437b = f12;
            gVar.f56438c = true;
            gVar.f56446m.f56454i = h.n((f10 / 7.0f) + f12, hVar.f60094x);
            hVar.D.h();
            r1.g gVar2 = hVar.E;
            gVar2.f56436a = f11;
            float f13 = hVar.C;
            gVar2.f56437b = f13;
            gVar2.f56438c = true;
            gVar2.f56446m.f56454i = h.e((f11 / 10.0f) + f13, hVar.f60095y);
            hVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        h hVar = this.d;
        WindowManager.LayoutParams layoutParams = hVar.f60077e;
        if (!hVar.f60089r && hVar.v == null && !hVar.f60090s) {
            float abs = Math.abs(f10);
            float f12 = this.f60073c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                hVar.f60089r = true;
                hVar.D.d();
                hVar.E.d();
                hVar.L = false;
                hVar.f60075b.T0();
                g0.r(hVar.N);
            }
        }
        if (hVar.f60089r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f60071a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f60072b) - motionEvent.getRawY();
            hVar.C = rawY;
            r1.g gVar = hVar.D;
            if (gVar.f56440f) {
                gVar.f56446m.f56454i = rawX;
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
            if (hVar.f60093w) {
                g0.r(eVar);
                hVar.f60093w = false;
            }
            boolean z10 = !hVar.f60092u;
            hVar.f60092u = z10;
            hVar.o(z10);
            if (hVar.f60092u) {
                g0.h3(eVar, 2500L);
                hVar.f60093w = true;
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
