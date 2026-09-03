package org.telegram.ui;
public final class zg1 implements Runnable {
    public final int f40480a;
    public final UserInfoActivity f40481b;

    public zg1(UserInfoActivity userInfoActivity, int i10) {
        this.f40480a = i10;
        this.f40481b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f40480a) {
            case 0:
                this.f40481b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.a61 a61Var = this.f40481b.f32359x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f40481b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f40481b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
