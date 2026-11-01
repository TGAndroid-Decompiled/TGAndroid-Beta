package th;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;
public final class i2 implements Runnable {
    public final int f49071a;
    public final o7 f49072b;

    public i2(o7 o7Var, int i10) {
        this.f49071a = i10;
        this.f49072b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f49071a) {
            case 0:
                this.f49072b.d0();
                return;
            case 1:
                o7 o7Var = this.f49072b;
                o7Var.f49311c0 = true;
                o7Var.A(true);
                return;
            case 2:
                o7 o7Var2 = this.f49072b;
                if (o7Var2.F != null) {
                    d7 d7Var = o7Var2.f49353w;
                    if (d7Var != null) {
                        p.f49362c = true;
                        d7Var.setLayerType(2, null);
                    }
                    o7Var2.F.addListener(new x6(o7Var2, 0));
                    o7Var2.F.setDuration(320L);
                    o7Var2.F.setInterpolator(gr.h);
                    o7Var2.F.start();
                    return;
                }
                return;
            case 3:
                o7 o7Var3 = this.f49072b;
                o7Var3.f49351v0 = null;
                o7Var3.d0();
                return;
            case 4:
                this.f49072b.Z(true);
                return;
            case 5:
                o7 o7Var4 = this.f49072b;
                o7Var4.e0();
                l7 l7Var = o7Var4.f49345s0;
                ImageReceiver imageReceiver = l7Var.f49198b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = l7Var.f49199c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    return;
                }
                return;
            default:
                this.f49072b.y();
                return;
        }
    }
}
