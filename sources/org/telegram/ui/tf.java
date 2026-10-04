package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tf implements View.OnLongClickListener {
    public final int f40807a;
    public final yn f40808b;

    public tf(yn ynVar, int i10) {
        this.f40807a = i10;
        this.f40808b = ynVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f40807a) {
            case 0:
                yn ynVar = this.f40808b;
                MessageObject messageObject3 = ynVar.f43280b5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43299ca).k(false).j();
                }
                return true;
            case 1:
                return yn.P0(this.f40808b);
            default:
                yn ynVar2 = this.f40808b;
                int i10 = ynVar2.f43410lb;
                if (i10 == 1 && (messageObject2 = ynVar2.f43430n5) != null) {
                    ynVar2.D(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (ynVar2.f43306d5 != null && i10 == 2 && (messageObject = ynVar2.f43404l5) != null) {
                    ynVar2.D(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
