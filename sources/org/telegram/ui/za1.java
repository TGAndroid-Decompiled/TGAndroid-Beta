package org.telegram.ui;
public final class za1 implements Runnable {
    public final int f53920a;
    public final UserInfoActivity f53921b;

    public za1(UserInfoActivity userInfoActivity, int i7) {
        this.f53920a = i7;
        this.f53921b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f53920a) {
            case 0:
                this.f53921b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                bi.v3 v3Var = this.f53921b.f43447y;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f53921b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f53921b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
