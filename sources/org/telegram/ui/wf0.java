package org.telegram.ui;

import java.util.ArrayList;
public final class wf0 implements Runnable {
    public final int f53430a;
    public final org.telegram.ui.ActionBar.h2 f53431b;

    public wf0(int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f53430a = i7;
        this.f53431b = h2Var;
    }

    @Override
    public final void run() {
        switch (this.f53430a) {
            case 0:
                ?? obj = new Object();
                obj.f28923a = true;
                this.f53431b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.h2 h2Var = this.f53431b;
                if (h2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) h2Var;
                    premiumPreviewFragment.f43441q0 = true;
                    premiumPreviewFragment.getMediaDataController().U0(false);
                    premiumPreviewFragment.f43420a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f43441q0 = true;
                    if (h2Var != null) {
                        h2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (h2Var != null && (h2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        h2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) h2Var.getParentActivity()).f43108w0.c(false);
                    return;
                }
                return;
            case 2:
                this.f53431b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 4:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 5:
                this.f53431b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f53431b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f53431b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f53431b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 10:
                org.telegram.messenger.n10.m(3, this.f53431b);
                return;
            case 11:
                org.telegram.messenger.n10.m(3, this.f53431b);
                return;
            case 12:
                org.telegram.ui.ActionBar.h2 h2Var2 = this.f53431b;
                ug.z0 z0Var = new ug.z0(h2Var2, 5, false);
                z0Var.L0();
                h2Var2.showDialog(z0Var);
                return;
            case 13:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 14:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 15:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 16:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 17:
                org.telegram.messenger.n10.m(1, this.f53431b);
                return;
            case 18:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 19:
                this.f53431b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 21:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 22:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 23:
                this.f53431b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 25:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 26:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 27:
                org.telegram.messenger.n10.m(0, this.f53431b);
                return;
            case 28:
                this.f53431b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f53431b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
