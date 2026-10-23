package org.telegram.ui;
public final class yf1 implements Runnable {
    public final int f43487a;
    public final UserInfoActivity f43488b;

    public yf1(UserInfoActivity userInfoActivity, int i10) {
        this.f43487a = i10;
        this.f43488b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f43487a) {
            case 0:
                this.f43488b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.w61 w61Var = this.f43488b.f33958x;
                if (w61Var != null) {
                    w61Var.W2.N(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f43488b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f43488b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
