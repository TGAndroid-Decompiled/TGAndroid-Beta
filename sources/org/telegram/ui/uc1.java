package org.telegram.ui;
public final class uc1 implements Runnable {
    public final int f41909a;
    public final UserInfoActivity f41910b;

    public uc1(UserInfoActivity userInfoActivity, int i10) {
        this.f41909a = i10;
        this.f41910b = userInfoActivity;
    }

    @Override
    public final void run() {
        switch (this.f41909a) {
            case 0:
                this.f41910b.presentFragment(new PrivacyControlActivity(9, true));
                return;
            case 1:
                org.telegram.ui.Components.ii iiVar = this.f41910b.f34152y;
                if (iiVar != null) {
                    iiVar.f31183f3.O(true);
                    return;
                }
                return;
            case 2:
                UserInfoActivity userInfoActivity = this.f41910b;
                userInfoActivity.getClass();
                userInfoActivity.presentFragment(new PrivacyControlActivity(11, false));
                return;
            default:
                UserInfoActivity userInfoActivity2 = this.f41910b;
                userInfoActivity2.getClass();
                userInfoActivity2.presentFragment(new PremiumPreviewFragment(0, "add_account"));
                return;
        }
    }
}
