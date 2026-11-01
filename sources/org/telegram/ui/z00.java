package org.telegram.ui;
public final class z00 implements Runnable {
    public final int f43769a;
    public final FiltersSetupActivity f43770b;

    public z00(FiltersSetupActivity filtersSetupActivity, int i10) {
        this.f43769a = i10;
        this.f43770b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f43769a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f43770b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f43770b;
                filtersSetupActivity2.f33338a.e1(new st(filtersSetupActivity2, 11), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f43770b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f43770b.getMessagesController().a3(true, null);
                return;
        }
    }
}
