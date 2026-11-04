package org.telegram.ui;
public final class xz implements Runnable {
    public final int f52129a;
    public final FiltersSetupActivity f52130b;

    public xz(FiltersSetupActivity filtersSetupActivity, int i3) {
        this.f52129a = i3;
        this.f52130b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f52129a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f52130b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f52130b;
                filtersSetupActivity2.f41265a.e1(new ur(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f52130b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f52130b.getMessagesController().c3(true, null);
                return;
        }
    }
}
