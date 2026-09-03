package org.telegram.ui;
public final class sb0 implements Runnable {
    public final int f38145a;
    public final yb0 f38146b;
    public final String f38147c;

    public sb0(yb0 yb0Var, String str, int i10) {
        this.f38145a = i10;
        this.f38146b = yb0Var;
        this.f38147c = str;
    }

    @Override
    public final void run() {
        switch (this.f38145a) {
            case 0:
                yb0 yb0Var = this.f38146b;
                yb0Var.getClass();
                String str = this.f38147c;
                if ("disable".equalsIgnoreCase(str)) {
                    yb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    yb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    yb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                yb0 yb0Var2 = this.f38146b;
                yb0Var2.getClass();
                String str2 = this.f38147c;
                if ("disable".equalsIgnoreCase(str2)) {
                    yb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    yb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    yb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    yb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
