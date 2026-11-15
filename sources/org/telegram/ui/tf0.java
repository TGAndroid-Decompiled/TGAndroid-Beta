package org.telegram.ui;

import java.util.ArrayList;
public final class tf0 implements Runnable {
    public final int f51572a;
    public final org.telegram.ui.ActionBar.e2 f51573b;

    public tf0(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f51572a = i7;
        this.f51573b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f51572a) {
            case 0:
                ?? obj = new Object();
                obj.f28476a = true;
                this.f51573b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = this.f51573b;
                if (e2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) e2Var;
                    premiumPreviewFragment.f42996q0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.f42975a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f42996q0 = true;
                    if (e2Var != null) {
                        e2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (e2Var != null && (e2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        e2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) e2Var.getParentActivity()).f42663w0.c(false);
                    return;
                }
                return;
            case 2:
                this.f51573b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 4:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 5:
                this.f51573b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f51573b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f51573b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f51573b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 10:
                org.telegram.messenger.i20.l(3, this.f51573b);
                return;
            case 11:
                org.telegram.messenger.i20.l(3, this.f51573b);
                return;
            case 12:
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f51573b;
                ug.x0 x0Var = new ug.x0(e2Var2, 5, false);
                x0Var.K0();
                e2Var2.showDialog(x0Var);
                return;
            case 13:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 14:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 15:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 16:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 17:
                org.telegram.messenger.i20.l(1, this.f51573b);
                return;
            case 18:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 19:
                this.f51573b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 21:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 22:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 23:
                this.f51573b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 25:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 26:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 27:
                org.telegram.messenger.i20.l(0, this.f51573b);
                return;
            case 28:
                this.f51573b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f51573b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
