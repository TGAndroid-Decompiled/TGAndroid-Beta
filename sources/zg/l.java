package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f49358a;
    public final q f49359b;

    public l(q qVar, int i10) {
        this.f49358a = i10;
        this.f49359b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49358a;
        q qVar = this.f49359b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f49427c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f49428f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f49429n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f49432w.setVisibility(4);
                return;
            default:
                qVar.f49429n.setFocusableInTouchMode(false);
                qVar.f49428f.setVisibility(4);
                return;
        }
    }
}
