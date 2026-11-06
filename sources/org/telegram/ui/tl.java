package org.telegram.ui;
public final class tl implements Runnable {
    public final int f50090a;
    public final lm f50091b;

    public tl(lm lmVar, int i7) {
        this.f50090a = i7;
        this.f50091b = lmVar;
    }

    @Override
    public final void run() {
        switch (this.f50090a) {
            case 0:
                an anVar = this.f50091b.f47561a;
                anVar.f43966t5 = null;
                anVar.f43978u5 = null;
                return;
            case 1:
                lm lmVar = this.f50091b;
                lmVar.getClass();
                an anVar2 = lmVar.f47561a;
                new ug.w0((org.telegram.ui.ActionBar.f2) anVar2, 8, true).show();
                anVar2.getMessagesController().E3();
                return;
            case 2:
                lm lmVar2 = this.f50091b;
                lmVar2.getClass();
                an anVar3 = lmVar2.f47561a;
                new ug.w0((org.telegram.ui.ActionBar.f2) anVar3, 8, true).show();
                anVar3.getMessagesController().E3();
                return;
            case 3:
                lm lmVar3 = this.f50091b;
                lmVar3.getClass();
                an anVar4 = lmVar3.f47561a;
                new ug.w0((org.telegram.ui.ActionBar.f2) anVar4, 8, true).show();
                anVar4.getMessagesController().E3();
                return;
            case 4:
                this.f50091b.f47561a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                an anVar5 = this.f50091b.f47561a;
                anVar5.f43966t5 = null;
                anVar5.f43978u5 = null;
                return;
            case 6:
                this.f50091b.f47561a.Z.H0();
                return;
            case 7:
                this.f50091b.f47561a.Z.H0();
                return;
            case 8:
                an anVar6 = this.f50091b.f47561a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                anVar6.presentFragment(themeActivity);
                return;
            default:
                an anVar7 = this.f50091b.f47561a;
                anVar7.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) anVar7, 39, false));
                return;
        }
    }
}
