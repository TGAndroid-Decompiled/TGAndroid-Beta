package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

public final class ve implements Runnable {

    public final int f43434a;

    public final rn f43435b;

    public final int f43436c;

    public ve(rn rnVar, int i10, int i11) {
        this.f43434a = i11;
        this.f43435b = rnVar;
        this.f43436c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.f43434a) {
            case 0:
                this.f43435b.getConnectionsManager().cancelRequest(this.f43436c, true);
                break;
            case 1:
                this.f43435b.j(this.f43436c, 0, false, 0, true, 0);
                break;
            case 2:
                this.f43435b.getConnectionsManager().cancelRequest(this.f43436c, true);
                break;
            case 3:
                rn rnVar = this.f43435b;
                kj kjVar = rnVar.f42213t0;
                if (kjVar != null) {
                    int childCount = kjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = rnVar.f42213t0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(rnVar.C3)) {
                            s1Var.f4(this.f43436c, true, true);
                        }
                    }
                }
                rnVar.C3 = null;
                break;
            case 4:
                this.f43435b.getConnectionsManager().cancelRequest(this.f43436c, true);
                break;
            case 5:
                rn.V(this.f43435b, this.f43436c);
                break;
            case 6:
                this.f43435b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f43436c, new Object[0]));
                break;
            case 7:
                this.f43435b.getConnectionsManager().cancelRequest(this.f43436c, true);
                break;
            case 8:
                rn.e0(this.f43435b, this.f43436c);
                break;
            default:
                rn.e1(this.f43435b, this.f43436c);
                break;
        }
    }
}
