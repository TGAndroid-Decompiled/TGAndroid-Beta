package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f47063a;
    public final s f47064b;

    public m(s sVar, int i10) {
        this.f47063a = i10;
        this.f47064b = sVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f47063a;
        s sVar = this.f47064b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                sVar.f47135c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    sVar.f47136f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                sVar.f47137n.setFocusableInTouchMode(true);
                return;
            case 2:
                sVar.f47140w.setVisibility(4);
                return;
            default:
                sVar.f47137n.setFocusableInTouchMode(false);
                sVar.f47136f.setVisibility(4);
                return;
        }
    }
}
