package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f46934a;
    public final c0 f46935b;

    public a0(c0 c0Var, int i10) {
        this.f46934a = i10;
        this.f46935b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46934a) {
            case 0:
                this.f46935b.f();
                return;
            default:
                c0 c0Var = this.f46935b;
                c0.a(c0Var, false);
                c0Var.f46956j = 0.0f;
                pk0 pk0Var = c0Var.f46960n;
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                pk0Var.setSkipDraw(false);
                c0Var.f46952c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
