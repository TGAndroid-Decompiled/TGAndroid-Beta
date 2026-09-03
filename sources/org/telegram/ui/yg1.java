package org.telegram.ui;
public final class yg1 implements Runnable {
    public final int f43626a;
    public final UserInfoActivity f43627b;

    public yg1(UserInfoActivity userInfoActivity, int i10) {
        this.f43626a = i10;
        this.f43627b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43626a) {
            case 0:
                this.f43627b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.a61 a61Var = this.f43627b.f34928x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43627b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43627b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
