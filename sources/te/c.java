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
    public final int f57087a;
    public final b f57088b;
    public Interpolator f57089c;
    public long d;
    public long f57090e;
    public float f57091f;
    public float f57092g;
    public boolean h;
    public ValueAnimator f57093i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f57087a = i7;
        this.f57088b = bVar;
        this.f57089c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f57091f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f57087a;
            b bVar = this.f57088b;
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
            this.f57092g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f56572a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57093i = ofFloat;
            ofFloat.setDuration(j3);
            this.f57093i.setInterpolator(this.f57089c);
            this.f57093i.addUpdateListener(new i9(this, f11, f12, 6));
            this.f57093i.addListener(new o1(this, f11, f12, 1));
            long j10 = this.f57090e;
            if (j10 != 0) {
                this.f57093i.setStartDelay(j10);
            }
            try {
                this.f57093i.start();
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
            ValueAnimator valueAnimator = this.f57093i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57093i = null;
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
        this.f57088b.E(f10, this.f57087a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f57091f != f10) {
            this.f57091f = f10;
            this.f57088b.G(this.f57087a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f57087a = i7;
        this.f57088b = bVar;
        this.f57089c = interpolator;
        this.d = j3;
        this.f57091f = f10;
    }
}
