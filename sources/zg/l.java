package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class l extends AnimatorListenerAdapter {
    public final int f54810a;
    public final q f54811b;

    public l(q qVar, int i10) {
        this.f54810a = i10;
        this.f54811b = qVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f54810a;
        q qVar = this.f54811b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                qVar.f54881c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    qVar.f54883f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                qVar.f54884n.setFocusableInTouchMode(true);
                return;
            case 2:
                qVar.f54887w.setVisibility(4);
                return;
            default:
                qVar.f54884n.setFocusableInTouchMode(false);
                qVar.f54883f.setVisibility(4);
                return;
        }
    }
}
