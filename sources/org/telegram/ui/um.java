package org.telegram.ui;
public final class um implements Runnable {
    public final int f41252a;
    public final kn f41253b;

    public um(kn knVar, int i10) {
        this.f41252a = i10;
        this.f41253b = knVar;
    }

    @Override
    public final void run() {
        switch (this.f41252a) {
            case 0:
                yn ynVar = this.f41253b.f38002a;
                ynVar.f43280b5 = null;
                ynVar.f43294c5 = null;
                return;
            case 1:
                kn knVar = this.f41253b;
                knVar.getClass();
                yn ynVar2 = knVar.f38002a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar2, 8, true).show();
                ynVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                kn knVar2 = this.f41253b;
                knVar2.getClass();
                yn ynVar3 = knVar2.f38002a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar3, 8, true).show();
                ynVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                kn knVar3 = this.f41253b;
                knVar3.getClass();
                yn ynVar4 = knVar3.f38002a;
                new rg.y0((org.telegram.ui.ActionBar.n2) ynVar4, 8, true).show();
                ynVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f41253b.f38002a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                yn ynVar5 = this.f41253b.f38002a;
                ynVar5.f43280b5 = null;
                ynVar5.f43294c5 = null;
                return;
            case 6:
                this.f41253b.f38002a.W.H0();
                return;
            case 7:
                this.f41253b.f38002a.W.H0();
                return;
            case 8:
                yn ynVar6 = this.f41253b.f38002a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                ynVar6.presentFragment(themeActivity);
                return;
            default:
                yn ynVar7 = this.f41253b.f38002a;
                ynVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar7, 39, false));
                return;
        }
    }
}
