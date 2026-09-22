package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f39798a;
    public final FiltersSetupActivity f39799b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f39798a = i10;
        this.f39799b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f39798a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f39799b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f39799b;
                filtersSetupActivity2.f31104a.f1(new fu(filtersSetupActivity2, 10), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f39799b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
