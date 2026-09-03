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
    public final int f50543a;
    public final b f50544b;
    public final Interpolator f50545c;
    public final long d;
    public float f50546e;
    public float f50547f;
    public boolean f50548g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.f50543a = i10;
        this.f50544b = bVar;
        this.f50545c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f50548g) {
                b();
            }
            float f11 = this.f50546e;
            int i10 = this.f50543a;
            b bVar = this.f50544b;
            if (f11 == f10) {
                bVar.z(f11, i10);
                return;
            }
            if (!this.f50548g) {
                this.f50548g = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f10, 1.0f);
                if (this.f50548g) {
                    this.f50548g = false;
                }
                bVar.z(f10, i10);
                return;
            }
            this.f50547f = f10;
            DecelerateInterpolator decelerateInterpolator = wd.a.f49529a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f50545c);
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
        if (!this.f50548g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f50548g) {
                this.f50548g = false;
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
        this.f50544b.z(f10, this.f50543a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f50546e != f10) {
            this.f50546e = f10;
            this.f50544b.L(this.f50543a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f50543a = i10;
        this.f50544b = bVar;
        this.f50545c = interpolator;
        this.d = j10;
        this.f50546e = f10;
    }
}
