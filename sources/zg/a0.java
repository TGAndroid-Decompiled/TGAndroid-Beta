package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f48904a;
    public final c0 f48905b;

    public a0(c0 c0Var, int i10) {
        this.f48904a = i10;
        this.f48905b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48904a) {
            case 0:
                this.f48905b.f();
                return;
            default:
                c0 c0Var = this.f48905b;
                c0.a(c0Var, false);
                c0Var.f48933j = 0.0f;
                gk0 gk0Var = c0Var.f48937n;
                gk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                gk0Var.setSkipDraw(false);
                c0Var.f48929c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
