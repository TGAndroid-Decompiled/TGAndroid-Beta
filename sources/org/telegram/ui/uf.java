package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uf implements View.OnLongClickListener {
    public final int f42541a;
    public final zn f42542b;

    public uf(zn znVar, int i10) {
        this.f42541a = i10;
        this.f42542b = znVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f42541a) {
            case 0:
                zn znVar = this.f42542b;
                MessageObject messageObject3 = znVar.f44744d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.f44762ea).k(false).j();
                }
                return true;
            case 1:
                return zn.W(this.f42542b);
            default:
                zn znVar2 = this.f42542b;
                int i10 = znVar2.f44883ob;
                if (i10 == 1 && (messageObject2 = znVar2.p5) != null) {
                    znVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (znVar2.f44770f5 != null && i10 == 2 && (messageObject = znVar2.f44867n5) != null) {
                    znVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
