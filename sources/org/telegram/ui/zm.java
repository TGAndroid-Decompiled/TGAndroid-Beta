package org.telegram.ui;
public final class zm implements Runnable {
    public final int f43490a;
    public final on f43491b;

    public zm(on onVar, int i10) {
        this.f43490a = i10;
        this.f43491b = onVar;
    }

    @Override
    public final void run() {
        switch (this.f43490a) {
            case 0:
                co coVar = this.f43491b.f39311a;
                coVar.f35257d5 = null;
                coVar.f35271e5 = null;
                return;
            case 1:
                on onVar = this.f43491b;
                onVar.getClass();
                co coVar2 = onVar.f39311a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar2, 8, true).show();
                coVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                on onVar2 = this.f43491b;
                onVar2.getClass();
                co coVar3 = onVar2.f39311a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar3, 8, true).show();
                coVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                on onVar3 = this.f43491b;
                onVar3.getClass();
                co coVar4 = onVar3.f39311a;
                new sg.a1((org.telegram.ui.ActionBar.n2) coVar4, 8, true).show();
                coVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f43491b.f39311a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                co coVar5 = this.f43491b.f39311a;
                coVar5.f35257d5 = null;
                coVar5.f35271e5 = null;
                return;
            case 6:
                this.f43491b.f39311a.Y.H0();
                return;
            case 7:
                this.f43491b.f39311a.Y.H0();
                return;
            case 8:
                co coVar6 = this.f43491b.f39311a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                coVar6.presentFragment(themeActivity);
                return;
            default:
                co coVar7 = this.f43491b.f39311a;
                coVar7.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar7, 39, false));
                return;
        }
    }
}
