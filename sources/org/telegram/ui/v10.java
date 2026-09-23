package org.telegram.ui;
public final class v10 implements Runnable {
    public final int f38264a;
    public final FiltersSetupActivity f38265b;

    public v10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f38264a = i10;
        this.f38265b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38264a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38265b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38265b;
                filtersSetupActivity2.f30770a.e1(new eu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f38265b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
