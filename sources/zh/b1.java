package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;
public final class b1 extends FrameLayout {
    public final FrameLayout f48294a;
    public final View f48295b;
    public final ImageView f48296c;
    public final org.telegram.ui.p5 d;
    public boolean e;
    public ValueAnimator f48297f;
    public boolean h;
    public float f48298n;
    public ValueAnimator f48299r;

    public b1(Context context, ch.b bVar) {
        super(context);
        w7.c6.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48294a = frameLayout;
        zg.i iVar = new zg.i();
        iVar.a(bVar);
        iVar.f48138g.setColor(-14670806);
        iVar.invalidateSelf();
        iVar.f48137f = AndroidUtilities.dp(1.0f);
        frameLayout.setBackground(iVar);
        addView(frameLayout, w7.a6.e(40, 40, 17));
        View view = new View(context);
        this.f48295b = view;
        view.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(40.0f), -13522392));
        frameLayout.addView(view, w7.a6.e(38, 38, 17));
        view.setAlpha(0.0f);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        org.telegram.ui.p5 p5Var = new org.telegram.ui.p5(context);
        this.d = p5Var;
        addView(p5Var, w7.a6.e(42, 42, 17));
        ImageView imageView = new ImageView(context);
        this.f48296c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setScaleX(0.75f);
        imageView.setScaleY(0.75f);
        imageView.setColorFilter(new PorterDuffColorFilter(-2960428, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(imageView, w7.a6.e(40, 40, 17));
        b(false, false);
    }

    public final void a(boolean z10, boolean z11) {
        int i10;
        if (this.e == z10 && z11) {
            return;
        }
        this.e = z10;
        ValueAnimator valueAnimator = this.f48297f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48297f = null;
        }
        boolean z12 = true;
        float f7 = 1.0f;
        org.telegram.ui.p5 p5Var = this.d;
        if (!z11) {
            if (z10) {
                f7 = 0.0f;
            }
            p5Var.setAlpha(f7);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            p5Var.setVisibility(i10);
        } else {
            p5Var.setVisibility(0);
            float alpha = p5Var.getAlpha();
            if (z10) {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(alpha, f7);
            this.f48297f = ofFloat;
            ofFloat.addUpdateListener(new a1(this, 0));
            this.f48297f.setDuration(320L);
            this.f48297f.setInterpolator(wr.h);
            this.f48297f.start();
        }
        if (!this.h && z10) {
            z12 = false;
        }
        c(z12, z11);
    }

    public final void b(boolean z10, boolean z11) {
        int i10;
        boolean z12;
        int i11;
        this.h = z10;
        ImageView imageView = this.f48296c;
        if (!z11) {
            if (z10) {
                i11 = R.drawable.msg_voice_muted;
            } else {
                i11 = R.drawable.msg_voice_unmuted;
            }
            AndroidUtilities.updateImageViewImageAnimated(imageView, i11);
        } else {
            if (z10) {
                i10 = R.drawable.msg_voice_muted;
            } else {
                i10 = R.drawable.msg_voice_unmuted;
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
        ValueAnimator valueAnimator = this.f48299r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f48299r = null;
        }
        float f7 = 0.0f;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            }
            this.f48298n = f7;
            View view = this.f48295b;
            view.setAlpha(1.0f - f7);
            view.setScaleX(1.0f - this.f48298n);
            view.setScaleY(1.0f - this.f48298n);
            this.f48296c.setColorFilter(new PorterDuffColorFilter(i0.a.d(this.f48298n, -1, -2960428), PorterDuff.Mode.SRC_IN));
            this.f48294a.invalidate();
            return;
        }
        float f10 = this.f48298n;
        if (z10) {
            f7 = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f48299r = ofFloat;
        ofFloat.addUpdateListener(new a1(this, 1));
        this.f48299r.setInterpolator(wr.h);
        this.f48299r.setDuration(420L);
        this.f48299r.start();
    }
}
