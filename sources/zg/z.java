package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tk0;
public final class z extends AnimatorListenerAdapter {
    public final int f49570a;
    public final b0 f49571b;

    public z(b0 b0Var, int i10) {
        this.f49570a = i10;
        this.f49571b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49570a) {
            case 0:
                this.f49571b.f();
                return;
            default:
                b0 b0Var = this.f49571b;
                b0.a(b0Var, false);
                b0Var.f49359j = 0.0f;
                tk0 tk0Var = b0Var.f49363n;
                tk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                tk0Var.setSkipDraw(false);
                b0Var.f49355c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
