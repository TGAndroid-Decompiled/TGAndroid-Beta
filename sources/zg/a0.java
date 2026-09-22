package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f48953a;
    public final c0 f48954b;

    public a0(c0 c0Var, int i10) {
        this.f48953a = i10;
        this.f48954b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48953a) {
            case 0:
                this.f48954b.f();
                return;
            default:
                c0 c0Var = this.f48954b;
                c0.a(c0Var, false);
                c0Var.f48982j = 0.0f;
                fk0 fk0Var = c0Var.f48986n;
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                fk0Var.setSkipDraw(false);
                c0Var.f48978c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
