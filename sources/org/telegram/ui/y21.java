package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f54019a;
    public final z21 f54020b;

    public y21(z21 z21Var, int i7) {
        this.f54019a = i7;
        this.f54020b = z21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f54019a;
        z21 z21Var = this.f54020b;
        switch (i7) {
            case 0:
                String str = z21Var.f54381b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.gd.N0(2131754708, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                    sb3.append(z21Var.f54381b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.r0(z21Var.f54382c, org.telegram.messenger.gd.N0(2131753891, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.r0(z21Var.f54382c, org.telegram.messenger.gd.N0(2131753891, null), org.telegram.messenger.gd.N0(2131751093, null), null);
                return;
        }
    }
}
