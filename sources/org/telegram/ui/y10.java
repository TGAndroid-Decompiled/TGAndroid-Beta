package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f43001a;
    public final FiltersSetupActivity f43002b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f43001a = i10;
        this.f43002b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43001a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43002b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43002b;
                filtersSetupActivity2.f33750a.f1(new bu(filtersSetupActivity2, 11), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f43002b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
