package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class uf implements View.OnLongClickListener {
    public final int f41109a;
    public final co f41110b;

    public uf(co coVar, int i10) {
        this.f41109a = i10;
        this.f41110b = coVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f41109a) {
            case 0:
                co coVar = this.f41110b;
                MessageObject messageObject3 = coVar.f35257d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35275ea).k(false).j();
                }
                return true;
            case 1:
                return co.R0(this.f41110b);
            default:
                co coVar2 = this.f41110b;
                int i10 = coVar2.f35396ob;
                if (i10 == 1 && (messageObject2 = coVar2.p5) != null) {
                    coVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (coVar2.f35283f5 != null && i10 == 2 && (messageObject = coVar2.f35380n5) != null) {
                    coVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
