package org.telegram.ui;
public final class rb0 implements Runnable {
    public final int f40914a;
    public final xb0 f40915b;
    public final String f40916c;

    public rb0(xb0 xb0Var, String str, int i10) {
        this.f40914a = i10;
        this.f40915b = xb0Var;
        this.f40916c = str;
    }

    @Override
    public final void run() {
        switch (this.f40914a) {
            case 0:
                xb0 xb0Var = this.f40915b;
                xb0Var.getClass();
                String str = this.f40916c;
                if ("disable".equalsIgnoreCase(str)) {
                    xb0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    xb0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    xb0Var.o("emailRow");
                    return;
                }
                return;
            default:
                xb0 xb0Var2 = this.f40915b;
                xb0Var2.getClass();
                String str2 = this.f40916c;
                if ("disable".equalsIgnoreCase(str2)) {
                    xb0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    xb0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    xb0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    xb0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
