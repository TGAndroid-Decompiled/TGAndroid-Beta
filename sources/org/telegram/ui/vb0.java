package org.telegram.ui;
public final class vb0 implements Runnable {
    public final int f38347a;
    public final ac0 f38348b;
    public final String f38349c;

    public vb0(ac0 ac0Var, String str, int i10) {
        this.f38347a = i10;
        this.f38348b = ac0Var;
        this.f38349c = str;
    }

    @Override
    public final void run() {
        switch (this.f38347a) {
            case 0:
                ac0 ac0Var = this.f38348b;
                ac0Var.getClass();
                String str = this.f38349c;
                if ("disable".equalsIgnoreCase(str)) {
                    ac0Var.o("turnPasswordOffRow");
                }
                if ("change".equalsIgnoreCase(str)) {
                    ac0Var.o("changePasswordRow");
                }
                if ("change-email".equalsIgnoreCase(str)) {
                    ac0Var.o("emailRow");
                    return;
                }
                return;
            default:
                ac0 ac0Var2 = this.f38348b;
                ac0Var2.getClass();
                String str2 = this.f38349c;
                if ("disable".equalsIgnoreCase(str2)) {
                    ac0Var2.o("disablePasscodeRow");
                }
                if ("change".equalsIgnoreCase(str2)) {
                    ac0Var2.o("changePasscodeRow");
                }
                if ("auto-lock".equalsIgnoreCase(str2)) {
                    ac0Var2.o("autoLockRow");
                }
                if ("fingerprint".equalsIgnoreCase(str2)) {
                    ac0Var2.o("fingerprintRow");
                    return;
                }
                return;
        }
    }
}
