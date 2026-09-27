package org.telegram.ui;
public final class um implements Runnable {
    public final int f38278a;
    public final jn f38279b;

    public um(jn jnVar, int i10) {
        this.f38278a = i10;
        this.f38279b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f38278a) {
            case 0:
                xn xnVar = this.f38279b.f34766a;
                xnVar.f39733d5 = null;
                xnVar.f39746e5 = null;
                return;
            case 1:
                jn jnVar = this.f38279b;
                jnVar.getClass();
                xn xnVar2 = jnVar.f34766a;
                new rg.x0((org.telegram.ui.ActionBar.o2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                jn jnVar2 = this.f38279b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.f34766a;
                new rg.x0((org.telegram.ui.ActionBar.o2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                jn jnVar3 = this.f38279b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.f34766a;
                new rg.x0((org.telegram.ui.ActionBar.o2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f38279b.f34766a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                xn xnVar5 = this.f38279b.f34766a;
                xnVar5.f39733d5 = null;
                xnVar5.f39746e5 = null;
                return;
            case 6:
                this.f38279b.f34766a.Y.H0();
                return;
            case 7:
                this.f38279b.f34766a.Y.H0();
                return;
            case 8:
                xn xnVar6 = this.f38279b.f34766a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                xnVar6.presentFragment(themeActivity);
                return;
            default:
                xn xnVar7 = this.f38279b.f34766a;
                xnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) xnVar7, 39, false));
                return;
        }
    }
}
