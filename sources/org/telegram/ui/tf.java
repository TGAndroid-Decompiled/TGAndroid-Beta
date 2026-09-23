package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class tf implements View.OnLongClickListener {
    public final int f37629a;
    public final xn f37630b;

    public tf(xn xnVar, int i10) {
        this.f37629a = i10;
        this.f37630b = xnVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f37629a) {
            case 0:
                xn xnVar = this.f37630b;
                MessageObject messageObject3 = xnVar.f39353d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39370ea).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.f37630b);
            default:
                xn xnVar2 = this.f37630b;
                int i10 = xnVar2.nb;
                if (i10 == 1 && (messageObject2 = xnVar2.p5) != null) {
                    xnVar2.F(messageObject2.getId(), 0, 0, 0, true, true);
                    return true;
                } else if (xnVar2.f39378f5 != null && i10 == 2 && (messageObject = xnVar2.f39475n5) != null) {
                    xnVar2.F(messageObject.getId(), 0, 0, 0, true, true);
                    return true;
                } else {
                    return false;
                }
        }
    }
}
