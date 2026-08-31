package wh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import k7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
public final class u1 extends ImageView implements b6 {
    public final int f50059a;
    public int f50060b;
    public boolean f50061c;
    public boolean d;
    public int f50062e;
    public int f50063f;
    public final g6 h;
    public boolean f50064n;
    public boolean f50065r;
    public boolean f50066s;

    public u1(Context context, int i10, g6 g6Var) {
        super(context);
        this.f50062e = 20;
        this.f50063f = k6.f21659d6;
        this.f50064n = true;
        this.f50066s = true;
        this.f50060b = i10;
        this.f50059a = i10;
        this.h = g6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        e6.a(this);
        e();
    }

    public final void a() {
        f(this.f50059a);
    }

    public final void b() {
        if (!this.f50066s) {
            return;
        }
        this.f50066s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f50063f == i10) {
            return;
        }
        this.f50063f = i10;
        e();
    }

    public final void d() {
        this.f50061c = true;
        x1 x1Var = new x1(getContext(), this.f50060b);
        x1Var.d = this.f50063f;
        x1Var.a(this.d);
        setImageDrawable(x1Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z4 = this.f50065r;
        g6 g6Var = this.h;
        if (z4) {
            if (this.f50066s) {
                i10 = k6.Oh;
            } else {
                i10 = k6.G6;
            }
            int w02 = k6.w0(null, i10, false);
            setBackground(k6.Z(k6.v(k6.v0(this.f50063f, g6Var), k6.l1(0.1f, w02)), k6.l1(0.1f, w02), AndroidUtilities.dp(this.f50062e), AndroidUtilities.dp(this.f50062e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(k6.Z(k6.v0(this.f50063f, g6Var), k6.v0(k6.f21750i6, g6Var), AndroidUtilities.dp(this.f50062e), AndroidUtilities.dp(this.f50062e)));
        setColorFilter(new PorterDuffColorFilter(k6.v0(k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f50060b == i10) {
            return;
        }
        this.f50060b = i10;
        if (this.f50061c) {
            x1 x1Var = new x1(getContext(), i10);
            x1Var.d = this.f50063f;
            x1Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, x1Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        if (this.f50064n == z4) {
            return;
        }
        setClickable(z4);
        ViewPropertyAnimator animate = animate();
        this.f50064n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(pr.h).start();
    }

    public void setPremiumLocked(boolean z4) {
        this.d = z4;
        if (getDrawable() instanceof x1) {
            ((x1) getDrawable()).a(z4);
        }
    }

    @Override
    public void setSelected(boolean z4) {
        if (this.f50065r == z4) {
            return;
        }
        this.f50065r = z4;
        e();
    }
}
