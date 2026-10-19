package org.telegram.ui;
public final class yf1 implements Runnable {
    public final int f43471a;
    public final UserInfoActivity f43472b;

    public yf1(UserInfoActivity userInfoActivity, int i10) {
        this.f43471a = i10;
        this.f43472b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43471a) {
            case 0:
                this.f43472b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.v61 v61Var = this.f43472b.f33945x;
                if (v61Var != null) {
                    v61Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43472b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43472b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
