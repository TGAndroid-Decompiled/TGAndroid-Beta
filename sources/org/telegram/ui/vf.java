package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f38542a;
    public final zn f38543b;

    public vf(zn znVar, int i10) {
        this.f38542a = i10;
        this.f38543b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f38542a) {
            case 0:
                zn znVar = this.f38543b;
                MessageObject messageObject3 = znVar.f40244d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(znVar.getParentActivity()), znVar.f40261ea).k(false).j();
                }
                return true;
            case 1:
                return zn.t0(this.f38543b);
            default:
                zn znVar2 = this.f38543b;
                int i10 = znVar2.nb;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f40269f5 != null && i10 == 2 && (messageObject = znVar2.f40367n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
