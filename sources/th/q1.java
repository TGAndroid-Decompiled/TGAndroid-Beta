package th;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.ui.bg0;
public final class q1 extends AnimatorListenerAdapter {
    public final int f49393a;
    public final boolean f49394b;
    public final z2 f49395c;

    public q1(z2 z2Var, boolean z10, int i10) {
        this.f49393a = i10;
        this.f49395c = z2Var;
        this.f49394b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f49393a) {
            case 0:
                if (!this.f49394b) {
                    z2 z2Var = this.f49395c;
                    z2Var.f49706a3.setVisibility(8);
                    z2Var.f49706a3.n();
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f49395c;
                t6 t6Var = z2Var2.f49743l0;
                bg0 bg0Var = z2Var2.f49727h0;
                ImageView imageView = z2Var2.f49723g0;
                ImageView imageView2 = z2Var2.f49719f0;
                w2 w2Var = z2Var2.X0;
                float f10 = 0.0f;
                if (this.f49394b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                z2Var2.N3 = f7;
                w2Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                w2Var.setAlpha(1.0f - z2Var2.N3);
                imageView2.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                imageView2.setAlpha(1.0f - z2Var2.N3);
                imageView.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                imageView.setAlpha(1.0f - z2Var2.N3);
                bg0Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                bg0Var.setAlpha((1.0f - z2Var2.N3) * z2Var2.N2);
                b2 b2Var = z2Var2.F1;
                if (b2Var != null) {
                    b2Var.setTranslationY(org.telegram.messenger.i0.L(8.0f) * z2Var2.N3);
                    z2Var2.F1.setAlpha(1.0f - z2Var2.N3);
                }
                if (t6Var != null) {
                    t6Var.setTranslationY((-org.telegram.messenger.i0.L(8.0f)) * z2Var2.N3);
                    t6Var.setAlpha(1.0f - z2Var2.N3);
                }
                z2Var2.f49773t0.setAlpha(1.0f - z2Var2.N3);
                v2 v2Var = z2Var2.f49797z1;
                if (v2Var != null) {
                    f10 = ((f7) v2Var).d.V;
                }
                hideInterfaceAlpha = z2Var2.getHideInterfaceAlpha();
                b2 b2Var2 = z2Var2.m0;
                if (b2Var2 != null) {
                    b2Var2.setAlpha((1.0f - z2Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = z2Var2.f49785w0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - z2Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                b2 b2Var3 = z2Var2.f49793y0;
                if (b2Var3 != null) {
                    b2Var3.setAlpha((1.0f - z2Var2.N3) * (1.0f - f10) * hideInterfaceAlpha);
                }
                t1 t1Var = z2Var2.K1;
                if (t1Var != null) {
                    t1Var.setAlpha(1.0f - z2Var2.N3);
                    z2Var2.invalidate();
                }
                z2Var2.L0.invalidate();
                return;
        }
    }
}
