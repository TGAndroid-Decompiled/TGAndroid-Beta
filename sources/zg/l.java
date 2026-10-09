package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54576a;
    public final q f54577b;

    public l(q qVar, int i10) {
        this.f54576a = i10;
        this.f54577b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54576a;
        q qVar = this.f54577b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54647c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54649f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54650n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54653w.setVisibility(4);
                return;
            default:
                qVar.f54650n.setFocusableInTouchMode(false);
                qVar.f54649f.setVisibility(4);
                return;
        }
    }
}
