package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class te implements Runnable {
    public final int f42671a;
    public final tn f42672b;
    public final int f42673c;

    public te(tn tnVar, int i10, int i11) {
        this.f42671a = i11;
        this.f42672b = tnVar;
        this.f42673c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.f42671a) {
            case 0:
                this.f42672b.getConnectionsManager().cancelRequest(this.f42673c, true);
                return;
            case 1:
                this.f42672b.j(this.f42673c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f42672b.getConnectionsManager().cancelRequest(this.f42673c, true);
                return;
            case 3:
                tn tnVar = this.f42672b;
                lj ljVar = tnVar.f42973t0;
                if (ljVar != null) {
                    int childCount = ljVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = tnVar.f42973t0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(tnVar.C3)) {
                            s1Var.g4(this.f42673c, true, true);
                        }
                    }
                }
                tnVar.C3 = null;
                return;
            case 4:
                this.f42672b.getConnectionsManager().cancelRequest(this.f42673c, true);
                return;
            case 5:
                tn.V(this.f42672b, this.f42673c);
                return;
            case 6:
                this.f42672b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f42673c, new Object[0]));
                return;
            case 7:
                this.f42672b.getConnectionsManager().cancelRequest(this.f42673c, true);
                return;
            case 8:
                tn.e0(this.f42672b, this.f42673c);
                return;
            default:
                tn.e1(this.f42672b, this.f42673c);
                return;
        }
    }
}
