package ud;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import lh.ha;
import org.telegram.ui.Components.voip.p1;

public final class c {

    public final int f48499a;

    public final b f48500b;

    public final Interpolator f48501c;
    public final long d;

    public float f48502e;

    public float f48503f;

    public boolean f48504g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.f48499a = i10;
        this.f48500b = bVar;
        this.f48501c = interpolator;
        this.d = j10;
    }

    public final void a(float f10) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.f48504g) {
            b();
        }
        float f11 = this.f48502e;
        int i10 = this.f48499a;
        b bVar = this.f48500b;
        if (f11 == f10) {
            bVar.A(f11, i10);
            return;
        }
        int i11 = 1;
        if (!this.f48504g) {
            this.f48504g = true;
        }
        float f12 = f10 - f11;
        long j10 = (Build.VERSION.SDK_INT < 26 || ValueAnimator.areAnimatorsEnabled()) ? this.d : 0L;
        if (j10 <= 0) {
            d(f10, 1.0f);
            if (this.f48504g) {
                this.f48504g = false;
            }
            bVar.A(f10, i10);
            return;
        }
        this.f48503f = f10;
        DecelerateInterpolator decelerateInterpolator = td.a.f48160a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j10);
        this.h.setInterpolator(this.f48501c);
        this.h.addUpdateListener(new ha(this, f11, f12, 4));
        this.h.addListener(new p1(this, f11, f12, i11));
        try {
            this.h.start();
        } catch (Throwable th) {
            Log.e("tgx", "Cannot start animation", th);
            c(f10);
        }
    }

    public final boolean b() {
        if (!this.f48504g) {
            return false;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AssertionError();
        }
        if (this.f48504g) {
            this.f48504g = false;
        }
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator == null) {
            return true;
        }
        valueAnimator.cancel();
        this.h = null;
        return true;
    }

    public final void c(float f10) {
        boolean zB = b();
        if (d(f10, 1.0f) || zB) {
            this.f48500b.A(f10, this.f48499a);
        }
    }

    public final boolean d(float f10, float f11) {
        if (this.f48502e == f10) {
            return false;
        }
        this.f48502e = f10;
        this.f48500b.o(this.f48499a, f10, f11, this);
        return true;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f10) {
        this.f48499a = i10;
        this.f48500b = bVar;
        this.f48501c = interpolator;
        this.d = j10;
        this.f48502e = f10;
    }
}
