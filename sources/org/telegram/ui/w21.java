package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f50894a;
    public final x21 f50895b;

    public w21(x21 x21Var, int i7) {
        this.f50894a = i7;
        this.f50895b = x21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f50894a;
        x21 x21Var = this.f50895b;
        switch (i7) {
            case 0:
                String str = x21Var.f51720b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.hd.M0(2131754709, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.messenger.camera.q.q(null, 2131751106, sb3, "\n");
                    sb3.append(x21Var.f51720b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.v4.r0(x21Var.f51721c, org.telegram.messenger.hd.M0(2131753894, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.v4.r0(x21Var.f51721c, org.telegram.messenger.hd.M0(2131753894, null), org.telegram.messenger.hd.M0(2131751106, null), null);
                return;
        }
    }
}
