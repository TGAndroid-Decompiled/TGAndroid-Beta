package org.telegram.ui;
public final class rg1 implements Runnable {
    public final int f38047a;
    public final UserInfoActivity f38048b;

    public rg1(UserInfoActivity userInfoActivity, int i10) {
        this.f38047a = i10;
        this.f38048b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f38047a) {
            case 0:
                this.f38048b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.a61 a61Var = this.f38048b.f32385x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f38048b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f38048b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
