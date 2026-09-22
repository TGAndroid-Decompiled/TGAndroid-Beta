package org.telegram.ui;
public final class ym implements Runnable {
    public final int f39908a;
    public final nn f39909b;

    public ym(nn nnVar, int i10) {
        this.f39908a = i10;
        this.f39909b = nnVar;
    }

    @Override
    public final void run() {
        switch (this.f39908a) {
            case 0:
                bo boVar = this.f39909b.f36017a;
                boVar.f32276d5 = null;
                boVar.f32289e5 = null;
                return;
            case 1:
                nn nnVar = this.f39909b;
                nnVar.getClass();
                bo boVar2 = nnVar.f36017a;
                new rg.x0((org.telegram.ui.ActionBar.n2) boVar2, 8, true).show();
                boVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                nn nnVar2 = this.f39909b;
                nnVar2.getClass();
                bo boVar3 = nnVar2.f36017a;
                new rg.x0((org.telegram.ui.ActionBar.n2) boVar3, 8, true).show();
                boVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                nn nnVar3 = this.f39909b;
                nnVar3.getClass();
                bo boVar4 = nnVar3.f36017a;
                new rg.x0((org.telegram.ui.ActionBar.n2) boVar4, 8, true).show();
                boVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f39909b.f36017a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                bo boVar5 = this.f39909b.f36017a;
                boVar5.f32276d5 = null;
                boVar5.f32289e5 = null;
                return;
            case 6:
                this.f39909b.f36017a.Y.I0();
                return;
            case 7:
                this.f39909b.f36017a.Y.I0();
                return;
            case 8:
                bo boVar6 = this.f39909b.f36017a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                boVar6.presentFragment(themeActivity);
                return;
            default:
                bo boVar7 = this.f39909b.f36017a;
                boVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar7, 39, false));
                return;
        }
    }
}
