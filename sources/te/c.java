package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import hi.i9;
import org.telegram.ui.Components.voip.o1;
public final class c {
    public final int f57083a;
    public final b f57084b;
    public Interpolator f57085c;
    public long d;
    public long f57086e;
    public float f57087f;
    public float f57088g;
    public boolean h;
    public ValueAnimator f57089i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f57083a = i7;
        this.f57084b = bVar;
        this.f57085c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f57087f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f57083a;
            b bVar = this.f57084b;
            if (i7 == 0) {
                bVar.E(f11, i10);
                return;
            }
            if (!this.h) {
                this.h = true;
            }
            float f12 = f10 - f11;
            long j3 = this.d;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            }
            if (j3 <= 0) {
                d(f10, 1.0f);
                if (this.h) {
                    this.h = false;
                }
                bVar.E(f10, i10);
                return;
            }
            this.f57088g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f56572a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57089i = ofFloat;
            ofFloat.setDuration(j3);
            this.f57089i.setInterpolator(this.f57085c);
            this.f57089i.addUpdateListener(new i9(this, f11, f12, 6));
            this.f57089i.addListener(new o1(this, f11, f12, 1));
            long j10 = this.f57086e;
            if (j10 != 0) {
                this.f57089i.setStartDelay(j10);
            }
            try {
                this.f57089i.start();
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
        if (!this.h) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                this.h = false;
            }
            ValueAnimator valueAnimator = this.f57089i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57089i = null;
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
        this.f57084b.E(f10, this.f57083a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f57087f != f10) {
            this.f57087f = f10;
            this.f57084b.G(this.f57083a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f57083a = i7;
        this.f57084b = bVar;
        this.f57085c = interpolator;
        this.d = j3;
        this.f57087f = f10;
    }
}
