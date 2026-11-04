package org.telegram.ui;
public final class ta1 implements Runnable {
    public final int f49760a;
    public final UserInfoActivity f49761b;

    public ta1(UserInfoActivity userInfoActivity, int i3) {
        this.f49760a = i3;
        this.f49761b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f49760a) {
            case 0:
                this.f49761b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                ai.h4 h4Var = this.f49761b.f42104y;
                if (h4Var != null) {
                    h4Var.f35594g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f49761b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f49761b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
