package org.telegram.ui;
public final class yb0 implements Runnable {
    public final int f44337a;
    public final dc0 f44338b;
    public final String f44339c;

    public yb0(dc0 dc0Var, String str, int i10) {
        this.f44337a = i10;
        this.f44338b = dc0Var;
        this.f44339c = str;
    }

    @Override
    public final void run() {
        switch (this.f44337a) {
            case 0:
                dc0 dc0Var = this.f44338b;
                if (dc0Var.a()) {
                    dc0Var.w(this.f44339c);
                    return;
                }
                return;
            case 1:
                this.f44338b.w(this.f44339c);
                return;
            case 2:
                dc0 dc0Var2 = this.f44338b;
                dc0Var2.getClass();
                String str = this.f44339c;
                if ("disable".equalsIgnoreCase(str)) {
                    dc0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    dc0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    dc0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                dc0 dc0Var3 = this.f44338b;
                dc0Var3.getClass();
                String str2 = this.f44339c;
                if ("disable".equalsIgnoreCase(str2)) {
                    dc0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    dc0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    dc0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    dc0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
