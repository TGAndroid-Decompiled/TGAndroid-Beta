package org.telegram.ui;
public final class tl implements Runnable {
    public final int f51606a;
    public final lm f51607b;

    public tl(lm lmVar, int i7) {
        this.f51606a = i7;
        this.f51607b = lmVar;
    }

    @Override
    public final void run() {
        switch (this.f51606a) {
            case 0:
                an anVar = this.f51607b.f49005a;
                anVar.f45382u5 = null;
                anVar.f45395v5 = null;
                return;
            case 1:
                lm lmVar = this.f51607b;
                lmVar.getClass();
                an anVar2 = lmVar.f49005a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar2, 8, true).show();
                anVar2.getMessagesController().E3();
                return;
            case 2:
                lm lmVar2 = this.f51607b;
                lmVar2.getClass();
                an anVar3 = lmVar2.f49005a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar3, 8, true).show();
                anVar3.getMessagesController().E3();
                return;
            case 3:
                lm lmVar3 = this.f51607b;
                lmVar3.getClass();
                an anVar4 = lmVar3.f49005a;
                new ug.x0((org.telegram.ui.ActionBar.e2) anVar4, 8, true).show();
                anVar4.getMessagesController().E3();
                return;
            case 4:
                this.f51607b.f49005a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                an anVar5 = this.f51607b.f49005a;
                anVar5.f45382u5 = null;
                anVar5.f45395v5 = null;
                return;
            case 6:
                this.f51607b.f49005a.f45118a0.W0();
                return;
            case 7:
                this.f51607b.f49005a.f45118a0.W0();
                return;
            case 8:
                an anVar6 = this.f51607b.f49005a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                anVar6.presentFragment(themeActivity);
                return;
            default:
                an anVar7 = this.f51607b.f49005a;
                anVar7.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) anVar7, 39, false));
                return;
        }
    }
}
