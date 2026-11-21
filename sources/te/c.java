package te;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import hi.i9;
import org.telegram.ui.Components.voip.n1;
public final class c {
    public final int f57698a;
    public final b f57699b;
    public Interpolator f57700c;
    public long d;
    public long f57701e;
    public float f57702f;
    public float f57703g;
    public boolean h;
    public ValueAnimator f57704i;

    public c(int i7, b bVar, Interpolator interpolator, long j3) {
        this.f57698a = i7;
        this.f57699b = bVar;
        this.f57700c = interpolator;
        this.d = j3;
    }

    public final void a(float f10) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f57702f;
            int i7 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f57698a;
            b bVar = this.f57699b;
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
            this.f57703g = f10;
            DecelerateInterpolator decelerateInterpolator = se.a.f57187a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f57704i = ofFloat;
            ofFloat.setDuration(j3);
            this.f57704i.setInterpolator(this.f57700c);
            this.f57704i.addUpdateListener(new i9(this, f11, f12, 7));
            this.f57704i.addListener(new n1(this, f11, f12, 1));
            long j10 = this.f57701e;
            if (j10 != 0) {
                this.f57704i.setStartDelay(j10);
            }
            try {
                this.f57704i.start();
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
            ValueAnimator valueAnimator = this.f57704i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f57704i = null;
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
        this.f57699b.D(f10, this.f57698a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f57702f != f10) {
            this.f57702f = f10;
            this.f57699b.H(this.f57698a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i7, b bVar, Interpolator interpolator, long j3, float f10) {
        this.f57698a = i7;
        this.f57699b = bVar;
        this.f57700c = interpolator;
        this.d = j3;
        this.f57702f = f10;
    }
}
