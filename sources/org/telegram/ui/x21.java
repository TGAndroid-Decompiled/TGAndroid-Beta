package org.telegram.ui;
public final class x21 implements Runnable {
    public final int f53592a;
    public final y21 f53593b;

    public x21(y21 y21Var, int i7) {
        this.f53592a = i7;
        this.f53593b = y21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f53592a;
        y21 y21Var = this.f53593b;
        switch (i7) {
            case 0:
                String str = y21Var.f54004b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.gd.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751094, sb3, "\n");
                    sb3.append(y21Var.f54004b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.b5.r0(y21Var.f54005c, org.telegram.messenger.gd.M0(2131753892, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.b5.r0(y21Var.f54005c, org.telegram.messenger.gd.M0(2131753892, null), org.telegram.messenger.gd.M0(2131751094, null), null);
                return;
        }
    }
}
