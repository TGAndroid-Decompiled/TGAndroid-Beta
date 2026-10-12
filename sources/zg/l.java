package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54802a;
    public final q f54803b;

    public l(q qVar, int i10) {
        this.f54802a = i10;
        this.f54803b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54802a;
        q qVar = this.f54803b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54873c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54875f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54876n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54879w.setVisibility(4);
                return;
            default:
                qVar.f54876n.setFocusableInTouchMode(false);
                qVar.f54875f.setVisibility(4);
                return;
        }
    }
}
