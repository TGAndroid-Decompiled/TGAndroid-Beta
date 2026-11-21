package org.telegram.ui;
public final class ul implements Runnable {
    public final int f52591a;
    public final mm f52592b;

    public ul(mm mmVar, int i7) {
        this.f52591a = i7;
        this.f52592b = mmVar;
    }

    @Override
    public final void run() {
        switch (this.f52591a) {
            case 0:
                bn bnVar = this.f52592b.f49937a;
                bnVar.f46224v5 = null;
                bnVar.f46238w5 = null;
                return;
            case 1:
                mm mmVar = this.f52592b;
                mmVar.getClass();
                bn bnVar2 = mmVar.f49937a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar2, 8, true).show();
                bnVar2.getMessagesController().L3();
                return;
            case 2:
                mm mmVar2 = this.f52592b;
                mmVar2.getClass();
                bn bnVar3 = mmVar2.f49937a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar3, 8, true).show();
                bnVar3.getMessagesController().L3();
                return;
            case 3:
                mm mmVar3 = this.f52592b;
                mmVar3.getClass();
                bn bnVar4 = mmVar3.f49937a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar4, 8, true).show();
                bnVar4.getMessagesController().L3();
                return;
            case 4:
                this.f52592b.f49937a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                bn bnVar5 = this.f52592b.f49937a;
                bnVar5.f46224v5 = null;
                bnVar5.f46238w5 = null;
                return;
            case 6:
                this.f52592b.f49937a.f45946a0.i1();
                return;
            case 7:
                this.f52592b.f49937a.f45946a0.i1();
                return;
            case 8:
                bn bnVar6 = this.f52592b.f49937a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                bnVar6.presentFragment(themeActivity);
                return;
            default:
                bn bnVar7 = this.f52592b.f49937a;
                bnVar7.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar7, 39, false));
                return;
        }
    }
}
