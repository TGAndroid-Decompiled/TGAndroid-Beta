package org.telegram.ui;
public final class y10 implements Runnable {
    public final int f42975a;
    public final FiltersSetupActivity f42976b;

    public y10(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f42975a = i10;
        this.f42976b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f42975a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f42976b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f42976b;
                filtersSetupActivity2.f33433a.d1(new iu(filtersSetupActivity2, 9), 700, true);
                return;
            default:
                FiltersSetupActivity filtersSetupActivity3 = this.f42976b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) filtersSetupActivity3, 9, true));
                return;
        }
    }
}
