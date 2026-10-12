package org.telegram.ui;
public final class z10 implements Runnable {
    public final int f44594a;
    public final FiltersSetupActivity f44595b;

    public z10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f44594a = i10;
        this.f44595b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f44594a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f44595b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f44595b;
                filtersSetupActivity2.f33597a.e1(new ju(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f44595b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
