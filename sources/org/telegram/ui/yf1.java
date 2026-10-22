package org.telegram.ui;
public final class yf1 implements Runnable {
    public final int f43486a;
    public final UserInfoActivity f43487b;

    public yf1(UserInfoActivity userInfoActivity, int i10) {
        this.f43486a = i10;
        this.f43487b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43486a) {
            case 0:
                this.f43487b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.w61 w61Var = this.f43487b.f33957x;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43487b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43487b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
