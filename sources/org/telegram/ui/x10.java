package org.telegram.ui;
public final class x10 implements Runnable {
    public final int f39495a;
    public final FiltersSetupActivity f39496b;

    public x10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f39495a = i10;
        this.f39496b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f39495a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f39496b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f39496b;
                filtersSetupActivity2.f31087a.f1(new au(filtersSetupActivity2, 11), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f39496b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
