package org.telegram.ui;
public final class tm implements Runnable {
    public final int f38261a;
    public final in f38262b;

    public tm(in inVar, int i10) {
        this.f38261a = i10;
        this.f38262b = inVar;
    }

    @Override
    public final void run() {
        switch (this.f38261a) {
            case 0:
                wn wnVar = this.f38262b.f34642a;
                wnVar.f39545d5 = null;
                wnVar.f39558e5 = null;
                return;
            case 1:
                in inVar = this.f38262b;
                inVar.getClass();
                wn wnVar2 = inVar.f34642a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar2, 8, true).show();
                wnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                in inVar2 = this.f38262b;
                inVar2.getClass();
                wn wnVar3 = inVar2.f34642a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar3, 8, true).show();
                wnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                in inVar3 = this.f38262b;
                inVar3.getClass();
                wn wnVar4 = inVar3.f34642a;
                new rg.x0((org.telegram.ui.ActionBar.m2) wnVar4, 8, true).show();
                wnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f38262b.f34642a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                wn wnVar5 = this.f38262b.f34642a;
                wnVar5.f39545d5 = null;
                wnVar5.f39558e5 = null;
                return;
            case 6:
                this.f38262b.f34642a.Y.H0();
                return;
            case 7:
                this.f38262b.f34642a.Y.H0();
                return;
            case 8:
                wn wnVar6 = this.f38262b.f34642a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                wnVar6.presentFragment(themeActivity);
                return;
            default:
                wn wnVar7 = this.f38262b.f34642a;
                wnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar7, 39, false));
                return;
        }
    }
}
