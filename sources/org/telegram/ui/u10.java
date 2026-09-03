package org.telegram.ui;
public final class u10 implements Runnable {
    public final int f41693a;
    public final FiltersSetupActivity f41694b;

    public u10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f41693a = i10;
        this.f41694b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f41693a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f41694b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f41694b;
                filtersSetupActivity2.f34117a.d1(new gu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f41694b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
