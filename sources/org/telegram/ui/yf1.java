package org.telegram.ui;
public final class yf1 implements Runnable {
    public final int f43477a;
    public final UserInfoActivity f43478b;

    public yf1(UserInfoActivity userInfoActivity, int i10) {
        this.f43477a = i10;
        this.f43478b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43477a) {
            case 0:
                this.f43478b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.v61 v61Var = this.f43478b.f33947x;
                if (v61Var != null) {
                    v61Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43478b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43478b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
