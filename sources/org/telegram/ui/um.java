package org.telegram.ui;
public final class um implements Runnable {
    public final int f38974a;
    public final jn f38975b;

    public um(jn jnVar, int i10) {
        this.f38974a = i10;
        this.f38975b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f38974a) {
            case 0:
                xn xnVar = this.f38975b.f35381a;
                xnVar.f39949a5 = null;
                xnVar.f39963b5 = null;
                return;
            case 1:
                jn jnVar = this.f38975b;
                jnVar.getClass();
                xn xnVar2 = jnVar.f35381a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                jn jnVar2 = this.f38975b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.f35381a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                jn jnVar3 = this.f38975b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.f35381a;
                new eg.o1((org.telegram.ui.ActionBar.p2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f38975b.f35381a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                xn xnVar5 = this.f38975b.f35381a;
                xnVar5.f39949a5 = null;
                xnVar5.f39963b5 = null;
                return;
            case 6:
                this.f38975b.f35381a.V.H0();
                return;
            case 7:
                this.f38975b.f35381a.V.H0();
                return;
            case 8:
                xn xnVar6 = this.f38975b.f35381a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                xnVar6.presentFragment(themeActivity);
                return;
            default:
                xn xnVar7 = this.f38975b.f35381a;
                xnVar7.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) xnVar7, 39, false));
                return;
        }
    }
}
