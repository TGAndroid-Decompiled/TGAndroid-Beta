package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.Components.gr;
public final class a1 extends FrameLayout {
    public final FrameLayout f48770a;
    public final View f48771b;
    public final ImageView f48772c;
    public final org.telegram.ui.n5 d;
    public boolean e;
    public ValueAnimator f48773f;
    public boolean h;
    public float f48774n;
    public ValueAnimator f48775r;

    public a1(Context context, wg.b bVar) {
        super(context);
        w7.e6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48770a = frameLayout;
        tg.i iVar = new tg.i();
        iVar.f48750a = bVar;
        iVar.a();
        iVar.f48754g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f48753f = org.telegram.messenger.i0.L(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, w7.b6.e(40, 40, 17));
        View view = new View(context);
        this.f48771b = view;
        view.setBackground(org.telegram.ui.ActionBar.t6.L(org.telegram.messenger.i0.L(40.0f), -13522392));
        frameLayout.addView(view, w7.b6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        org.telegram.ui.n5 n5Var = new org.telegram.ui.n5(context);
        this.d = n5Var;
        addView(n5Var, w7.b6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f48772c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.b6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f48773f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48773f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        org.telegram.ui.n5 n5Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            n5Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            n5Var.setVisibility(i10);
        } else {
            n5Var.setVisibility(0);
            float alpha = n5Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f48773f = ofFloat;
            ofFloat.addUpdateListener(new z0(this, 0));
            this.f48773f.setDuration(320L);
            this.f48773f.setInterpolator(gr.h);
            this.f48773f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        this.h = z10;
        int i10 = 2131232430;
        ImageView imageView = this.f48772c;
        if (!z11) {
            if (z10) {
                i10 = 2131232426;
            }
            org.telegram.messenger.i0.Q3(imageView, i10);
        } else {
            if (z10) {
                i10 = 2131232426;
            }
            imageView.setImageResource(i10);
        }
        if (!z10 && this.e) {
            z12 = false;
        } else {
            z12 = true;
        }
        c(z12, z11);
    }

    public final void c(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f48775r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48775r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f48774n = f7;
            View view = this.f48771b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f48774n);
            view.setScaleY(1.0f - this.f48774n);
            this.f48772c.setColorFilter(new PorterDuffColorFilter(i0.b.f(this.f48774n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f48770a.invalidate();
            return;
        }
        float f10 = this.f48774n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f48775r = ofFloat;
        ofFloat.addUpdateListener(new z0(this, 1));
        this.f48775r.setInterpolator(gr.h);
        this.f48775r.setDuration(420L);
        this.f48775r.start();
    }
}
