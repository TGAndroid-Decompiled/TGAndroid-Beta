package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;
public final class z extends AnimatorListenerAdapter {
    public final int f53548a;
    public final b0 f53549b;

    public z(b0 b0Var, int i10) {
        this.f53548a = i10;
        this.f53549b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53548a) {
            case 0:
                this.f53549b.f();
                return;
            default:
                b0 b0Var = this.f53549b;
                b0.a(b0Var, false);
                b0Var.f53323j = 0.0f;
                sk0 sk0Var = b0Var.f53327n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                b0Var.f53318c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
