package org.telegram.ui;

import java.util.ArrayList;
public final class vf0 implements Runnable {
    public final int f52960a;
    public final org.telegram.ui.ActionBar.g2 f52961b;

    public vf0(int i7, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f52960a = i7;
        this.f52961b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f52960a) {
            case 0:
                ?? obj = new Object();
                obj.f28948a = true;
                this.f52961b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = this.f52961b;
                if (g2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) g2Var;
                    premiumPreviewFragment.f43567q0 = true;
                    premiumPreviewFragment.getMediaDataController().U0(false);
                    premiumPreviewFragment.f43546a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f43567q0 = true;
                    if (g2Var != null) {
                        g2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (g2Var != null && (g2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        g2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) g2Var.getParentActivity()).f43228w0.c(false);
                    return;
                }
                return;
            case 2:
                this.f52961b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 4:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 5:
                this.f52961b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f52961b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f52961b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f52961b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 10:
                org.telegram.messenger.m10.m(3, this.f52961b);
                return;
            case 11:
                org.telegram.messenger.m10.m(3, this.f52961b);
                return;
            case 12:
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f52961b;
                ug.y0 y0Var = new ug.y0(g2Var2, 5, false);
                y0Var.L0();
                g2Var2.showDialog(y0Var);
                return;
            case 13:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 14:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 15:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 16:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 17:
                org.telegram.messenger.m10.m(1, this.f52961b);
                return;
            case 18:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 19:
                this.f52961b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 21:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 22:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 23:
                this.f52961b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 25:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 26:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 27:
                org.telegram.messenger.m10.m(0, this.f52961b);
                return;
            case 28:
                this.f52961b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f52961b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
