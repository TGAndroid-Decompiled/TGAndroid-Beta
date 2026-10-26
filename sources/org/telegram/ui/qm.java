package org.telegram.ui;
public final class qm implements Runnable {
    public final int f42873a;
    public final fn f42874b;

    public qm(fn fnVar, int i10) {
        this.f42873a = i10;
        this.f42874b = fnVar;
    }

    @Override
    public final void run() {
        switch (this.f42873a) {
            case 0:
                un unVar = this.f42874b.f39423a;
                unVar.f44374p5 = null;
                unVar.q5 = null;
                return;
            case 1:
                fn fnVar = this.f42874b;
                fnVar.getClass();
                un unVar2 = fnVar.f39423a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar2, 8, true).show();
                unVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                fn fnVar2 = this.f42874b;
                fnVar2.getClass();
                un unVar3 = fnVar2.f39423a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar3, 8, true).show();
                unVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                fn fnVar3 = this.f42874b;
                fnVar3.getClass();
                un unVar4 = fnVar3.f39423a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar4, 8, true).show();
                unVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f42874b.f39423a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                un unVar5 = this.f42874b.f39423a;
                unVar5.f44374p5 = null;
                unVar5.q5 = null;
                return;
            case 6:
                this.f42874b.f39423a.Y.F0();
                return;
            case 7:
                this.f42874b.f39423a.Y.F0();
                return;
            case 8:
                un unVar6 = this.f42874b.f39423a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                unVar6.presentFragment(themeActivity);
                return;
            default:
                un unVar7 = this.f42874b.f39423a;
                unVar7.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar7, 39, false));
                return;
        }
    }
}
