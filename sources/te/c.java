package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import fi.l9;
import org.telegram.ui.Components.voip.k1;
public final class c {
    public final int f55396a;
    public final b f55397b;
    public final Interpolator f55398c;
    public final long d;
    public long f55399e;
    public float f55400f;
    public float f55401g;
    public boolean h;
    public ValueAnimator f55402i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f55396a = i7;
        this.f55397b = bVar;
        this.f55398c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f55400f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f55396a;
            b bVar = this.f55397b;
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
            this.f55401g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f54912a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f55402i = ofFloat;
            ofFloat.setDuration(j3);
            this.f55402i.setInterpolator(this.f55398c);
            this.f55402i.addUpdateListener(new l9(this, f11, f12, 6));
            this.f55402i.addListener(new k1(this, f11, f12, 1));
            long j10 = this.f55399e;
            if (j10 != 0) {
                this.f55402i.setStartDelay(j10);
            }
            try {
                this.f55402i.start();
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
            ValueAnimator valueAnimator = this.f55402i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f55402i = null;
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
        this.f55397b.F(f10, this.f55396a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f55400f != f10) {
            this.f55400f = f10;
            this.f55397b.Y(this.f55396a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f55396a = i7;
        this.f55397b = bVar;
        this.f55398c = interpolator;
        this.d = j3;
        this.f55400f = f10;
    }
}
