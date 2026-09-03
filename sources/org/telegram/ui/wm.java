package org.telegram.ui;
public final class wm implements Runnable {
    public final int f39733a;
    public final ln f39734b;

    public wm(ln lnVar, int i10) {
        this.f39733a = i10;
        this.f39734b = lnVar;
    }

    @Override
    public final void run() {
        switch (this.f39733a) {
            case 0:
                zn znVar = this.f39734b.f35808a;
                znVar.f40515a5 = null;
                znVar.f40529b5 = null;
                return;
            case 1:
                ln lnVar = this.f39734b;
                lnVar.getClass();
                zn znVar2 = lnVar.f35808a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar2, 8, true).show();
                znVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                ln lnVar2 = this.f39734b;
                lnVar2.getClass();
                zn znVar3 = lnVar2.f35808a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar3, 8, true).show();
                znVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                ln lnVar3 = this.f39734b;
                lnVar3.getClass();
                zn znVar4 = lnVar3.f35808a;
                new eg.o1((org.telegram.ui.ActionBar.p2) znVar4, 8, true).show();
                znVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39734b.f35808a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                zn znVar5 = this.f39734b.f35808a;
                znVar5.f40515a5 = null;
                znVar5.f40529b5 = null;
                return;
            case 6:
                this.f39734b.f35808a.V.H0();
                return;
            case 7:
                this.f39734b.f35808a.V.H0();
                return;
            case 8:
                zn znVar6 = this.f39734b.f35808a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                znVar6.presentFragment(themeActivity);
                return;
            default:
                zn znVar7 = this.f39734b.f35808a;
                znVar7.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar7, 39, false));
                return;
        }
    }
}
