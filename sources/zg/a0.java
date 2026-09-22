package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;
public final class a0 extends AnimatorListenerAdapter {
    public final int f49280a;
    public final c0 f49281b;

    public a0(c0 c0Var, int i10) {
        this.f49280a = i10;
        this.f49281b = c0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49280a) {
            case 0:
                this.f49281b.f();
                return;
            default:
                c0 c0Var = this.f49281b;
                c0.a(c0Var, false);
                c0Var.f49309j = 0.0f;
                sk0 sk0Var = c0Var.f49313n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                c0Var.f49305c.setVisibility(8);
                c0Var.f();
                return;
        }
    }
}
