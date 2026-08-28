package td;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import kh.ka;
import org.telegram.ui.Components.voip.p1;
public final class c {
    public final int f47777a;
    public final b f47778b;
    public final Interpolator f47779c;
    public final long d;
    public float f47780e;
    public float f47781f;
    public boolean f47782g;
    public ValueAnimator h;

    public c(int i9, b bVar, Interpolator interpolator, long j10) {
        this.f47777a = i9;
        this.f47778b = bVar;
        this.f47779c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f47782g) {
                b();
            }
            float f11 = this.f47780e;
            int i9 = this.f47777a;
            b bVar = this.f47778b;
            if (f11 == f10) {
                bVar.B(f11, i9);
                return;
            }
            if (!this.f47782g) {
                this.f47782g = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f10, 1.0f);
                if (this.f47782g) {
                    this.f47782g = false;
                }
                bVar.B(f10, i9);
                return;
            }
            this.f47781f = f10;
            DecelerateInterpolator decelerateInterpolator = sd.a.f47511a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f47779c);
            this.h.addUpdateListener(new ka(this, f11, f12, 4));
            this.h.addListener(new p1(this, f11, f12, 1));
            try {
                this.h.start();
                return;
            } catch (Throwable th) {
                Log.e("tgx", "Cannot start animation", th);
                c(f10);
                return;
            }
        }
        throw new AssertionError();
    }

    public final boolean b() {
        if (!this.f47782g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f47782g) {
                this.f47782g = false;
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
        this.f47778b.B(f10, this.f47777a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f47780e != f10) {
            this.f47780e = f10;
            this.f47778b.J0(this.f47777a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i9, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f47777a = i9;
        this.f47778b = bVar;
        this.f47779c = interpolator;
        this.d = j10;
        this.f47780e = f10;
    }
}
