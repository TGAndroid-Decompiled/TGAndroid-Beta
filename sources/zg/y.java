package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ml0;
public final class y extends AnimatorListenerAdapter {
    public final int f54770a;
    public final a0 f54771b;

    public y(a0 a0Var, int i10) {
        this.f54770a = i10;
        this.f54771b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54770a) {
            case 0:
                this.f54771b.f();
                return;
            default:
                a0 a0Var = this.f54771b;
                a0.a(a0Var, false);
                a0Var.f54543j = 0.0f;
                ml0 ml0Var = a0Var.f54547n;
                ml0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                ml0Var.setSkipDraw(false);
                a0Var.f54538c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
