package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54578a;
    public final q f54579b;

    public l(q qVar, int i10) {
        this.f54578a = i10;
        this.f54579b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54578a;
        q qVar = this.f54579b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54649c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54651f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54652n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54655w.setVisibility(4);
                return;
            default:
                qVar.f54652n.setFocusableInTouchMode(false);
                qVar.f54651f.setVisibility(4);
                return;
        }
    }
}
