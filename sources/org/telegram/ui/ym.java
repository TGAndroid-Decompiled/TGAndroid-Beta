package org.telegram.ui;
public final class ym implements Runnable {
    public final int f39939a;
    public final nn f39940b;

    public ym(nn nnVar, int i10) {
        this.f39939a = i10;
        this.f39940b = nnVar;
    }

    @Override
    public final void run() {
        switch (this.f39939a) {
            case 0:
                bo boVar = this.f39940b.f36139a;
                boVar.f32262d5 = null;
                boVar.f32275e5 = null;
                return;
            case 1:
                nn nnVar = this.f39940b;
                nnVar.getClass();
                bo boVar2 = nnVar.f36139a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar2, 8, true).show();
                boVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                nn nnVar2 = this.f39940b;
                nnVar2.getClass();
                bo boVar3 = nnVar2.f36139a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar3, 8, true).show();
                boVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                nn nnVar3 = this.f39940b;
                nnVar3.getClass();
                bo boVar4 = nnVar3.f36139a;
                new rg.x0((org.telegram.ui.ActionBar.o2) boVar4, 8, true).show();
                boVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39940b.f36139a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                bo boVar5 = this.f39940b.f36139a;
                boVar5.f32262d5 = null;
                boVar5.f32275e5 = null;
                return;
            case 6:
                this.f39940b.f36139a.Y.I0();
                return;
            case 7:
                this.f39940b.f36139a.Y.I0();
                return;
            case 8:
                bo boVar6 = this.f39940b.f36139a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                boVar6.presentFragment(themeActivity);
                return;
            default:
                bo boVar7 = this.f39940b.f36139a;
                boVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) boVar7, 39, false));
                return;
        }
    }
}
