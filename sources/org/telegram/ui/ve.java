package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ve implements Runnable {
    public final int f43460a;
    public final qn f43461b;
    public final int f43462c;

    public ve(qn qnVar, int i9, int i10) {
        this.f43460a = i10;
        this.f43461b = qnVar;
        this.f43462c = i9;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        switch (this.f43460a) {
            case 0:
                this.f43461b.getConnectionsManager().cancelRequest(this.f43462c, true);
                return;
            case 1:
                this.f43461b.j(this.f43462c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f43461b.getConnectionsManager().cancelRequest(this.f43462c, true);
                return;
            case 3:
                qn qnVar = this.f43461b;
                ij ijVar = qnVar.f42077t0;
                if (ijVar != null) {
                    int childCount = ijVar.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = qnVar.f42077t0.getChildAt(i9);
                        if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.equals(qnVar.C3)) {
                            t1Var.g4(this.f43462c, true, true);
                        }
                    }
                }
                qnVar.C3 = null;
                return;
            case 4:
                this.f43461b.getConnectionsManager().cancelRequest(this.f43462c, true);
                return;
            case 5:
                qn.U(this.f43461b, this.f43462c);
                return;
            case 6:
                this.f43461b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f43462c, new Object[0]));
                return;
            case 7:
                this.f43461b.getConnectionsManager().cancelRequest(this.f43462c, true);
                return;
            case 8:
                qn.d0(this.f43461b, this.f43462c);
                return;
            default:
                qn.e1(this.f43461b, this.f43462c);
                return;
        }
    }
}
