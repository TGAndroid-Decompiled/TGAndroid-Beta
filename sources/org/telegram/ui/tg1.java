package org.telegram.ui;
public final class tg1 implements Runnable {
    public final int f41615a;
    public final UserInfoActivity f41616b;

    public tg1(UserInfoActivity userInfoActivity, int i10) {
        this.f41615a = i10;
        this.f41616b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f41615a) {
            case 0:
                this.f41616b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.b61 b61Var = this.f41616b.f34928x;
                if (b61Var != null) {
                    b61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f41616b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f41616b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
