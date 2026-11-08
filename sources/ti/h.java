package ti;

import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import di.b3;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.j51;
public final class h extends c10 {
    public float f56079a;
    public float f56080b;
    public final int f56081c;
    public final i d;

    public h(i iVar, int i7) {
        this.d = iVar;
        this.f56081c = i7;
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
        j51 j51Var = iVar.F;
        m mVar = iVar.f56083b;
        if (iVar.b() && iVar.c()) {
            if (motionEvent.getX() >= iVar.f56102x * 0.5f) {
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
                j51Var.e(true);
                j51Var.d(!z9);
                long j10 = j51Var.f34914o + 10000;
                j51Var.f34914o = j10;
                j51Var.f34915p = id.G((int) (j10 / 1000), "Seconds", new Object[0]);
                mVar.c(j3);
                j51Var.g(0L);
                iVar.I = ((float) j3) / ((float) duration);
                b3 b3Var = iVar.f56094o;
                if (b3Var != null) {
                    b3Var.invalidate();
                }
                e eVar = iVar.f56092m;
                if (eVar != null) {
                    eVar.invalidate();
                }
                if (!iVar.f56100u) {
                    iVar.f56100u = true;
                    iVar.o(true);
                    if (!iVar.f56101w) {
                        iVar.f56101w = true;
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
        if (iVar.f56100u) {
            for (int i7 = 1; i7 < iVar.f56088i.getChildCount(); i7++) {
                View childAt = iVar.f56088i.getChildAt(i7);
                if (childAt.dispatchTouchEvent(motionEvent)) {
                    iVar.f56099t = childAt;
                    return true;
                }
            }
        }
        this.f56079a = iVar.B;
        this.f56080b = iVar.C;
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        if (iVar.f56097r && !iVar.f56098s) {
            r1.g gVar = iVar.D;
            gVar.f54258a = f10;
            float f12 = iVar.B;
            gVar.f54259b = f12;
            gVar.f54260c = true;
            gVar.f54268m.f54276i = i.n((f10 / 7.0f) + f12, iVar.f56102x);
            iVar.D.h();
            r1.g gVar2 = iVar.E;
            gVar2.f54258a = f11;
            float f13 = iVar.C;
            gVar2.f54259b = f13;
            gVar2.f54260c = true;
            gVar2.f54268m.f54276i = i.e((f11 / 10.0f) + f13, iVar.f56103y);
            iVar.E.h();
            return true;
        }
        return false;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        i iVar = this.d;
        WindowManager.LayoutParams layoutParams = iVar.f56085e;
        if (!iVar.f56097r && iVar.v == null && !iVar.f56098s) {
            float abs = Math.abs(f10);
            float f12 = this.f56081c;
            if (abs >= f12 || Math.abs(f11) >= f12) {
                iVar.f56097r = true;
                iVar.D.d();
                iVar.E.d();
                iVar.L = false;
                iVar.f56083b.F();
                g0.r(iVar.N);
            }
        }
        if (iVar.f56097r && motionEvent != null) {
            float rawX = (motionEvent2.getRawX() + this.f56079a) - motionEvent.getRawX();
            float rawY = (motionEvent2.getRawY() + this.f56080b) - motionEvent.getRawY();
            iVar.C = rawY;
            r1.g gVar = iVar.D;
            if (gVar.f54262f) {
                gVar.f54268m.f54276i = rawX;
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
            if (iVar.f56101w) {
                g0.r(fVar);
                iVar.f56101w = false;
            }
            boolean z9 = !iVar.f56100u;
            iVar.f56100u = z9;
            iVar.o(z9);
            if (iVar.f56100u) {
                g0.i3(fVar, 2500L);
                iVar.f56101w = true;
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
