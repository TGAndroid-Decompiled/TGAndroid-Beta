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
    public final int f50096a;
    public int f50097b;
    public boolean f50098c;
    public boolean d;
    public int f50099e;
    public int f50100f;
    public final g6 h;
    public boolean f50101n;
    public boolean f50102r;
    public boolean f50103s;

    public u1(Context context, int i10, g6 g6Var) {
        super(context);
        this.f50099e = 20;
        this.f50100f = k6.f21661d6;
        this.f50101n = true;
        this.f50103s = true;
        this.f50097b = i10;
        this.f50096a = i10;
        this.h = g6Var;
        if (i10 != 0) {
            setImageResource(i10);
        }
        setScaleType(ImageView.ScaleType.CENTER);
        e6.a(this);
        e();
    }

    public final void a() {
        f(this.f50096a);
    }

    public final void b() {
        if (!this.f50103s) {
            return;
        }
        this.f50103s = false;
        e();
    }

    public final void c(int i10) {
        if (this.f50100f == i10) {
            return;
        }
        this.f50100f = i10;
        e();
    }

    public final void d() {
        this.f50098c = true;
        x1 x1Var = new x1(getContext(), this.f50097b);
        x1Var.d = this.f50100f;
        x1Var.a(this.d);
        setImageDrawable(x1Var);
    }

    @Override
    public final void e() {
        int i10;
        boolean z4 = this.f50102r;
        g6 g6Var = this.h;
        if (z4) {
            if (this.f50103s) {
                i10 = k6.Oh;
            } else {
                i10 = k6.G6;
            }
            int w02 = k6.w0(null, i10, false);
            setBackground(k6.Z(k6.v(k6.v0(this.f50100f, g6Var), k6.l1(0.1f, w02)), k6.l1(0.1f, w02), AndroidUtilities.dp(this.f50099e), AndroidUtilities.dp(this.f50099e)));
            setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
            return;
        }
        setBackground(k6.Z(k6.v0(this.f50100f, g6Var), k6.v0(k6.f21752i6, g6Var), AndroidUtilities.dp(this.f50099e), AndroidUtilities.dp(this.f50099e)));
        setColorFilter(new PorterDuffColorFilter(k6.v0(k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
    }

    public final void f(int i10) {
        if (this.f50097b == i10) {
            return;
        }
        this.f50097b = i10;
        if (this.f50098c) {
            x1 x1Var = new x1(getContext(), i10);
            x1Var.d = this.f50100f;
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
        if (this.f50101n == z4) {
            return;
        }
        setClickable(z4);
        ViewPropertyAnimator animate = animate();
        this.f50101n = z4;
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
        if (this.f50102r == z4) {
            return;
        }
        this.f50102r = z4;
        e();
    }
}
