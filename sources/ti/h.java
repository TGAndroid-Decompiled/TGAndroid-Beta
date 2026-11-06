package ti;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import di.b3;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e51;
public final class h extends b10 {
    public float f55962a;
    public float f55963b;
    public final int f55964c;
    public final i d;

    public h(i iVar, int i7) {
        this.d = iVar;
        this.f55964c = i7;
    }

    @Override
    public final boolean a() {
        i iVar = this.d;
        if (!iVar.K && !iVar.H && iVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z9;
        int i7;
        i iVar = this.d;
        e51 e51Var = iVar.F;
        m mVar = iVar.f55966b;
        if (iVar.b() && iVar.c()) {
            if (motionEvent.getX() >= iVar.f55985x * 0.5f) {
                z9 = true;
            } else {
                z9 = false;
            }
            long duration = mVar.getDuration();
            long l10 = mVar.l();
            if (z9) {
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
                e51Var.e(true);
                e51Var.d(!z9);
                long j10 = e51Var.f33156o + 10000;
                e51Var.f33156o = j10;
                e51Var.f33157p = hd.G((int) (j10 / 1000), "Seconds", new Object[0]);
                mVar.c(j3);
                e51Var.g(0L);
                iVar.I = ((float) j3) / ((float) duration);
                b3 b3Var = iVar.f55977o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                e eVar = iVar.f55975m;
                if (eVar != null) {
                    eVar.invalidate();
                }
                if (!iVar.f55983u) {
                    iVar.f55983u = true;
                    iVar.o(true);
                    if (!iVar.f55984w) {
                        iVar.f55984w = true;
                        g0.i3(iVar.P, 2500L);
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        i iVar = this.d;
        if (iVar.f55983u) {
            for (int i7 = 1; i7 < iVar.f55971i.getChildCount(); i7++) {
                View childAt = iVar.f55971i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    iVar.f55982t = childAt;
                    return true;
                }
            }
        }
        this.f55962a = iVar.B;
        this.f55963b = iVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        if (iVar.f55980r && !iVar.f55981s) {
            r1.g gVar = iVar.D;
            gVar.f54140a = f10;
            float f12 = iVar.B;
            gVar.f54141b = f12;
            gVar.f54142c = true;
            gVar.f54150m.f54158i = i.n((f10 / 7.0f) + f12, iVar.f55985x);
            iVar.D.h();
            r1.g gVar2 = iVar.E;
            gVar2.f54140a = f11;
            float f13 = iVar.C;
            gVar2.f54141b = f13;
            gVar2.f54142c = true;
            gVar2.f54150m.f54158i = i.e((f11 / 10.0f) + f13, iVar.f55986y);
            iVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        WindowManager.LayoutParams layoutParams = iVar.f55968e;
        if (!iVar.f55980r && iVar.v == null && !iVar.f55981s) {
            float abs = Math.abs(f10);
            float f12 = this.f55964c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                iVar.f55980r = true;
                iVar.D.d();
                iVar.E.d();
                iVar.L = false;
                iVar.f55966b.F();
                g0.r(iVar.N);
            }
        }
        if (iVar.f55980r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f55962a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f55963b) - motionEvent.getRawY();
            iVar.C = rawY;
            r1.g gVar = iVar.D;
            if (gVar.f54144f) {
                gVar.f54150m.f54158i = rawX;
            } else {
                iVar.B = rawX;
                layoutParams.x = (int) rawX;
            }
            layoutParams.y = (int) rawY;
            iVar.r();
        }
        return true;
    }

    @Override
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        i iVar = this.d;
        f fVar = iVar.P;
        if (iVar.v == null) {
            if (iVar.f55984w) {
                g0.r(fVar);
                iVar.f55984w = false;
            }
            boolean z9 = !iVar.f55983u;
            iVar.f55983u = z9;
            iVar.o(z9);
            if (iVar.f55983u) {
                g0.i3(fVar, 2500L);
                iVar.f55984w = true;
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
