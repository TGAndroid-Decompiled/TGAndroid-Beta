package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54699a;
    public final q f54700b;

    public l(q qVar, int i10) {
        this.f54699a = i10;
        this.f54700b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54699a;
        q qVar = this.f54700b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54770c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54772f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54773n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54776w.setVisibility(4);
                return;
            default:
                qVar.f54773n.setFocusableInTouchMode(false);
                qVar.f54772f.setVisibility(4);
                return;
        }
    }
}
