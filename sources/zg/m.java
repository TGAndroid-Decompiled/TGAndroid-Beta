package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class m extends AnimatorListenerAdapter {
    public final int f49406a;
    public final r f49407b;

    public m(r rVar, int i10) {
        this.f49406a = i10;
        this.f49407b = rVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f49406a;
        r rVar = this.f49407b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                rVar.f49475c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    rVar.f49476f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                rVar.f49477n.setFocusableInTouchMode(true);
                return;
            case 2:
                rVar.f49480w.setVisibility(4);
                return;
            default:
                rVar.f49477n.setFocusableInTouchMode(false);
                rVar.f49476f.setVisibility(4);
                return;
        }
    }
}
