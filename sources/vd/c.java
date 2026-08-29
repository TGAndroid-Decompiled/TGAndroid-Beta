package vd;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import nh.v9;
import org.telegram.ui.Components.voip.q1;
public final class c {
    public final int f49507a;
    public final b f49508b;
    public final Interpolator f49509c;
    public final long d;
    public float f49510e;
    public float f49511f;
    public boolean f49512g;
    public ValueAnimator h;

    public c(int i10, b bVar, Interpolator interpolator, long j10) {
        this.f49507a = i10;
        this.f49508b = bVar;
        this.f49509c = interpolator;
        this.d = j10;
    }

    public final void a(float f9) {
        long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f49512g) {
                b();
            }
            float f10 = this.f49510e;
            int i10 = this.f49507a;
            b bVar = this.f49508b;
            if (f10 == f9) {
                bVar.z(f10, i10);
                return;
            }
            if (!this.f49512g) {
                this.f49512g = true;
            }
            float f11 = f9 - f10;
            if (Build.VERSION.SDK_INT >= 26 && !ValueAnimator.areAnimatorsEnabled()) {
                j10 = 0;
            } else {
                j10 = this.d;
            }
            if (j10 <= 0) {
                d(f9, 1.0f);
                if (this.f49512g) {
                    this.f49512g = false;
                }
                bVar.z(f9, i10);
                return;
            }
            this.f49511f = f9;
            DecelerateInterpolator decelerateInterpolator = ud.a.f49172a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.h = ofFloat;
            ofFloat.setDuration(j10);
            this.h.setInterpolator(this.f49509c);
            this.h.addUpdateListener(new v9(this, f10, f11, 4));
            this.h.addListener(new q1(this, f10, f11, 1));
            try {
                this.h.start();
                return;
            } catch (Throwable th2) {
                Log.e("tgx", "Cannot start animation", th2);
                c(f9);
                return;
            }
        }
        throw new AssertionError();
    }

    public final boolean b() {
        if (!this.f49512g) {
            return false;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f49512g) {
                this.f49512g = false;
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

    public final void c(float f9) {
        boolean b10 = b();
        if (!d(f9, 1.0f) && !b10) {
            return;
        }
        this.f49508b.z(f9, this.f49507a);
    }

    public final boolean d(float f9, float f10) {
        if (this.f49510e != f9) {
            this.f49510e = f9;
            this.f49508b.N(this.f49507a, f9, f10, this);
            return true;
        }
        return false;
    }

    public c(int i10, b bVar, Interpolator interpolator, long j10, float f9) {
        this.f49507a = i10;
        this.f49508b = bVar;
        this.f49509c = interpolator;
        this.d = j10;
        this.f49510e = f9;
    }
}
