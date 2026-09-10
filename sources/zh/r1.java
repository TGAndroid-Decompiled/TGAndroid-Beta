package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class r1 extends AnimatorListenerAdapter {
    public final int f48822a;
    public final View f48823b;

    public r1(int i10, View view) {
        this.f48822a = i10;
        this.f48823b = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48822a) {
            case 0:
                AndroidUtilities.removeFromParent(this.f48823b);
                return;
            default:
                AndroidUtilities.removeFromParent(this.f48823b);
                return;
        }
    }
}
