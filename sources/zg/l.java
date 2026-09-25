package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f49359a;
    public final q f49360b;

    public l(q qVar, int i10) {
        this.f49359a = i10;
        this.f49360b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49359a;
        q qVar = this.f49360b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f49428c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f49429f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f49430n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f49433w.setVisibility(4);
                return;
            default:
                qVar.f49430n.setFocusableInTouchMode(false);
                qVar.f49429f.setVisibility(4);
                return;
        }
    }
}
