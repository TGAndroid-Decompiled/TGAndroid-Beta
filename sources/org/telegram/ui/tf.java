package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tf implements View.OnLongClickListener {
    public final int f40868a;
    public final yn f40869b;

    public tf(yn ynVar, int i10) {
        this.f40868a = i10;
        this.f40869b = ynVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f40868a) {
            case 0:
                yn ynVar = this.f40869b;
                MessageObject messageObject3 = ynVar.f43281b5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43300ca).k(false).j();
                }
                return true;
            case 1:
                return yn.P0(this.f40869b);
            default:
                yn ynVar2 = this.f40869b;
                int i10 = ynVar2.f43411lb;
                if (i10 == 1 && (messageObject2 = ynVar2.f43431n5) != null) {
                    ynVar2.D(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (ynVar2.f43307d5 != null && i10 == 2 && (messageObject = ynVar2.f43405l5) != null) {
                    ynVar2.D(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
