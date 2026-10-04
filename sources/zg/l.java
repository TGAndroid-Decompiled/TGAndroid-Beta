package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f53440a;
    public final q f53441b;

    public l(q qVar, int i10) {
        this.f53440a = i10;
        this.f53441b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f53440a;
        q qVar = this.f53441b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f53512c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f53514f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f53515n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f53518w.setVisibility(4);
                return;
            default:
                qVar.f53515n.setFocusableInTouchMode(false);
                qVar.f53514f.setVisibility(4);
                return;
        }
    }
}
