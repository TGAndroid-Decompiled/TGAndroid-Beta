package org.telegram.ui;
public final class tm implements Runnable {
    public final int f38152a;
    public final in f38153b;

    public tm(in inVar, int i10) {
        this.f38152a = i10;
        this.f38153b = inVar;
    }

    @Override
    public final void run() {
        switch (this.f38152a) {
            case 0:
                wn wnVar = this.f38153b.f34558a;
                wnVar.f39453d5 = null;
                wnVar.f39466e5 = null;
                return;
            case 1:
                in inVar = this.f38153b;
                inVar.getClass();
                wn wnVar2 = inVar.f34558a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar2, 8, true).show();
                wnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                in inVar2 = this.f38153b;
                inVar2.getClass();
                wn wnVar3 = inVar2.f34558a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar3, 8, true).show();
                wnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                in inVar3 = this.f38153b;
                inVar3.getClass();
                wn wnVar4 = inVar3.f34558a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar4, 8, true).show();
                wnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f38153b.f34558a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                wn wnVar5 = this.f38153b.f34558a;
                wnVar5.f39453d5 = null;
                wnVar5.f39466e5 = null;
                return;
            case 6:
                this.f38153b.f34558a.Y.H0();
                return;
            case 7:
                this.f38153b.f34558a.Y.H0();
                return;
            case 8:
                wn wnVar6 = this.f38153b.f34558a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                wnVar6.presentFragment(themeActivity);
                return;
            default:
                wn wnVar7 = this.f38153b.f34558a;
                wnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar7, 39, false));
                return;
        }
    }
}
