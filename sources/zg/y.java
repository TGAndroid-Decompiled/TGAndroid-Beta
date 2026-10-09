package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kl0;
public final class y extends AnimatorListenerAdapter {
    public final int f54683a;
    public final a0 f54684b;

    public y(a0 a0Var, int i10) {
        this.f54683a = i10;
        this.f54684b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54683a) {
            case 0:
                this.f54684b.f();
                return;
            default:
                a0 a0Var = this.f54684b;
                a0.a(a0Var, false);
                a0Var.f54456j = 0.0f;
                kl0 kl0Var = a0Var.f54460n;
                kl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                kl0Var.setSkipDraw(false);
                a0Var.f54451c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
