package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import hi.j9;
import org.telegram.ui.Components.voip.n1;
public final class c {
    public final int f57667a;
    public final b f57668b;
    public Interpolator f57669c;
    public long d;
    public long f57670e;
    public float f57671f;
    public float f57672g;
    public boolean h;
    public ValueAnimator f57673i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f57667a = i7;
        this.f57668b = bVar;
        this.f57669c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f57671f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f57667a;
            b bVar = this.f57668b;
            if (i7 == 0) {
                bVar.D(f11, i10);
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
                bVar.D(f10, i10);
                return;
            }
            this.f57672g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f57156a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57673i = ofFloat;
            ofFloat.setDuration(j3);
            this.f57673i.setInterpolator(this.f57669c);
            this.f57673i.addUpdateListener(new j9(this, f11, f12, 7));
            this.f57673i.addListener(new n1(this, f11, f12, 1));
            long j10 = this.f57670e;
            if (j10 != 0) {
                this.f57673i.setStartDelay(j10);
            }
            try {
                this.f57673i.start();
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
            ValueAnimator valueAnimator = this.f57673i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57673i = null;
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
        this.f57668b.D(f10, this.f57667a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f57671f != f10) {
            this.f57671f = f10;
            this.f57668b.H(this.f57667a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f57667a = i7;
        this.f57668b = bVar;
        this.f57669c = interpolator;
        this.d = j3;
        this.f57671f = f10;
    }
}
