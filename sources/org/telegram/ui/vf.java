package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f38536a;
    public final zn f38537b;

    public vf(zn znVar, int i10) {
        this.f38536a = i10;
        this.f38537b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f38536a) {
            case 0:
                zn znVar = this.f38537b;
                MessageObject messageObject3 = znVar.f40286d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(znVar.getParentActivity()), znVar.f40303ea).k(false).j();
                }
                return true;
            case 1:
                return zn.t0(this.f38537b);
            default:
                zn znVar2 = this.f38537b;
                int i10 = znVar2.nb;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f40311f5 != null && i10 == 2 && (messageObject = znVar2.f40409n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
