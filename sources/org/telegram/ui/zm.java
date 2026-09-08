package org.telegram.ui;
public final class zm implements Runnable {
    public final int f43489a;
    public final on f43490b;

    public zm(on onVar, int i10) {
        this.f43489a = i10;
        this.f43490b = onVar;
    }

    @Override
    public final void run() {
        switch (this.f43489a) {
            case 0:
                co coVar = this.f43490b.f39310a;
                coVar.f35256d5 = null;
                coVar.f35270e5 = null;
                return;
            case 1:
                on onVar = this.f43490b;
                onVar.getClass();
                co coVar2 = onVar.f39310a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar2, 8, true).show();
                coVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                on onVar2 = this.f43490b;
                onVar2.getClass();
                co coVar3 = onVar2.f39310a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar3, 8, true).show();
                coVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                on onVar3 = this.f43490b;
                onVar3.getClass();
                co coVar4 = onVar3.f39310a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar4, 8, true).show();
                coVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f43490b.f39310a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                co coVar5 = this.f43490b.f39310a;
                coVar5.f35256d5 = null;
                coVar5.f35270e5 = null;
                return;
            case 6:
                this.f43490b.f39310a.Y.H0();
                return;
            case 7:
                this.f43490b.f39310a.Y.H0();
                return;
            case 8:
                co coVar6 = this.f43490b.f39310a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                coVar6.presentFragment(themeActivity);
                return;
            default:
                co coVar7 = this.f43490b.f39310a;
                coVar7.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar7, 39, false));
                return;
        }
    }
}
