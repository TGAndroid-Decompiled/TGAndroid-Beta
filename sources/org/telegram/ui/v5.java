package org.telegram.ui;
public final class v5 implements a60 {
    public final int f52130a;
    public final y5 f52131b;
    public final org.telegram.messenger.s2 f52132c;

    public v5(y5 y5Var, org.telegram.messenger.s2 s2Var, int i7) {
        this.f52130a = i7;
        this.f52131b = y5Var;
        this.f52132c = s2Var;
    }

    @Override
    public final void a(int i7) {
        switch (this.f52130a) {
            case 0:
                y5 y5Var = this.f52131b;
                org.telegram.messenger.s2 s2Var = this.f52132c;
                if (i7 == 4) {
                    y5Var.d.remove(s2Var);
                    y5Var.Z();
                } else {
                    s2Var.f26392b = i7;
                    org.telegram.messenger.g0.a4(y5Var.f53414b);
                }
                y5Var.getMessagesController().f25392s7.h(y5Var.f53416e, y5Var.d);
                return;
            default:
                this.f52132c.f26392b = i7;
                y5 y5Var2 = this.f52131b;
                y5Var2.getMessagesController().f25392s7.h(y5Var2.f53416e, y5Var2.d);
                org.telegram.messenger.g0.a4(y5Var2.f53414b);
                return;
        }
    }
}
