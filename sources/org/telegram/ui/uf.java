package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uf implements View.OnLongClickListener {
    public final int f42575a;
    public final zn f42576b;

    public uf(zn znVar, int i10) {
        this.f42575a = i10;
        this.f42576b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f42575a) {
            case 0:
                zn znVar = this.f42576b;
                MessageObject messageObject3 = znVar.f44778d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.f44796ea).k(false).j();
                }
                return true;
            case 1:
                return zn.W(this.f42576b);
            default:
                zn znVar2 = this.f42576b;
                int i10 = znVar2.f44917ob;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f44804f5 != null && i10 == 2 && (messageObject = znVar2.f44901n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
