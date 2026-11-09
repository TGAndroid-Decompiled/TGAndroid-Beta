package org.telegram.ui;

import java.util.ArrayList;
public final class vf0 implements Runnable {
    public final int f50671a;
    public final org.telegram.ui.ActionBar.f2 f50672b;

    public vf0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f50671a = i7;
        this.f50672b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f50671a) {
            case 0:
                ?? obj = new Object();
                obj.f27408a = true;
                this.f50672b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.f2 f2Var = this.f50672b;
                if (f2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) f2Var;
                    premiumPreviewFragment.f41632p0 = true;
                    premiumPreviewFragment.getMediaDataController().R0(false);
                    premiumPreviewFragment.f41612a.y0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f41632p0 = true;
                    if (f2Var != null) {
                        f2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                        if (T != null) {
                            T.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (f2Var != null && (f2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        f2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) f2Var.getParentActivity()).f41300v0.c(false);
                    return;
                }
                return;
            case 2:
                this.f50672b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 4:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 5:
                this.f50672b.presentFragment(new WallpapersListActivity(0));
                return;
            case 6:
                this.f50672b.presentFragment(new WallpapersListActivity(1));
                return;
            case 7:
                this.f50672b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 8:
                this.f50672b.presentFragment(new WallpapersListActivity(0));
                return;
            case 9:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 10:
                org.telegram.messenger.camera.q.j(3, this.f50672b);
                return;
            case 11:
                org.telegram.messenger.camera.q.j(3, this.f50672b);
                return;
            case 12:
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f50672b;
                ug.w0 w0Var = new ug.w0(f2Var2, 5, false);
                w0Var.K0();
                f2Var2.showDialog(w0Var);
                return;
            case 13:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 14:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 15:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 16:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 17:
                org.telegram.messenger.camera.q.j(1, this.f50672b);
                return;
            case 18:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 19:
                this.f50672b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 20:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 21:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 22:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 23:
                this.f50672b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 25:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 26:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 27:
                org.telegram.messenger.camera.q.j(0, this.f50672b);
                return;
            case 28:
                this.f50672b.presentFragment(new StickersActivity(0, null));
                return;
            default:
                this.f50672b.presentFragment(new StickersActivity(0, null));
                return;
        }
    }
}
