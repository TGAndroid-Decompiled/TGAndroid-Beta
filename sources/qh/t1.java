package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import g7.g6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
public final class t1 extends ImageView implements org.telegram.ui.ActionBar.w5 {
    public final int f46714a;
    public int f46715b;
    public boolean f46716c;
    public boolean d;
    public int f46717e;
    public int f46718f;
    public final b6 h;
    public boolean f46719n;
    public boolean f46720r;
    public boolean f46721s;

    public t1(Context context, int i9, b6 b6Var) {
        super(context);
        this.f46717e = 20;
        this.f46718f = f6.f23001d6;
        this.f46719n = true;
        this.f46721s = true;
        this.f46715b = i9;
        this.f46714a = i9;
        this.h = b6Var;
        if (i9 != 0) {
            setImageResource(i9);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        g6.a(this);
        d();
    }

    public final void a() {
        f(this.f46714a);
    }

    public final void b() {
        if (!this.f46721s) {
            return;
        }
        this.f46721s = false;
        d();
    }

    public final void c(int i9) {
        if (this.f46718f == i9) {
            return;
        }
        this.f46718f = i9;
        d();
    }

    @Override
    public final void d() {
        int i9;
        boolean z10 = this.f46720r;
        b6 b6Var = this.h;
        if (z10) {
            if (this.f46721s) {
                i9 = f6.Oh;
            } else {
                i9 = f6.G6;
            }
            int w02 = f6.w0(null, i9, false);
            setBackground(f6.Z(f6.v(f6.v0(this.f46718f, b6Var), f6.l1(0.1f, w02)), f6.l1(0.1f, w02), AndroidUtilities.dp(this.f46717e), AndroidUtilities.dp(this.f46717e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(f6.Z(f6.v0(this.f46718f, b6Var), f6.v0(f6.f23092i6, b6Var), AndroidUtilities.dp(this.f46717e), AndroidUtilities.dp(this.f46717e)));
        setColorFilter(new PorterDuffColorFilter(f6.v0(f6.G6, b6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void e() {
        this.f46716c = true;
        v1 v1Var = new v1(getContext(), this.f46715b);
        v1Var.d = this.f46718f;
        v1Var.a(this.d);
        setImageDrawable(v1Var);
    }

    public final void f(int i9) {
        if (this.f46715b == i9) {
            return;
        }
        this.f46715b = i9;
        if (this.f46716c) {
            v1 v1Var = new v1(getContext(), i9);
            v1Var.d = this.f46718f;
            v1Var.a(this.d);
            AndroidUtilities.updateImageViewImageAnimated(this, v1Var);
            return;
        }
        AndroidUtilities.updateImageViewImageAnimated(this, i9);
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        if (this.f46719n == z10) {
            return;
        }
        setClickable(z10);
        ViewPropertyAnimator animate = animate();
        this.f46719n = z10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        animate.alpha(f10).setDuration(320L).setInterpolator(gr.h).start();
    }

    public void setPremiumLocked(boolean z10) {
        this.d = z10;
        if (getDrawable() instanceof v1) {
            ((v1) getDrawable()).a(z10);
        }
    }

    @Override
    public void setSelected(boolean z10) {
        if (this.f46720r == z10) {
            return;
        }
        this.f46720r = z10;
        d();
    }
}
