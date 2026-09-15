package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f48960a;
    public final c0 f48961b;

    public a0(c0 c0Var, int i10) {
        this.f48960a = i10;
        this.f48961b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48960a) {
            case 0:
                this.f48961b.f();
                return;
            default:
                c0 c0Var = this.f48961b;
                c0.a(c0Var, false);
                c0Var.f48989j = 0.0f;
                fk0 fk0Var = c0Var.f48993n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                c0Var.f48985c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
