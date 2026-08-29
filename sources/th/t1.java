package th;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import i7.h6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jr;
public final class t1 extends ImageView implements org.telegram.ui.ActionBar.x5 {
    public final int f48754a;
    public int f48755b;
    public boolean f48756c;
    public boolean d;
    public int f48757e;
    public int f48758f;
    public final c6 h;
    public boolean f48759n;
    public boolean f48760r;
    public boolean f48761s;

    public t1(Context context, int i10, c6 c6Var) {
        super(context);
        this.f48757e = 20;
        this.f48758f = g6.f23062d6;
        this.f48759n = true;
        this.f48761s = true;
        this.f48755b = i10;
        this.f48754a = i10;
        this.h = c6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        h6.a(this);
        e();
    }

    public final void a() {
        f(this.f48754a);
    }

    public final void b() {
        if (!this.f48761s) {
            return;
        }
        this.f48761s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f48758f == i10) {
            return;
        }
        this.f48758f = i10;
        e();
    }

    public final void d() {
        this.f48756c = true;
        v1 v1Var = new v1(getContext(), this.f48755b);
        v1Var.d = this.f48758f;
        v1Var.a(this.d);
        setImageDrawable(v1Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z10 = this.f48760r;
        c6 c6Var = this.h;
        if (z10) {
            if (this.f48761s) {
                i10 = g6.Oh;
            } else {
                i10 = g6.G6;
            }
            int w02 = g6.w0(null, i10, false);
            setBackground(g6.Z(g6.v(g6.v0(this.f48758f, c6Var), g6.l1(0.1f, w02)), g6.l1(0.1f, w02), AndroidUtilities.dp(this.f48757e), AndroidUtilities.dp(this.f48757e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(g6.Z(g6.v0(this.f48758f, c6Var), g6.v0(g6.f23152i6, c6Var), AndroidUtilities.dp(this.f48757e), AndroidUtilities.dp(this.f48757e)));
        setColorFilter(new PorterDuffColorFilter(g6.v0(g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f48755b == i10) {
            return;
        }
        this.f48755b = i10;
        if (this.f48756c) {
            v1 v1Var = new v1(getContext(), i10);
            v1Var.d = this.f48758f;
            v1Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, v1Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i10);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        if (this.f48759n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f48759n = z10;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        animate.alpha(f9).setDuration(320L).setInterpolator(jr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof v1) {
            ((v1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f48760r == z10) {
            return;
        }
        this.f48760r = z10;
        e();
    }
}
