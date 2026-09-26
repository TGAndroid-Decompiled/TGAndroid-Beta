package org.telegram.ui;
public final class ub0 implements Runnable {
    public final int f38421a;
    public final zb0 f38422b;
    public final String f38423c;

    public ub0(zb0 zb0Var, String str, int i10) {
        this.f38421a = i10;
        this.f38422b = zb0Var;
        this.f38423c = str;
    }

    @Override
    public final void run() {
        switch (this.f38421a) {
            case 0:
                zb0 zb0Var = this.f38422b;
                zb0Var.getClass();
                String str = this.f38423c;
                if ("disable".equalsIgnoreCase(str)) {
                    zb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    zb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    zb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                zb0 zb0Var2 = this.f38422b;
                zb0Var2.getClass();
                String str2 = this.f38423c;
                if ("disable".equalsIgnoreCase(str2)) {
                    zb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    zb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    zb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    zb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
