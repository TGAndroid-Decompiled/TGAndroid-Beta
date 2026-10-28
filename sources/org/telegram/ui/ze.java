package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class ze implements Runnable {
    public final int f46237a;
    public final wn f46238b;
    public final int f46239c;

    public ze(wn wnVar, int i10, int i11) {
        this.f46237a = i11;
        this.f46238b = wnVar;
        this.f46239c = i10;
    }

    @Override
    public final void run() {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject messageObject;
        switch (this.f46237a) {
            case 0:
                this.f46238b.getConnectionsManager().cancelRequest(this.f46239c, true);
                return;
            case 1:
                this.f46238b.j(this.f46239c, 0, false, 0, true, 0);
                return;
            case 2:
                this.f46238b.getConnectionsManager().cancelRequest(this.f46239c, true);
                return;
            case 3:
                wn wnVar = this.f46238b;
                rj rjVar = wnVar.f45339x0;
                if (rjVar != null) {
                    int childCount = rjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = wnVar.f45339x0.getChildAt(i10);
                        if ((childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.equals(wnVar.S3)) {
                            s1Var.i4(this.f46239c, true, true);
                        }
                    }
                }
                wnVar.S3 = null;
                return;
            case 4:
                this.f46238b.getConnectionsManager().cancelRequest(this.f46239c, true);
                return;
            case 5:
                wn.Z(this.f46238b, this.f46239c);
                return;
            case 6:
                this.f46238b.actionBar.setSubtitle(LocaleController.formatPluralString("messages", this.f46239c, new Object[0]));
                return;
            case 7:
                this.f46238b.getConnectionsManager().cancelRequest(this.f46239c, true);
                return;
            case 8:
                wn.p1(this.f46238b, this.f46239c);
                return;
            default:
                wn.L0(this.f46238b, this.f46239c);
                return;
        }
    }
}
