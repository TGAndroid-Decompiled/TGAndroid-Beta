package vh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nr;
public final class u1 extends ImageView implements a6 {
    public final int f46191a;
    public int f46192b;
    public boolean f46193c;
    public boolean d;
    public int e;
    public int f46194f;
    public final f6 h;
    public boolean f46195n;
    public boolean f46196r;
    public boolean f46197s;

    public u1(Context context, int i10, f6 f6Var) {
        super(context);
        this.e = 20;
        this.f46194f = j6.f19906d6;
        this.f46195n = true;
        this.f46197s = true;
        this.f46192b = i10;
        this.f46191a = i10;
        this.h = f6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        d6.a(this);
        e();
    }

    public final void a() {
        f(this.f46191a);
    }

    public final void b() {
        if (!this.f46197s) {
            return;
        }
        this.f46197s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f46194f == i10) {
            return;
        }
        this.f46194f = i10;
        e();
    }

    public final void d() {
        this.f46193c = true;
        w1 w1Var = new w1(getContext(), this.f46192b);
        w1Var.d = this.f46194f;
        w1Var.a(this.d);
        setImageDrawable(w1Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z4 = this.f46196r;
        f6 f6Var = this.h;
        if (z4) {
            if (this.f46197s) {
                i10 = j6.Oh;
            } else {
                i10 = j6.G6;
            }
            int w02 = j6.w0(null, i10, false);
            setBackground(j6.Z(j6.v(j6.v0(this.f46194f, f6Var), j6.l1(0.1f, w02)), j6.l1(0.1f, w02), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(j6.Z(j6.v0(this.f46194f, f6Var), j6.v0(j6.f19996i6, f6Var), AndroidUtilities.dp(this.e), AndroidUtilities.dp(this.e)));
        setColorFilter(new PorterDuffColorFilter(j6.v0(j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f46192b == i10) {
            return;
        }
        this.f46192b = i10;
        if (this.f46193c) {
            w1 w1Var = new w1(getContext(), i10);
            w1Var.d = this.f46194f;
            w1Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, w1Var);
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
        if (this.f46195n == z4) {
            return;
        }
        setClickable(z4);
        ViewPropertyAnimator animate = animate();
        this.f46195n = z4;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(nr.h).start();
    }

    public void setPremiumLocked(boolean z4) {
        this.d = z4;
        if (getDrawable() instanceof w1) {
            ((w1) getDrawable()).a(z4);
        }
    }

    @Override
    public void setSelected(boolean z4) {
        if (this.f46196r == z4) {
            return;
        }
        this.f46196r = z4;
        e();
    }
}
