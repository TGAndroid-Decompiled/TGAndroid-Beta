package org.telegram.ui;
public final class qm implements Runnable {
    public final int f42870a;
    public final fn f42871b;

    public qm(fn fnVar, int i10) {
        this.f42870a = i10;
        this.f42871b = fnVar;
    }

    @Override
    public final void run() {
        switch (this.f42870a) {
            case 0:
                un unVar = this.f42871b.f39420a;
                unVar.f44371p5 = null;
                unVar.q5 = null;
                return;
            case 1:
                fn fnVar = this.f42871b;
                fnVar.getClass();
                un unVar2 = fnVar.f39420a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar2, 8, true).show();
                unVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                fn fnVar2 = this.f42871b;
                fnVar2.getClass();
                un unVar3 = fnVar2.f39420a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar3, 8, true).show();
                unVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                fn fnVar3 = this.f42871b;
                fnVar3.getClass();
                un unVar4 = fnVar3.f39420a;
                new tg.y0((org.telegram.ui.ActionBar.r2) unVar4, 8, true).show();
                unVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f42871b.f39420a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                un unVar5 = this.f42871b.f39420a;
                unVar5.f44371p5 = null;
                unVar5.q5 = null;
                return;
            case 6:
                this.f42871b.f39420a.Y.F0();
                return;
            case 7:
                this.f42871b.f39420a.Y.F0();
                return;
            case 8:
                un unVar6 = this.f42871b.f39420a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                unVar6.presentFragment(themeActivity);
                return;
            default:
                un unVar7 = this.f42871b.f39420a;
                unVar7.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar7, 39, false));
                return;
        }
    }
}
