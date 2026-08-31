package org.telegram.ui;
public final class um implements Runnable {
    public final int f41974a;
    public final jn f41975b;

    public um(jn jnVar, int i10) {
        this.f41974a = i10;
        this.f41975b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f41974a) {
            case 0:
                xn xnVar = this.f41975b.f38188a;
                xnVar.f43117a5 = null;
                xnVar.f43131b5 = null;
                return;
            case 1:
                jn jnVar = this.f41975b;
                jnVar.getClass();
                xn xnVar2 = jnVar.f38188a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                jn jnVar2 = this.f41975b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.f38188a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                jn jnVar3 = this.f41975b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.f38188a;
                new fg.n1((org.telegram.ui.ActionBar.p2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f41975b.f38188a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                xn xnVar5 = this.f41975b.f38188a;
                xnVar5.f43117a5 = null;
                xnVar5.f43131b5 = null;
                return;
            case 6:
                this.f41975b.f38188a.V.H0();
                return;
            case 7:
                this.f41975b.f38188a.V.H0();
                return;
            case 8:
                xn xnVar6 = this.f41975b.f38188a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.Q0 = true;
                xnVar6.presentFragment(themeActivity);
                return;
            default:
                xn xnVar7 = this.f41975b.f38188a;
                xnVar7.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar7, 39, false));
                return;
        }
    }
}
