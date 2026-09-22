package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f49385a;
    public final q f49386b;

    public l(q qVar, int i10) {
        this.f49385a = i10;
        this.f49386b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49385a;
        q qVar = this.f49386b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f49451c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f49452f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f49453n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f49456w.setVisibility(4);
                return;
            default:
                qVar.f49453n.setFocusableInTouchMode(false);
                qVar.f49452f.setVisibility(4);
                return;
        }
    }
}
