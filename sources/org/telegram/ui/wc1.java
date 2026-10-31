package org.telegram.ui;
public final class wc1 implements Runnable {
    public final int f42937a;
    public final UserInfoActivity f42938b;

    public wc1(UserInfoActivity userInfoActivity, int i10) {
        this.f42937a = i10;
        this.f42938b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f42937a) {
            case 0:
                this.f42938b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.ii iiVar = this.f42938b.f34145y;
                if (iiVar != null) {
                    iiVar.f30819f3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f42938b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f42938b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
