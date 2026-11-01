package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.nj0;
public final class z extends AnimatorListenerAdapter {
    public final int f48501a;
    public final b0 f48502b;

    public z(b0 b0Var, int i10) {
        this.f48501a = i10;
        this.f48502b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48501a) {
            case 0:
                this.f48502b.f();
                return;
            default:
                b0 b0Var = this.f48502b;
                b0.a(b0Var, false);
                b0Var.f48292j = 0.0f;
                nj0 nj0Var = b0Var.f48296n;
                nj0Var.setCustomEmojiEnterProgress(Utilities.i(0.0f, 1.0f, 0.0f));
                nj0Var.setSkipDraw(false);
                b0Var.f48288c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
