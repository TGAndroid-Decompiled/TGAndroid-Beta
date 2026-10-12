package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nl0;
public final class y extends AnimatorListenerAdapter {
    public final int f54907a;
    public final a0 f54908b;

    public y(a0 a0Var, int i10) {
        this.f54907a = i10;
        this.f54908b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54907a) {
            case 0:
                this.f54908b.f();
                return;
            default:
                a0 a0Var = this.f54908b;
                a0.a(a0Var, false);
                a0Var.f54680j = 0.0f;
                nl0 nl0Var = a0Var.f54684n;
                nl0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                nl0Var.setSkipDraw(false);
                a0Var.f54675c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
