package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pk0;
public final class z extends AnimatorListenerAdapter {
    public final int f49489a;
    public final b0 f49490b;

    public z(b0 b0Var, int i10) {
        this.f49489a = i10;
        this.f49490b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49489a) {
            case 0:
                this.f49490b.f();
                return;
            default:
                b0 b0Var = this.f49490b;
                b0.a(b0Var, false);
                b0Var.f49278j = 0.0f;
                pk0 pk0Var = b0Var.f49282n;
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                pk0Var.setSkipDraw(false);
                b0Var.f49274c.setVisibility(8);
                b0Var.f();
                return;
        }
    }
}
