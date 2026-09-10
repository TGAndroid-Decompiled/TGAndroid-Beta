package org.telegram.ui;

import java.util.ArrayList;
public final class ri0 implements Runnable {
    public final int f36375a;
    public final org.telegram.ui.ActionBar.p2 f36376b;

    public ri0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f36375a = i10;
        this.f36376b = p2Var;
    }

    @Override
    public final void run() {
        switch (this.f36375a) {
            case 0:
                ?? obj = new Object();
                obj.f18485a = true;
                this.f36376b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.p2 p2Var = this.f36376b;
                if (p2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) p2Var;
                    premiumPreviewFragment.f30286p0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f30267a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f30286p0 = true;
                    if (p2Var != null) {
                        p2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (p2Var != null && (p2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        p2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) p2Var.getParentActivity()).f29971x0.c(false);
                    return;
                }
                return;
            case 2:
                this.f36376b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                this.f36376b.presentFragment(new DataSettingsActivity());
                return;
            case 4:
                this.f36376b.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 6:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 7:
                this.f36376b.presentFragment(new WallpapersListActivity(0));
                return;
            case 8:
                this.f36376b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 9:
                this.f36376b.presentFragment(new WallpapersListActivity(1));
                return;
            case 10:
                this.f36376b.presentFragment(new WallpapersListActivity(0));
                return;
            case 11:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 12:
                org.telegram.ui.ActionBar.p2 p2Var2 = this.f36376b;
                qg.a1 a1Var = new qg.a1(p2Var2, 4, false);
                a1Var.C();
                p2Var2.showDialog(a1Var);
                return;
            case 13:
                org.telegram.messenger.em.m(3, this.f36376b);
                return;
            case 14:
                org.telegram.messenger.em.m(3, this.f36376b);
                return;
            case 15:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 16:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 17:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 18:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 19:
                org.telegram.messenger.em.m(1, this.f36376b);
                return;
            case 20:
                this.f36376b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 21:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 22:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 23:
                this.f36376b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 25:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 26:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 27:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            case 28:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
            default:
                org.telegram.messenger.em.m(0, this.f36376b);
                return;
        }
    }
}
