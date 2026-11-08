package org.telegram.ui;
public final class zz implements Runnable {
    public final int f52699a;
    public final FiltersSetupActivity f52700b;

    public zz(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f52699a = i7;
        this.f52700b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f52699a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f52700b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f52700b;
                filtersSetupActivity2.f41236a.e1(new wr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f52700b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f52700b.getMessagesController().c3(true, null);
                return;
        }
    }
}
