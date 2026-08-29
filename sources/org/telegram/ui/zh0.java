package org.telegram.ui;

import java.util.ArrayList;
public final class zh0 implements Runnable {
    public final int f45223a;
    public final org.telegram.ui.ActionBar.o2 f45224b;

    public zh0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f45223a = i10;
        this.f45224b = o2Var;
    }

    @Override
    public final void run() {
        switch (this.f45223a) {
            case 0:
                ?? obj = new Object();
                obj.f23673a = true;
                this.f45224b.showAsSheet(new PremiumPreviewFragment(0, "effect"), obj);
                return;
            case 1:
                org.telegram.ui.ActionBar.o2 o2Var = this.f45224b;
                if (o2Var instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) o2Var;
                    premiumPreviewFragment.f35921l0 = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.f35905a.x0(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.f35921l0 = true;
                    if (o2Var != null) {
                        o2Var.presentFragment(premiumPreviewFragment2);
                    } else {
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            U.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (o2Var != null && (o2Var.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        o2Var.getFragmentView().performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) o2Var.getParentActivity()).f35599t0.c(false);
                    return;
                }
                return;
            case 2:
                this.f45224b.presentFragment(new DataSettingsActivity());
                return;
            case 3:
                this.f45224b.presentFragment(new DataSettingsActivity());
                return;
            case 4:
                this.f45224b.presentFragment(new DataSettingsActivity());
                return;
            case 5:
                b.l(0, this.f45224b);
                return;
            case 6:
                b.l(0, this.f45224b);
                return;
            case 7:
                this.f45224b.presentFragment(new WallpapersListActivity(0));
                return;
            case 8:
                this.f45224b.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                return;
            case 9:
                this.f45224b.presentFragment(new WallpapersListActivity(1));
                return;
            case 10:
                this.f45224b.presentFragment(new WallpapersListActivity(0));
                return;
            case 11:
                b.l(0, this.f45224b);
                return;
            case 12:
                org.telegram.ui.ActionBar.o2 o2Var2 = this.f45224b;
                cg.p1 p1Var = new cg.p1(o2Var2, 4, false);
                p1Var.C();
                o2Var2.showDialog(p1Var);
                return;
            case 13:
                b.l(3, this.f45224b);
                return;
            case 14:
                b.l(3, this.f45224b);
                return;
            case 15:
                b.l(0, this.f45224b);
                return;
            case 16:
                b.l(0, this.f45224b);
                return;
            case 17:
                b.l(0, this.f45224b);
                return;
            case 18:
                b.l(0, this.f45224b);
                return;
            case 19:
                b.l(1, this.f45224b);
                return;
            case 20:
                this.f45224b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 21:
                b.l(0, this.f45224b);
                return;
            case 22:
                b.l(0, this.f45224b);
                return;
            case 23:
                this.f45224b.presentFragment(new NotificationsSettingsActivity());
                return;
            case 24:
                b.l(0, this.f45224b);
                return;
            case 25:
                b.l(0, this.f45224b);
                return;
            case 26:
                b.l(0, this.f45224b);
                return;
            case 27:
                b.l(0, this.f45224b);
                return;
            case 28:
                b.l(0, this.f45224b);
                return;
            default:
                b.l(0, this.f45224b);
                return;
        }
    }
}
