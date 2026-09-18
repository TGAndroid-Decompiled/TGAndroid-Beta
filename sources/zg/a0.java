package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f48988a;
    public final c0 f48989b;

    public a0(c0 c0Var, int i10) {
        this.f48988a = i10;
        this.f48989b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48988a) {
            case 0:
                this.f48989b.f();
                return;
            default:
                c0 c0Var = this.f48989b;
                c0.a(c0Var, false);
                c0Var.f49017j = 0.0f;
                gk0 gk0Var = c0Var.f49021n;
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gk0Var.setSkipDraw(false);
                c0Var.f49013c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
