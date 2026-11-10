package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import fi.k9;
import org.telegram.ui.Components.voip.k1;
public final class c {
    public final int f55500a;
    public final b f55501b;
    public final Interpolator f55502c;
    public final long d;
    public long f55503e;
    public float f55504f;
    public float f55505g;
    public boolean h;
    public ValueAnimator f55506i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f55500a = i7;
        this.f55501b = bVar;
        this.f55502c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f55504f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f55500a;
            b bVar = this.f55501b;
            if (i7 == 0) {
                bVar.F(f11, i10);
                return;
            }
            if (!this.h) {
                this.h = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j3 = 0;
            } else {
                j3 = this.d;
            }
            if (j3 <= 0) {
                d(f10, 1.0f);
                if (this.h) {
                    this.h = false;
                }
                bVar.F(f10, i10);
                return;
            }
            this.f55505g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f55016a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f55506i = ofFloat;
            ofFloat.setDuration(j3);
            this.f55506i.setInterpolator(this.f55502c);
            this.f55506i.addUpdateListener(new k9(this, f11, f12, 6));
            this.f55506i.addListener(new k1(this, f11, f12, 1));
            long j10 = this.f55503e;
            if (j10 != 0) {
                this.f55506i.setStartDelay(j10);
            }
            try {
                this.f55506i.start();
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
            ValueAnimator valueAnimator = this.f55506i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f55506i = null;
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
        this.f55501b.F(f10, this.f55500a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f55504f != f10) {
            this.f55504f = f10;
            this.f55501b.Y(this.f55500a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f55500a = i7;
        this.f55501b = bVar;
        this.f55502c = interpolator;
        this.d = j3;
        this.f55504f = f10;
    }
}
