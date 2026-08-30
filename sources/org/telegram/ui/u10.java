package org.telegram.ui;
public final class u10 implements Runnable {
    public final int f38818a;
    public final FiltersSetupActivity f38819b;

    public u10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f38818a = i10;
        this.f38819b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38818a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38819b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38819b;
                filtersSetupActivity2.f31597a.e1(new fu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f38819b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
