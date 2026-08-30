package xd;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.voip.p1;
public final class c {
    public final int f46894a;
    public final b f46895b;
    public final Interpolator f46896c;
    public final long d;
    public float e;
    public float f46897f;
    public boolean f46898g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.f46894a = i10;
        this.f46895b = bVar;
        this.f46896c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f46898g) {
                b();
            }
            float f11 = this.e;
            int i10 = this.f46894a;
            b bVar = this.f46895b;
            if (f11 == f10) {
                bVar.z(f11, i10);
                return;
            }
            if (!this.f46898g) {
                this.f46898g = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f10, 1.0f);
                if (this.f46898g) {
                    this.f46898g = false;
                }
                bVar.z(f10, i10);
                return;
            }
            this.f46897f = f10;
            DecelerateInterpolator decelerateInterpolator = wd.a.f46514a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f46896c);
            this.h.addUpdateListener(new nv(this, f11, f12, 4));
            this.h.addListener(new p1(this, f11, f12, 1));
            try {
                this.h.start();
                return;
            } catch (Throwable th2) {
                Log.e("tgx", "Cannot start animation", th2);
                c(f10);
                return;
            }
        }
        throw new AssertionError();
    }

    public final boolean b() {
        if (!this.f46898g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f46898g) {
                this.f46898g = false;
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
                return true;
            }
            return true;
        }
        throw new AssertionError();
    }

    public final void c(float f10) {
        boolean b10 = b();
        if (!d(f10, 1.0f) && !b10) {
            return;
        }
        this.f46895b.z(f10, this.f46894a);
    }

    public final boolean d(float f10, float f11) {
        if (this.e != f10) {
            this.e = f10;
            this.f46895b.L(this.f46894a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f46894a = i10;
        this.f46895b = bVar;
        this.f46896c = interpolator;
        this.d = j10;
        this.e = f10;
    }
}
