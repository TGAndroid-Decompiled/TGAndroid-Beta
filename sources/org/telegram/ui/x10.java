package org.telegram.ui;
public final class x10 implements Runnable {
    public final int f43832a;
    public final FiltersSetupActivity f43833b;

    public x10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f43832a = i10;
        this.f43833b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43832a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43833b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43833b;
                filtersSetupActivity2.f33798a.e1(new gu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f43833b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
