package org.telegram.ui;
public final class rh1 implements Runnable {
    public final int f39522a;
    public final UserInfoActivity f39523b;

    public rh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39522a = i10;
        this.f39523b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f39522a) {
            case 0:
                this.f39523b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.c71 c71Var = this.f39523b.f32599x;
                if (c71Var != null) {
                    c71Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f39523b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f39523b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
