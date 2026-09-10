package zh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.wr;
public final class j2 implements Runnable {
    public final int f48532a;
    public final u7 f48533b;

    public j2(u7 u7Var, int i10) {
        this.f48532a = i10;
        this.f48533b = u7Var;
    }

    @Override
    public final void run() {
        switch (this.f48532a) {
            case 0:
                this.f48533b.P();
                return;
            case 1:
                u7 u7Var = this.f48533b;
                u7Var.f48925c0 = true;
                u7Var.n(true);
                return;
            case 2:
                u7 u7Var2 = this.f48533b;
                if (u7Var2.F != null) {
                    j7 j7Var = u7Var2.v;
                    if (j7Var != null) {
                        p.f48762c = true;
                        j7Var.setLayerType(2, null);
                    }
                    u7Var2.F.addListener(new d7(u7Var2, 0));
                    u7Var2.F.setDuration(320L);
                    u7Var2.F.setInterpolator(wr.h);
                    u7Var2.F.start();
                    return;
                }
                return;
            case 3:
                u7 u7Var3 = this.f48533b;
                u7Var3.f48965v0 = null;
                u7Var3.P();
                return;
            case 4:
                this.f48533b.L(true);
                return;
            case 5:
                u7 u7Var4 = this.f48533b;
                u7Var4.Q();
                r7 r7Var = u7Var4.f48959s0;
                ImageReceiver imageReceiver = r7Var.f48842b;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = r7Var.f48843c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                    return;
                }
                return;
            default:
                this.f48533b.m();
                return;
        }
    }
}
