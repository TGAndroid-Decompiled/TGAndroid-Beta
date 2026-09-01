package xd;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.voip.q1;
public final class c {
    public final int f50507a;
    public final b f50508b;
    public final Interpolator f50509c;
    public final long d;
    public float f50510e;
    public float f50511f;
    public boolean f50512g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.f50507a = i10;
        this.f50508b = bVar;
        this.f50509c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f50512g) {
                b();
            }
            float f11 = this.f50510e;
            int i10 = this.f50507a;
            b bVar = this.f50508b;
            if (f11 == f10) {
                bVar.z(f11, i10);
                return;
            }
            if (!this.f50512g) {
                this.f50512g = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f10, 1.0f);
                if (this.f50512g) {
                    this.f50512g = false;
                }
                bVar.z(f10, i10);
                return;
            }
            this.f50511f = f10;
            DecelerateInterpolator decelerateInterpolator = wd.a.f49493a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f50509c);
            this.h.addUpdateListener(new pv(this, f11, f12, 4));
            this.h.addListener(new q1(this, f11, f12, 1));
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
        if (!this.f50512g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f50512g) {
                this.f50512g = false;
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
        this.f50508b.z(f10, this.f50507a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f50510e != f10) {
            this.f50510e = f10;
            this.f50508b.L(this.f50507a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f50507a = i10;
        this.f50508b = bVar;
        this.f50509c = interpolator;
        this.d = j10;
        this.f50510e = f10;
    }
}
