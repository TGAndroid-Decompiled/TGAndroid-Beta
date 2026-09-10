package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class vf implements View.OnLongClickListener {
    public final int f37548a;
    public final eo f37549b;

    public vf(eo eoVar, int i10) {
        this.f37548a = i10;
        this.f37549b = eoVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37548a) {
            case 0:
                eo eoVar = this.f37549b;
                MessageObject messageObject3 = eoVar.f32299d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.f32316ea).k(false).j();
                }
                return true;
            case 1:
                return eo.R0(this.f37549b);
            default:
                eo eoVar2 = this.f37549b;
                int i10 = eoVar2.f32437ob;
                if (i10 == 1 && (messageObject2 = eoVar2.p5) != null) {
                    eoVar2.E(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (eoVar2.f32324f5 != null && i10 == 2 && (messageObject = eoVar2.f32421n5) != null) {
                    eoVar2.E(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
