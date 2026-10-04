package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f53445a;
    public final q f53446b;

    public l(q qVar, int i10) {
        this.f53445a = i10;
        this.f53446b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f53445a;
        q qVar = this.f53446b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f53517c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f53519f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f53520n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f53523w.setVisibility(4);
                return;
            default:
                qVar.f53520n.setFocusableInTouchMode(false);
                qVar.f53519f.setVisibility(4);
                return;
        }
    }
}
