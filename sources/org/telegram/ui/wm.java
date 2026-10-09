package org.telegram.ui;
public final class wm implements Runnable {
    public final int f43713a;
    public final ln f43714b;

    public wm(ln lnVar, int i10) {
        this.f43713a = i10;
        this.f43714b = lnVar;
    }

    @Override
    public final void run() {
        switch (this.f43713a) {
            case 0:
                zn znVar = this.f43714b.f39636a;
                znVar.f44745d5 = null;
                znVar.f44759e5 = null;
                return;
            case 1:
                ln lnVar = this.f43714b;
                lnVar.getClass();
                zn znVar2 = lnVar.f39636a;
                new rg.y0((org.telegram.ui.ActionBar.n2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                ln lnVar2 = this.f43714b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.f39636a;
                new rg.y0((org.telegram.ui.ActionBar.n2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                ln lnVar3 = this.f43714b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.f39636a;
                new rg.y0((org.telegram.ui.ActionBar.n2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f43714b.f39636a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                zn znVar5 = this.f43714b.f39636a;
                znVar5.f44745d5 = null;
                znVar5.f44759e5 = null;
                return;
            case 6:
                this.f43714b.f39636a.Y.F0();
                return;
            case 7:
                this.f43714b.f39636a.Y.F0();
                return;
            case 8:
                zn znVar6 = this.f43714b.f39636a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                znVar6.presentFragment(themeActivity);
                return;
            default:
                zn znVar7 = this.f43714b.f39636a;
                znVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) znVar7, 39, false));
                return;
        }
    }
}
