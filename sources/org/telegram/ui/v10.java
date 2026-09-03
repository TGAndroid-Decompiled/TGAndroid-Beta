package org.telegram.ui;
public final class v10 implements Runnable {
    public final int f38950a;
    public final FiltersSetupActivity f38951b;

    public v10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f38950a = i10;
        this.f38951b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38950a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38951b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38951b;
                filtersSetupActivity2.f31571a.d1(new hu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f38951b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
