package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f49347a;
    public final q f49348b;

    public l(q qVar, int i10) {
        this.f49347a = i10;
        this.f49348b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49347a;
        q qVar = this.f49348b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f49416c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f49417f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f49418n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f49421w.setVisibility(4);
                return;
            default:
                qVar.f49418n.setFocusableInTouchMode(false);
                qVar.f49417f.setVisibility(4);
                return;
        }
    }
}
