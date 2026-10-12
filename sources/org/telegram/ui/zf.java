package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class zf implements View.OnLongClickListener {
    public final int f44810a;
    public final eo f44811b;

    public zf(eo eoVar, int i10) {
        this.f44810a = i10;
        this.f44811b = eoVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f44810a) {
            case 0:
                eo eoVar = this.f44811b;
                MessageObject messageObject3 = eoVar.f37238d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.f37256ea).k(false).j();
                }
                return true;
            case 1:
                return eo.W(this.f44811b);
            default:
                eo eoVar2 = this.f44811b;
                int i10 = eoVar2.f37377ob;
                if (i10 == 1 && (messageObject2 = eoVar2.p5) != null) {
                    eoVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (eoVar2.f37264f5 != null && i10 == 2 && (messageObject = eoVar2.f37361n5) != null) {
                    eoVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
