package org.telegram.ui;
public final class um implements Runnable {
    public final int f38131a;
    public final jn f38132b;

    public um(jn jnVar, int i10) {
        this.f38131a = i10;
        this.f38132b = jnVar;
    }

    @Override
    public final void run() {
        switch (this.f38131a) {
            case 0:
                xn xnVar = this.f38132b.f34487a;
                xnVar.f39353d5 = null;
                xnVar.f39366e5 = null;
                return;
            case 1:
                jn jnVar = this.f38132b;
                jnVar.getClass();
                xn xnVar2 = jnVar.f34487a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar2, 8, true).show();
                xnVar2.getMessagesController().pressTranscribeButton();
                return;
            case 2:
                jn jnVar2 = this.f38132b;
                jnVar2.getClass();
                xn xnVar3 = jnVar2.f34487a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar3, 8, true).show();
                xnVar3.getMessagesController().pressTranscribeButton();
                return;
            case 3:
                jn jnVar3 = this.f38132b;
                jnVar3.getClass();
                xn xnVar4 = jnVar3.f34487a;
                new rg.x0((org.telegram.ui.ActionBar.n2) xnVar4, 8, true).show();
                xnVar4.getMessagesController().pressTranscribeButton();
                return;
            case 4:
                this.f38132b.f34487a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                xn xnVar5 = this.f38132b.f34487a;
                xnVar5.f39353d5 = null;
                xnVar5.f39366e5 = null;
                return;
            case 6:
                this.f38132b.f34487a.Y.I0();
                return;
            case 7:
                this.f38132b.f34487a.Y.I0();
                return;
            case 8:
                xn xnVar6 = this.f38132b.f34487a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                xnVar6.presentFragment(themeActivity);
                return;
            default:
                xn xnVar7 = this.f38132b.f34487a;
                xnVar7.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar7, 39, false));
                return;
        }
    }
}
