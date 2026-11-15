package org.telegram.ui;
public final class t21 implements Runnable {
    public final int f51331a;
    public final u21 f51332b;

    public t21(u21 u21Var, int i7) {
        this.f51331a = i7;
        this.f51332b = u21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f51331a;
        u21 u21Var = this.f51332b;
        switch (i7) {
            case 0:
                String str = u21Var.f51727b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.hd.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.y0.r(null, 2131751105, sb3, "\n");
                    sb3.append(u21Var.f51727b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.t4.r0(u21Var.f51728c, org.telegram.messenger.hd.M0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.t4.r0(u21Var.f51728c, org.telegram.messenger.hd.M0(2131753894, null), org.telegram.messenger.hd.M0(2131751105, null), null);
                return;
        }
    }
}
