package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qk0;
public final class z extends AnimatorListenerAdapter {
    public final int f49443a;
    public final b0 f49444b;

    public z(b0 b0Var, int i10) {
        this.f49443a = i10;
        this.f49444b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49443a) {
            case 0:
                this.f49444b.f();
                return;
            default:
                b0 b0Var = this.f49444b;
                b0.a(b0Var, false);
                b0Var.f49232j = 0.0f;
                qk0 qk0Var = b0Var.f49236n;
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                qk0Var.setSkipDraw(false);
                b0Var.f49228c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
