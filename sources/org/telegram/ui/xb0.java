package org.telegram.ui;
public final class xb0 implements Runnable {
    public final int f39600a;
    public final cc0 f39601b;
    public final String f39602c;

    public xb0(cc0 cc0Var, String str, int i10) {
        this.f39600a = i10;
        this.f39601b = cc0Var;
        this.f39602c = str;
    }

    @Override
    public final void run() {
        switch (this.f39600a) {
            case 0:
                cc0 cc0Var = this.f39601b;
                cc0Var.getClass();
                String str = this.f39602c;
                if ("disable".equalsIgnoreCase(str)) {
                    cc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    cc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    cc0Var.o("emailRow");
                    return;
                }
                return;
            default:
                cc0 cc0Var2 = this.f39601b;
                cc0Var2.getClass();
                String str2 = this.f39602c;
                if ("disable".equalsIgnoreCase(str2)) {
                    cc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    cc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    cc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    cc0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
