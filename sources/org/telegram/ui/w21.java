package org.telegram.ui;
public final class w21 implements Runnable {
    public final int f53090a;
    public final x21 f53091b;

    public w21(x21 x21Var, int i7) {
        this.f53090a = i7;
        this.f53091b = x21Var;
    }

    @Override
    public final void run() {
        String sb2;
        int i7 = this.f53090a;
        x21 x21Var = this.f53091b;
        switch (i7) {
            case 0:
                String str = x21Var.f53828b.text;
                if (str != null && str.equals("AUTH_TOKEN_EXCEPTION")) {
                    sb2 = org.telegram.messenger.gd.N0(2131754708, null);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    org.telegram.ui.Cells.c0.u(null, 2131751093, sb3, "\n");
                    sb3.append(x21Var.f53828b.text);
                    sb2 = sb3.toString();
                }
                org.telegram.ui.Components.b5.r0(x21Var.f53829c, org.telegram.messenger.gd.N0(2131753891, null), sb2, null);
                return;
            default:
                org.telegram.ui.Components.b5.r0(x21Var.f53829c, org.telegram.messenger.gd.N0(2131753891, null), org.telegram.messenger.gd.N0(2131751093, null), null);
                return;
        }
    }
}
