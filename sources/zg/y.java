package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ll0;
public final class y extends AnimatorListenerAdapter {
    public final int f54727a;
    public final a0 f54728b;

    public y(a0 a0Var, int i10) {
        this.f54727a = i10;
        this.f54728b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f54727a) {
            case 0:
                this.f54728b.f();
                return;
            default:
                a0 a0Var = this.f54728b;
                a0.a(a0Var, false);
                a0Var.f54500j = 0.0f;
                ll0 ll0Var = a0Var.f54504n;
                ll0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                ll0Var.setSkipDraw(false);
                a0Var.f54495c.setVisibility(8);
                a0Var.f();
                return;
        }
    }
}
