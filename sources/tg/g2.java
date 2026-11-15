package tg;

import hi.g7;
public final class g2 implements Runnable {
    public final int f57317a;
    public final l2 f57318b;

    public g2(l2 l2Var, int i7) {
        this.f57317a = i7;
        this.f57318b = l2Var;
    }

    @Override
    public final void run() {
        switch (this.f57317a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                return;
            case 1:
                org.telegram.messenger.g0.h3(new g2(this.f57318b, 0));
                return;
            case 2:
                this.f57318b.dismiss();
                return;
            default:
                l2 l2Var = this.f57318b;
                g7 g7Var = l2Var.I;
                if (g7Var != null) {
                    g7Var.a(null);
                    l2Var.I = null;
                }
                l2Var.dismiss();
                return;
        }
    }
}
