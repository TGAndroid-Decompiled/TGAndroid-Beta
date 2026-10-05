package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.sk0;
public final class x extends AnimatorListenerAdapter {
    public final int f53539a;
    public final z f53540b;

    public x(z zVar, int i10) {
        this.f53539a = i10;
        this.f53540b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f53539a) {
            case 0:
                this.f53540b.f();
                return;
            default:
                z zVar = this.f53540b;
                z.a(zVar, false);
                zVar.f53557j = 0.0f;
                sk0 sk0Var = zVar.f53561n;
                sk0Var.setCustomEmojiEnterProgress(Utilities.clamp(0.0f, 1.0f, 0.0f));
                sk0Var.setSkipDraw(false);
                zVar.f53552c.setVisibility(8);
                zVar.f();
                return;
        }
    }
}
