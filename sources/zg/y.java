package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.kl0;
public final class y extends AnimatorListenerAdapter {
    public final int f54681a;
    public final a0 f54682b;

    public y(a0 a0Var, int i10) {
        this.f54681a = i10;
        this.f54682b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54681a) {
            case 0:
                this.f54682b.f();
                return;
            default:
                a0 a0Var = this.f54682b;
                a0.a(a0Var, false);
                a0Var.f54454j = 0.0f;
                kl0 kl0Var = a0Var.f54458n;
                kl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                kl0Var.setSkipDraw(false);
                a0Var.f54449c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
