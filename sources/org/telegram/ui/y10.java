package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f39725a;
    public final FiltersSetupActivity f39726b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f39725a = i10;
        this.f39726b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f39725a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f39726b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f39726b;
                filtersSetupActivity2.f30799a.e1(new hu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f39726b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
