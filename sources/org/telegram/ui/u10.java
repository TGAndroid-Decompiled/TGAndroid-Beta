package org.telegram.ui;
public final class u10 implements Runnable {
    public final int f38377a;
    public final FiltersSetupActivity f38378b;

    public u10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f38377a = i10;
        this.f38378b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f38377a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f38378b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f38378b;
                filtersSetupActivity2.f31159a.f1(new du(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f38378b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
