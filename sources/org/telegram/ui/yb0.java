package org.telegram.ui;
public final class yb0 implements Runnable {
    public final int f43125a;
    public final dc0 f43126b;
    public final String f43127c;

    public yb0(dc0 dc0Var, String str, int i10) {
        this.f43125a = i10;
        this.f43126b = dc0Var;
        this.f43127c = str;
    }

    @Override
    public final void run() {
        switch (this.f43125a) {
            case 0:
                dc0 dc0Var = this.f43126b;
                dc0Var.getClass();
                String str = this.f43127c;
                if ("disable".equalsIgnoreCase(str)) {
                    dc0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    dc0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    dc0Var.o("emailRow");
                    return;
                }
                return;
            default:
                dc0 dc0Var2 = this.f43126b;
                dc0Var2.getClass();
                String str2 = this.f43127c;
                if ("disable".equalsIgnoreCase(str2)) {
                    dc0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    dc0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    dc0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    dc0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
