package org.telegram.ui;
public final class zz implements Runnable {
    public final int f52671a;
    public final FiltersSetupActivity f52672b;

    public zz(FiltersSetupActivity filtersSetupActivity, int i7) {
        this.f52671a = i7;
        this.f52672b = filtersSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.f52671a) {
            case 0:
                FiltersSetupActivity filtersSetupActivity = this.f52672b;
                filtersSetupActivity.getClass();
                filtersSetupActivity.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                FiltersSetupActivity filtersSetupActivity2 = this.f52672b;
                filtersSetupActivity2.f41208a.e1(new wr(filtersSetupActivity2, 12), 700, true);
                return;
            case 2:
                FiltersSetupActivity filtersSetupActivity3 = this.f52672b;
                filtersSetupActivity3.getClass();
                filtersSetupActivity3.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) filtersSetupActivity3, 9, true));
                return;
            default:
                this.f52672b.getMessagesController().c3(true, null);
                return;
        }
    }
}
