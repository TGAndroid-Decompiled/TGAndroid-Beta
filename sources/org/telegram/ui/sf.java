package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class sf implements View.OnLongClickListener {
    public final int f37731a;
    public final wn f37732b;

    public sf(wn wnVar, int i10) {
        this.f37731a = i10;
        this.f37732b = wnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37731a) {
            case 0:
                wn wnVar = this.f37732b;
                MessageObject messageObject3 = wnVar.f39451d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f39468ea).k(false).j();
                }
                return true;
            case 1:
                return wn.s0(this.f37732b);
            default:
                wn wnVar2 = this.f37732b;
                int i10 = wnVar2.nb;
                if (i10 == 1 && (messageObject2 = wnVar2.p5) != null) {
                    wnVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (wnVar2.f39476f5 != null && i10 == 2 && (messageObject = wnVar2.f39573n5) != null) {
                    wnVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
