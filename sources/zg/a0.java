package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f49276a;
    public final c0 f49277b;

    public a0(c0 c0Var, int i10) {
        this.f49276a = i10;
        this.f49277b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49276a) {
            case 0:
                this.f49277b.f();
                return;
            default:
                c0 c0Var = this.f49277b;
                c0.a(c0Var, false);
                c0Var.f49305j = 0.0f;
                sk0 sk0Var = c0Var.f49309n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                c0Var.f49301c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
