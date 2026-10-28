package org.telegram.ui;
public final class sm implements Runnable {
    public final int f43360a;
    public final hn f43361b;

    public sm(hn hnVar, int i10) {
        this.f43360a = i10;
        this.f43361b = hnVar;
    }

    @Override
    public final void run() {
        switch (this.f43360a) {
            case 0:
                wn wnVar = this.f43361b.f39938a;
                wnVar.f45291t5 = null;
                wnVar.f45304u5 = null;
                return;
            case 1:
                hn hnVar = this.f43361b;
                hnVar.getClass();
                wn wnVar2 = hnVar.f39938a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar2, 8, true).show();
                wnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                hn hnVar2 = this.f43361b;
                hnVar2.getClass();
                wn wnVar3 = hnVar2.f39938a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar3, 8, true).show();
                wnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                hn hnVar3 = this.f43361b;
                hnVar3.getClass();
                wn wnVar4 = hnVar3.f39938a;
                new tg.y0((org.telegram.ui.ActionBar.r2) wnVar4, 8, true).show();
                wnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f43361b.f39938a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                wn wnVar5 = this.f43361b.f39938a;
                wnVar5.f45291t5 = null;
                wnVar5.f45304u5 = null;
                return;
            case 6:
                this.f43361b.f39938a.Y.E0();
                return;
            case 7:
                this.f43361b.f39938a.Y.E0();
                return;
            case 8:
                wn wnVar6 = this.f43361b.f39938a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                wnVar6.presentFragment(themeActivity);
                return;
            default:
                wn wnVar7 = this.f43361b.f39938a;
                wnVar7.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar7, 39, false));
                return;
        }
    }
}
