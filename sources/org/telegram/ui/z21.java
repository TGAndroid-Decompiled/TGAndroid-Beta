package org.telegram.ui;
public final class z21 implements Runnable {
    public final int f52189a;
    public final a31 f52190b;

    public z21(a31 a31Var, int i7) {
        this.f52189a = i7;
        this.f52190b = a31Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f52189a;
        a31 a31Var = this.f52190b;
        switch (i7) {
            case 0:
                String str = a31Var.f43549b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.id.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                    sb3.append(a31Var.f43549b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.u4.r0(a31Var.f43550c, org.telegram.messenger.id.M0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.u4.r0(a31Var.f43550c, org.telegram.messenger.id.M0(2131753894, null), org.telegram.messenger.id.M0(2131751105, null), null);
                return;
        }
    }
}
