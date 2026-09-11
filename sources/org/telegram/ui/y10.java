package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f42948a;
    public final FiltersSetupActivity f42949b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f42948a = i10;
        this.f42949b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f42948a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f42949b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f42949b;
                filtersSetupActivity2.f33406a.d1(new iu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f42949b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
