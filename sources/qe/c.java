package qe;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import gi.l9;
import org.telegram.ui.Components.voip.z0;
public final class c {
    public final int f53842a;
    public final b f53843b;
    public final Interpolator f53844c;
    public final long d;
    public long f53845e;
    public float f53846f;
    public float f53847g;
    public boolean h;
    public ValueAnimator f53848i;

    public c(int i3, b bVar, Interpolator interpolator, long j10) {
        this.f53842a = i3;
        this.f53843b = bVar;
        this.f53844c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.h) {
                b();
            }
            float f11 = this.f53846f;
            int i3 = (f11 > f10 ? 1 : (f11 == f10 ? 0 : -1));
            int i10 = this.f53842a;
            b bVar = this.f53843b;
            if (i3 == 0) {
                bVar.F(f11, i10);
                return;
            }
            if (!this.h) {
                this.h = true;
            }
            float f12 = f10 - f11;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f10, 1.0f);
                if (this.h) {
                    this.h = false;
                }
                bVar.F(f10, i10);
                return;
            }
            this.f53847g = f10;
            DecelerateInterpolator decelerateInterpolator = pe.a.f53446a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f53848i = ofFloat;
            ofFloat.setDuration(j10);
            this.f53848i.setInterpolator(this.f53844c);
            this.f53848i.addUpdateListener(new l9(this, f11, f12, 6));
            this.f53848i.addListener(new z0(this, f11, f12, 1));
            long j11 = this.f53845e;
            if (j11 != 0) {
                this.f53848i.setStartDelay(j11);
            }
            try {
                this.f53848i.start();
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
            ValueAnimator valueAnimator = this.f53848i;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f53848i = null;
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
        this.f53843b.F(f10, this.f53842a);
    }

    public final boolean d(float f10, float f11) {
        if (this.f53846f != f10) {
            this.f53846f = f10;
            this.f53843b.Y(this.f53842a, f10, f11, this);
            return true;
        }
        return false;
    }

    public c(int i3, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f53842a = i3;
        this.f53843b = bVar;
        this.f53844c = interpolator;
        this.d = j10;
        this.f53846f = f10;
    }
}
