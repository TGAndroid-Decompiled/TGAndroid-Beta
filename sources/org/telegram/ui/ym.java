package org.telegram.ui;
public final class ym implements Runnable {
    public final int f39934a;
    public final nn f39935b;

    public ym(nn nnVar, int i10) {
        this.f39934a = i10;
        this.f39935b = nnVar;
    }

    @Override
    public final void run() {
        switch (this.f39934a) {
            case 0:
                bo boVar = this.f39935b.f36134a;
                boVar.f32258d5 = null;
                boVar.f32271e5 = null;
                return;
            case 1:
                nn nnVar = this.f39935b;
                nnVar.getClass();
                bo boVar2 = nnVar.f36134a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar2, 8, true).show();
                boVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                nn nnVar2 = this.f39935b;
                nnVar2.getClass();
                bo boVar3 = nnVar2.f36134a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar3, 8, true).show();
                boVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                nn nnVar3 = this.f39935b;
                nnVar3.getClass();
                bo boVar4 = nnVar3.f36134a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar4, 8, true).show();
                boVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39935b.f36134a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                bo boVar5 = this.f39935b.f36134a;
                boVar5.f32258d5 = null;
                boVar5.f32271e5 = null;
                return;
            case 6:
                this.f39935b.f36134a.Y.H0();
                return;
            case 7:
                this.f39935b.f36134a.Y.H0();
                return;
            case 8:
                bo boVar6 = this.f39935b.f36134a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                boVar6.presentFragment(themeActivity);
                return;
            default:
                bo boVar7 = this.f39935b.f36134a;
                boVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar7, 39, false));
                return;
        }
    }
}
