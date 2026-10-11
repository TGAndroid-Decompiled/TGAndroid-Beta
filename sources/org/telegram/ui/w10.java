package org.telegram.ui;
public final class w10 implements Runnable {
    public final int f43170a;
    public final FiltersSetupActivity f43171b;

    public w10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f43170a = i10;
        this.f43171b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43170a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43171b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43171b;
                filtersSetupActivity2.f33788a.e1(new fu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f43171b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
