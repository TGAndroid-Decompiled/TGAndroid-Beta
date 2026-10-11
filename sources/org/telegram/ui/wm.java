package org.telegram.ui;
public final class wm implements Runnable {
    public final int f43827a;
    public final ln f43828b;

    public wm(ln lnVar, int i10) {
        this.f43827a = i10;
        this.f43828b = lnVar;
    }

    @Override
    public final void run() {
        switch (this.f43827a) {
            case 0:
                zn znVar = this.f43828b.f39701a;
                znVar.f44744d5 = null;
                znVar.f44758e5 = null;
                return;
            case 1:
                ln lnVar = this.f43828b;
                lnVar.getClass();
                zn znVar2 = lnVar.f39701a;
                new rg.y0((org.telegram.ui.ActionBar.m2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                ln lnVar2 = this.f43828b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.f39701a;
                new rg.y0((org.telegram.ui.ActionBar.m2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                ln lnVar3 = this.f43828b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.f39701a;
                new rg.y0((org.telegram.ui.ActionBar.m2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f43828b.f39701a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                zn znVar5 = this.f43828b.f39701a;
                znVar5.f44744d5 = null;
                znVar5.f44758e5 = null;
                return;
            case 6:
                this.f43828b.f39701a.Y.F0();
                return;
            case 7:
                this.f43828b.f39701a.Y.F0();
                return;
            case 8:
                zn znVar6 = this.f43828b.f39701a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                znVar6.presentFragment(themeActivity);
                return;
            default:
                zn znVar7 = this.f43828b.f39701a;
                znVar7.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) znVar7, 39, false));
                return;
        }
    }
}
