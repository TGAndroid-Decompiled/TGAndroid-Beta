package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f38557a;
    public final zn f38558b;

    public vf(zn znVar, int i10) {
        this.f38557a = i10;
        this.f38558b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f38557a) {
            case 0:
                zn znVar = this.f38558b;
                MessageObject messageObject3 = znVar.f40307d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(znVar.getParentActivity()), znVar.f40324ea).k(false).j();
                }
                return true;
            case 1:
                return zn.t0(this.f38558b);
            default:
                zn znVar2 = this.f38558b;
                int i10 = znVar2.nb;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.E(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f40332f5 != null && i10 == 2 && (messageObject = znVar2.f40430n5) != null) {
                    znVar2.E(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
