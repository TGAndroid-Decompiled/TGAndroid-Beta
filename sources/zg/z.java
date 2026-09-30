package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;
public final class z extends AnimatorListenerAdapter {
    public final int f49464a;
    public final b0 f49465b;

    public z(b0 b0Var, int i10) {
        this.f49464a = i10;
        this.f49465b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49464a) {
            case 0:
                this.f49465b.f();
                return;
            default:
                b0 b0Var = this.f49465b;
                b0.a(b0Var, false);
                b0Var.f49253j = 0.0f;
                sk0 sk0Var = b0Var.f49257n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                b0Var.f49249c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
