package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tf implements View.OnLongClickListener {
    public final int f40814a;
    public final yn f40815b;

    public tf(yn ynVar, int i10) {
        this.f40814a = i10;
        this.f40815b = ynVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f40814a) {
            case 0:
                yn ynVar = this.f40815b;
                MessageObject messageObject3 = ynVar.f43288b5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43307ca).k(false).j();
                }
                return true;
            case 1:
                return yn.P0(this.f40815b);
            default:
                yn ynVar2 = this.f40815b;
                int i10 = ynVar2.f43418lb;
                if (i10 == 1 && (messageObject2 = ynVar2.f43438n5) != null) {
                    ynVar2.D(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (ynVar2.f43314d5 != null && i10 == 2 && (messageObject = ynVar2.f43412l5) != null) {
                    ynVar2.D(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
