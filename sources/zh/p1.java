package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.m91;
public final class p1 extends AnimatorListenerAdapter {
    public final int f48768a;
    public final boolean f48769b;
    public final a3 f48770c;

    public p1(a3 a3Var, boolean z10, int i10) {
        this.f48768a = i10;
        this.f48770c = a3Var;
        this.f48769b = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        float hideInterfaceAlpha;
        switch (this.f48768a) {
            case 0:
                if (!this.f48769b) {
                    a3 a3Var = this.f48770c;
                    a3Var.f48207r3.setVisibility(8);
                    a3Var.f48207r3.n();
                    return;
                }
                return;
            default:
                a3 a3Var2 = this.f48770c;
                z6 z6Var = a3Var2.C0;
                m91 m91Var = a3Var2.f48228y0;
                ImageView imageView = a3Var2.f48224x0;
                ImageView imageView2 = a3Var2.f48220w0;
                x2 x2Var = a3Var2.f48196o1;
                float f10 = 0.0f;
                if (this.f48769b) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                a3Var2.f48167d4 = f7;
                x2Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.f48167d4);
                x2Var.setAlpha(1.0f - a3Var2.f48167d4);
                imageView2.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.f48167d4);
                imageView2.setAlpha(1.0f - a3Var2.f48167d4);
                imageView.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.f48167d4);
                imageView.setAlpha(1.0f - a3Var2.f48167d4);
                m91Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.f48167d4);
                m91Var.setAlpha((1.0f - a3Var2.f48167d4) * a3Var2.f48170e3);
                b2 b2Var = a3Var2.W1;
                if (b2Var != null) {
                    b2Var.setTranslationY(AndroidUtilities.dp(8.0f) * a3Var2.f48167d4);
                    a3Var2.W1.setAlpha(1.0f - a3Var2.f48167d4);
                }
                if (z6Var != null) {
                    z6Var.setTranslationY((-AndroidUtilities.dp(8.0f)) * a3Var2.f48167d4);
                    z6Var.setAlpha(1.0f - a3Var2.f48167d4);
                }
                a3Var2.K0.setAlpha(1.0f - a3Var2.f48167d4);
                w2 w2Var = a3Var2.Q1;
                if (w2Var != null) {
                    f10 = ((l7) w2Var).d.V;
                }
                hideInterfaceAlpha = a3Var2.getHideInterfaceAlpha();
                b2 b2Var2 = a3Var2.D0;
                if (b2Var2 != null) {
                    b2Var2.setAlpha((1.0f - a3Var2.f48167d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                ImageView imageView3 = a3Var2.N0;
                if (imageView3 != null) {
                    imageView3.setAlpha((1.0f - a3Var2.f48167d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                b2 b2Var3 = a3Var2.P0;
                if (b2Var3 != null) {
                    b2Var3.setAlpha((1.0f - a3Var2.f48167d4) * (1.0f - f10) * hideInterfaceAlpha);
                }
                t1 t1Var = a3Var2.f48157b2;
                if (t1Var != null) {
                    t1Var.setAlpha(1.0f - a3Var2.f48167d4);
                    a3Var2.invalidate();
                }
                a3Var2.f48160c1.invalidate();
                return;
        }
    }
}
