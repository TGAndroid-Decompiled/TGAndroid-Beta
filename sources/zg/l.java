package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54622a;
    public final q f54623b;

    public l(q qVar, int i10) {
        this.f54622a = i10;
        this.f54623b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54622a;
        q qVar = this.f54623b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54693c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54695f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54696n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54699w.setVisibility(4);
                return;
            default:
                qVar.f54696n.setFocusableInTouchMode(false);
                qVar.f54695f.setVisibility(4);
                return;
        }
    }
}
