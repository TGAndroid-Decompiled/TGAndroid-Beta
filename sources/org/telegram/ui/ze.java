package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ze implements Runnable {
    public final int f46268a;
    public final un f46269b;
    public final int f46270c;

    public ze(un unVar, int i10, int i11) {
        this.f46268a = i11;
        this.f46269b = unVar;
        this.f46270c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.f46268a) {
            case 0:
                this.f46269b.getConnectionsManager().cancelRequest(this.f46270c, true);
                return;
            case 1:
                this.f46269b.j(this.f46270c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f46269b.getConnectionsManager().cancelRequest(this.f46270c, true);
                return;
            case 3:
                un unVar = this.f46269b;
                oj ojVar = unVar.f44468x0;
                if (ojVar != null) {
                    int childCount = ojVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = unVar.f44468x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(unVar.S3)) {
                            s1Var.i4(this.f46270c, true, true);
                        }
                    }
                }
                unVar.S3 = null;
                return;
            case 4:
                this.f46269b.getConnectionsManager().cancelRequest(this.f46270c, true);
                return;
            case 5:
                un.Z(this.f46269b, this.f46270c);
                return;
            case 6:
                this.f46269b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f46270c, new Object[0]));
                return;
            case 7:
                this.f46269b.getConnectionsManager().cancelRequest(this.f46270c, true);
                return;
            case 8:
                un.V0(this.f46269b, this.f46270c);
                return;
            default:
                un.Y0(this.f46269b, this.f46270c);
                return;
        }
    }
}
