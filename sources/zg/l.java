package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f49065a;
    public final q f49066b;

    public l(q qVar, int i10) {
        this.f49065a = i10;
        this.f49066b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49065a;
        q qVar = this.f49066b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f49131c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f49132f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f49133n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f49136w.setVisibility(4);
                return;
            default:
                qVar.f49133n.setFocusableInTouchMode(false);
                qVar.f49132f.setVisibility(4);
                return;
        }
    }
}
