package org.telegram.ui;
public final class ul implements Runnable {
    public final int f52682a;
    public final mm f52683b;

    public ul(mm mmVar, int i7) {
        this.f52682a = i7;
        this.f52683b = mmVar;
    }

    @Override
    public final void run() {
        switch (this.f52682a) {
            case 0:
                bn bnVar = this.f52683b.f50079a;
                bnVar.f46396v5 = null;
                bnVar.f46410w5 = null;
                return;
            case 1:
                mm mmVar = this.f52683b;
                mmVar.getClass();
                bn bnVar2 = mmVar.f50079a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar2, 8, true).show();
                bnVar2.getMessagesController().L3();
                return;
            case 2:
                mm mmVar2 = this.f52683b;
                mmVar2.getClass();
                bn bnVar3 = mmVar2.f50079a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar3, 8, true).show();
                bnVar3.getMessagesController().L3();
                return;
            case 3:
                mm mmVar3 = this.f52683b;
                mmVar3.getClass();
                bn bnVar4 = mmVar3.f50079a;
                new ug.y0((org.telegram.ui.ActionBar.g2) bnVar4, 8, true).show();
                bnVar4.getMessagesController().L3();
                return;
            case 4:
                this.f52683b.f50079a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                bn bnVar5 = this.f52683b.f50079a;
                bnVar5.f46396v5 = null;
                bnVar5.f46410w5 = null;
                return;
            case 6:
                this.f52683b.f50079a.f46118a0.j1();
                return;
            case 7:
                this.f52683b.f50079a.f46118a0.j1();
                return;
            case 8:
                bn bnVar6 = this.f52683b.f50079a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.V0 = true;
                bnVar6.presentFragment(themeActivity);
                return;
            default:
                bn bnVar7 = this.f52683b.f50079a;
                bnVar7.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) bnVar7, 39, false));
                return;
        }
    }
}
