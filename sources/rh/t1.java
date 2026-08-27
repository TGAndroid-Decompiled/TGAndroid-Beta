package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import h7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.er;

public final class t1 extends ImageView implements org.telegram.ui.ActionBar.x5 {

    public final int f47456a;

    public int f47457b;

    public boolean f47458c;
    public boolean d;

    public int f47459e;

    public int f47460f;
    public final c6 h;

    public boolean f47461n;

    public boolean f47462r;

    public boolean f47463s;

    public t1(Context context, int i10, c6 c6Var) {
        super(context);
        this.f47459e = 20;
        this.f47460f = g6.f23053d6;
        this.f47461n = true;
        this.f47463s = true;
        this.f47457b = i10;
        this.f47456a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        b6.a(this);
        d();
    }

    public final void a() {
        f(this.f47456a);
    }

    public final void b() {
        if (this.f47463s) {
            this.f47463s = false;
            d();
        }
    }

    public final void c(int i10) {
        if (this.f47460f == i10) {
            return;
        }
        this.f47460f = i10;
        d();
    }

    @Override
    public final void d() {
        boolean z10 = this.f47462r;
        c6 c6Var = this.h;
        if (!z10) {
            setBackground(g6.Z(g6.v0(this.f47460f, c6Var), g6.v0(g6.f23144i6, c6Var), AndroidUtilities.dp(this.f47459e), AndroidUtilities.dp(this.f47459e)));
            setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        } else {
            int iW0 = g6.w0(null, this.f47463s ? g6.Oh : g6.G6, false);
            setBackground(g6.Z(g6.v(g6.v0(this.f47460f, c6Var), g6.l1(0.1f, iW0)), g6.l1(0.1f, iW0), AndroidUtilities.dp(this.f47459e), AndroidUtilities.dp(this.f47459e)));
            setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void e() {
        this.f47458c = true;
        v1 v1Var = new v1(getContext(), this.f47457b);
        v1Var.d = this.f47460f;
        v1Var.a(this.d);
        setImageDrawable(v1Var);
    }

    public final void f(int i10) {
        if (this.f47457b == i10) {
            return;
        }
        this.f47457b = i10;
        if (!this.f47458c) {
            AndroidUtilities.updateImageViewImageAnimated(this, i10);
            return;
        }
        v1 v1Var = new v1(getContext(), i10);
        v1Var.d = this.f47460f;
        v1Var.a(this.d);
        AndroidUtilities.updateImageViewImageAnimated(this, v1Var);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z10) {
        if (this.f47461n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        this.f47461n = z10;
        viewPropertyAnimatorAnimate.alpha(z10 ? 1.0f : 0.5f).setDuration(320L).setInterpolator(er.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof v1) {
            ((v1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f47462r == z10) {
            return;
        }
        this.f47462r = z10;
        d();
    }
}
