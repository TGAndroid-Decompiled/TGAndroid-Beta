package org.telegram.ui;
public final class vl implements Runnable {
    public final int f50714a;
    public final nm f50715b;

    public vl(nm nmVar, int i7) {
        this.f50714a = i7;
        this.f50715b = nmVar;
    }

    @Override
    public final void run() {
        switch (this.f50714a) {
            case 0:
                cn cnVar = this.f50715b.f48207a;
                cnVar.f44628t5 = null;
                cnVar.f44640u5 = null;
                return;
            case 1:
                nm nmVar = this.f50715b;
                nmVar.getClass();
                cn cnVar2 = nmVar.f48207a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar2, 8, true).show();
                cnVar2.getMessagesController().E3();
                return;
            case 2:
                nm nmVar2 = this.f50715b;
                nmVar2.getClass();
                cn cnVar3 = nmVar2.f48207a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar3, 8, true).show();
                cnVar3.getMessagesController().E3();
                return;
            case 3:
                nm nmVar3 = this.f50715b;
                nmVar3.getClass();
                cn cnVar4 = nmVar3.f48207a;
                new ug.w0((org.telegram.ui.ActionBar.f2) cnVar4, 8, true).show();
                cnVar4.getMessagesController().E3();
                return;
            case 4:
                this.f50715b.f48207a.presentFragment(new PremiumPreviewFragment(0, "similar_channels"));
                return;
            case 5:
                cn cnVar5 = this.f50715b.f48207a;
                cnVar5.f44628t5 = null;
                cnVar5.f44640u5 = null;
                return;
            case 6:
                this.f50715b.f48207a.Z.H0();
                return;
            case 7:
                this.f50715b.f48207a.Z.H0();
                return;
            case 8:
                cn cnVar6 = this.f50715b.f48207a;
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.T0 = true;
                cnVar6.presentFragment(themeActivity);
                return;
            default:
                cn cnVar7 = this.f50715b.f48207a;
                cnVar7.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) cnVar7, 39, false));
                return;
        }
    }
}
