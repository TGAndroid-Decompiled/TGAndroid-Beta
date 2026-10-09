package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f42841a;
    public final zn f42842b;

    public vf(zn znVar, int i10) {
        this.f42841a = i10;
        this.f42842b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f42841a) {
            case 0:
                zn znVar = this.f42842b;
                MessageObject messageObject3 = znVar.f44745d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44763ea).k(false).j();
                }
                return true;
            case 1:
                return zn.W(this.f42842b);
            default:
                zn znVar2 = this.f42842b;
                int i10 = znVar2.f44884ob;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f44771f5 != null && i10 == 2 && (messageObject = znVar2.f44868n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
