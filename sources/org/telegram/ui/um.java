package org.telegram.ui;
public final class um implements Runnable {
    public final int f41260a;
    public final kn f41261b;

    public um(kn knVar, int i10) {
        this.f41260a = i10;
        this.f41261b = knVar;
    }

    @Override
    public final void run() {
        switch (this.f41260a) {
            case 0:
                yn ynVar = this.f41261b.f38008a;
                ynVar.f43288b5 = null;
                ynVar.f43302c5 = null;
                return;
            case 1:
                kn knVar = this.f41261b;
                knVar.getClass();
                yn ynVar2 = knVar.f38008a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar2, 8, true).show();
                ynVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                kn knVar2 = this.f41261b;
                knVar2.getClass();
                yn ynVar3 = knVar2.f38008a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar3, 8, true).show();
                ynVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                kn knVar3 = this.f41261b;
                knVar3.getClass();
                yn ynVar4 = knVar3.f38008a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar4, 8, true).show();
                ynVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f41261b.f38008a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                yn ynVar5 = this.f41261b.f38008a;
                ynVar5.f43288b5 = null;
                ynVar5.f43302c5 = null;
                return;
            case 6:
                this.f41261b.f38008a.W.H0();
                return;
            case 7:
                this.f41261b.f38008a.W.H0();
                return;
            case 8:
                yn ynVar6 = this.f41261b.f38008a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                ynVar6.presentFragment(themeActivity);
                return;
            default:
                yn ynVar7 = this.f41261b.f38008a;
                ynVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar7, 39, false));
                return;
        }
    }
}
