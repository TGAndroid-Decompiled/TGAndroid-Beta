package org.telegram.ui;
public final class zb0 implements Runnable {
    public final int f44533a;
    public final ec0 f44534b;
    public final String f44535c;

    public zb0(ec0 ec0Var, String str, int i10) {
        this.f44533a = i10;
        this.f44534b = ec0Var;
        this.f44535c = str;
    }

    @Override
    public final void run() {
        switch (this.f44533a) {
            case 0:
                ec0 ec0Var = this.f44534b;
                if (ec0Var.a()) {
                    ec0Var.w(this.f44535c);
                    return;
                }
                return;
            case 1:
                this.f44534b.w(this.f44535c);
                return;
            case 2:
                ec0 ec0Var2 = this.f44534b;
                ec0Var2.getClass();
                String str = this.f44535c;
                if ("disable".equalsIgnoreCase(str)) {
                    ec0Var2.x("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ec0Var2.x("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ec0Var2.x("emailRow");
                    return;
                }
                return;
            default:
                ec0 ec0Var3 = this.f44534b;
                ec0Var3.getClass();
                String str2 = this.f44535c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ec0Var3.x("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ec0Var3.x("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ec0Var3.x("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ec0Var3.x("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
