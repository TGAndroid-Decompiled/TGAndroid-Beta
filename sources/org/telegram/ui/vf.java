package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f42885a;
    public final zn f42886b;

    public vf(zn znVar, int i10) {
        this.f42885a = i10;
        this.f42886b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f42885a) {
            case 0:
                zn znVar = this.f42886b;
                MessageObject messageObject3 = znVar.f44789d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44807ea).k(false).j();
                }
                return true;
            case 1:
                return zn.W(this.f42886b);
            default:
                zn znVar2 = this.f42886b;
                int i10 = znVar2.f44928ob;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f44815f5 != null && i10 == 2 && (messageObject = znVar2.f44912n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
