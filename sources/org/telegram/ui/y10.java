package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f43009a;
    public final FiltersSetupActivity f43010b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f43009a = i10;
        this.f43010b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43009a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43010b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43010b;
                filtersSetupActivity2.f33757a.f1(new bu(filtersSetupActivity2, 11), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f43010b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
