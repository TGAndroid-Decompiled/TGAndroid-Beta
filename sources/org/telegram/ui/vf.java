package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f42839a;
    public final zn f42840b;

    public vf(zn znVar, int i10) {
        this.f42839a = i10;
        this.f42840b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f42839a) {
            case 0:
                zn znVar = this.f42840b;
                MessageObject messageObject3 = znVar.f44743d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44761ea).k(false).j();
                }
                return true;
            case 1:
                return zn.W(this.f42840b);
            default:
                zn znVar2 = this.f42840b;
                int i10 = znVar2.f44882ob;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f44769f5 != null && i10 == 2 && (messageObject = znVar2.f44866n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
