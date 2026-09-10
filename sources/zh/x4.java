package zh;

import org.telegram.messenger.NotificationCenter;
public final class x4 implements Runnable {
    public final int f49046a;
    public final a5 f49047b;

    public x4(a5 a5Var, int i10) {
        this.f49046a = i10;
        this.f49047b = a5Var;
    }

    @Override
    public final void run() {
        int i10 = this.f49046a;
        a5 a5Var = this.f49047b;
        switch (i10) {
            case 0:
                NotificationCenter.getInstance(a5Var.f48237c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a5Var);
                return;
            case 1:
                a5Var.f48252u = false;
                a5Var.f48253w = true;
                NotificationCenter.getInstance(a5Var.f48237c).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesListUpdated, a5Var, Boolean.FALSE);
                return;
            case 2:
                a5Var.f48256z = false;
                return;
            default:
                a5Var.f48242k.clear();
                a5Var.d(true);
                return;
        }
    }
}
