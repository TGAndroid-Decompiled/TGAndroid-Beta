package org.telegram.ui;
public final class tl implements Runnable {
    public final int f51607a;
    public final lm f51608b;

    public tl(lm lmVar, int i7) {
        this.f51607a = i7;
        this.f51608b = lmVar;
    }

    @Override
    public final void run() {
        switch (this.f51607a) {
            case 0:
                an anVar = this.f51608b.f49001a;
                anVar.f45381u5 = null;
                anVar.f45394v5 = null;
                return;
            case 1:
                lm lmVar = this.f51608b;
                lmVar.getClass();
                an anVar2 = lmVar.f49001a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar2, 8, true).show();
                anVar2.getMessagesController().E3();
                return;
            case 2:
                lm lmVar2 = this.f51608b;
                lmVar2.getClass();
                an anVar3 = lmVar2.f49001a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar3, 8, true).show();
                anVar3.getMessagesController().E3();
                return;
            case 3:
                lm lmVar3 = this.f51608b;
                lmVar3.getClass();
                an anVar4 = lmVar3.f49001a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar4, 8, true).show();
                anVar4.getMessagesController().E3();
                return;
            case 4:
                this.f51608b.f49001a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                an anVar5 = this.f51608b.f49001a;
                anVar5.f45381u5 = null;
                anVar5.f45394v5 = null;
                return;
            case 6:
                this.f51608b.f49001a.f45117a0.W0();
                return;
            case 7:
                this.f51608b.f49001a.f45117a0.W0();
                return;
            case 8:
                an anVar6 = this.f51608b.f49001a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                anVar6.presentFragment(themeActivity);
                return;
            default:
                an anVar7 = this.f51608b.f49001a;
                anVar7.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar7, 39, false));
                return;
        }
    }
}
