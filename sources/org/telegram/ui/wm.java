package org.telegram.ui;
public final class wm implements Runnable {
    public final int f39203a;
    public final ln f39204b;

    public wm(ln lnVar, int i10) {
        this.f39203a = i10;
        this.f39204b = lnVar;
    }

    @Override
    public final void run() {
        switch (this.f39203a) {
            case 0:
                zn znVar = this.f39204b.f35505a;
                znVar.f40307d5 = null;
                znVar.f40320e5 = null;
                return;
            case 1:
                ln lnVar = this.f39204b;
                lnVar.getClass();
                zn znVar2 = lnVar.f35505a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                ln lnVar2 = this.f39204b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.f35505a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                ln lnVar3 = this.f39204b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.f35505a;
                new rg.x0((org.telegram.ui.ActionBar.n2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39204b.f35505a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                zn znVar5 = this.f39204b.f35505a;
                znVar5.f40307d5 = null;
                znVar5.f40320e5 = null;
                return;
            case 6:
                this.f39204b.f35505a.Y.H0();
                return;
            case 7:
                this.f39204b.f35505a.Y.H0();
                return;
            case 8:
                zn znVar6 = this.f39204b.f35505a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                znVar6.presentFragment(themeActivity);
                return;
            default:
                zn znVar7 = this.f39204b.f35505a;
                znVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) znVar7, 39, false));
                return;
        }
    }
}
