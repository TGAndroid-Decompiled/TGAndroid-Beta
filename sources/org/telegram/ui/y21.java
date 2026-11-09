package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f51828a;
    public final z21 f51829b;

    public y21(z21 z21Var, int i7) {
        this.f51828a = i7;
        this.f51829b = z21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f51828a;
        z21 z21Var = this.f51829b;
        switch (i7) {
            case 0:
                String str = z21Var.f52404b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.id.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751105, sb3, "\n");
                    sb3.append(z21Var.f52404b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.v4.r0(z21Var.f52405c, org.telegram.messenger.id.M0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.v4.r0(z21Var.f52405c, org.telegram.messenger.id.M0(2131753894, null), org.telegram.messenger.id.M0(2131751105, null), null);
                return;
        }
    }
}
