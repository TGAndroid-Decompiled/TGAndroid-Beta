package org.telegram.ui;
public final class rh1 implements Runnable {
    public final int f39804a;
    public final UserInfoActivity f39805b;

    public rh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39804a = i10;
        this.f39805b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39804a) {
            case 0:
                this.f39805b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.b71 b71Var = this.f39805b.f32897x;
                if (b71Var != null) {
                    b71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39805b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39805b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
