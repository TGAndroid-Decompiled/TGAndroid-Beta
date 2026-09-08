package org.telegram.ui;

import java.util.ArrayList;
public final class ri0 implements Runnable {
    public final int f40208a;
    public final org.telegram.ui.ActionBar.n2 f40209b;

    public ri0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f40208a = i10;
        this.f40209b = n2Var;
    }

    @Override
    public final void run() {
        switch (this.f40208a) {
            case 0:
                ?? obj = new Object();
                obj.f21169a = true;
                this.f40209b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.n2 n2Var = this.f40209b;
                if (n2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) n2Var;
                    premiumPreviewFragment.f33817p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f33797a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f33817p0 = true;
                    if (n2Var != null) {
                        n2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (n2Var != null && (n2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        n2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) n2Var.getParentActivity()).f33494x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f40209b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                this.f40209b.presentFragment(new DataSettingsActivity());
                return;
            case 4:
                this.f40209b.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 6:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 7:
                this.f40209b.presentFragment(new WallpapersListActivity(0));
                return;
            case 8:
                this.f40209b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 9:
                this.f40209b.presentFragment(new WallpapersListActivity(1));
                return;
            case 10:
                this.f40209b.presentFragment(new WallpapersListActivity(0));
                return;
            case 11:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 12:
                org.telegram.ui.ActionBar.n2 n2Var2 = this.f40209b;
                sg.a1 a1Var = new sg.a1(n2Var2, 4, false);
                a1Var.C();
                n2Var2.showDialog(a1Var);
                return;
            case 13:
                org.telegram.messenger.wl.m(3, this.f40209b);
                return;
            case 14:
                org.telegram.messenger.wl.m(3, this.f40209b);
                return;
            case 15:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 16:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 17:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 18:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 19:
                org.telegram.messenger.wl.m(1, this.f40209b);
                return;
            case 20:
                this.f40209b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 21:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 22:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 23:
                this.f40209b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 25:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 26:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 27:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            case 28:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
            default:
                org.telegram.messenger.wl.m(0, this.f40209b);
                return;
        }
    }
}
