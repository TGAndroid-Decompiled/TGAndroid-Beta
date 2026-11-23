package org.telegram.ui;
public final class x21 implements Runnable {
    public final int f53510a;
    public final y21 f53511b;

    public x21(y21 y21Var, int i7) {
        this.f53510a = i7;
        this.f53511b = y21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f53510a;
        y21 y21Var = this.f53511b;
        switch (i7) {
            case 0:
                String str = y21Var.f53997b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.hd.N0(2131754708, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                    sb3.append(y21Var.f53997b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.c5.r0(y21Var.f53998c, org.telegram.messenger.hd.N0(2131753891, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.c5.r0(y21Var.f53998c, org.telegram.messenger.hd.N0(2131753891, null), org.telegram.messenger.hd.N0(2131751093, null), null);
                return;
        }
    }
}
