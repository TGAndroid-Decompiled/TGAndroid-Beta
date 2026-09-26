package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.rk0;
public final class z extends AnimatorListenerAdapter {
    public final int f49461a;
    public final b0 f49462b;

    public z(b0 b0Var, int i10) {
        this.f49461a = i10;
        this.f49462b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49461a) {
            case 0:
                this.f49462b.f();
                return;
            default:
                b0 b0Var = this.f49462b;
                b0.a(b0Var, false);
                b0Var.f49250j = 0.0f;
                rk0 rk0Var = b0Var.f49254n;
                rk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                rk0Var.setSkipDraw(false);
                b0Var.f49246c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
