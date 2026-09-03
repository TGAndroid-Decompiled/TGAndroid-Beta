package org.telegram.ui;
public final class um implements Runnable {
    public final int f41874a;
    public final jn f41875b;

    public um(jn jnVar, int i10) {
        this.f41874a = i10;
        this.f41875b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f41874a) {
            case 0:
                xn xnVar = this.f41875b.f38085a;
                xnVar.f43095a5 = null;
                xnVar.f43109b5 = null;
                return;
            case 1:
                jn jnVar = this.f41875b;
                jnVar.getClass();
                xn xnVar2 = jnVar.f38085a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                jn jnVar2 = this.f41875b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.f38085a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                jn jnVar3 = this.f41875b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.f38085a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f41875b.f38085a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                xn xnVar5 = this.f41875b.f38085a;
                xnVar5.f43095a5 = null;
                xnVar5.f43109b5 = null;
                return;
            case 6:
                this.f41875b.f38085a.V.H0();
                return;
            case 7:
                this.f41875b.f38085a.V.H0();
                return;
            case 8:
                xn xnVar6 = this.f41875b.f38085a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                xnVar6.presentFragment(themeActivity);
                return;
            default:
                xn xnVar7 = this.f41875b.f38085a;
                xnVar7.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar7, 39, false));
                return;
        }
    }
}
