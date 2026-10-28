package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vj extends g.o {
    public final wn f44363c;

    public vj(wn wnVar) {
        this.f44363c = wnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages k92;
        wn wnVar = this.f44363c;
        hm hmVar = wnVar.A0;
        int i12 = hmVar.J;
        if (i10 >= i12 && i10 < hmVar.K && (i11 = i10 - i12) >= 0 && i11 < hmVar.L().size() && (k92 = wnVar.k9((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) != null) {
            return k92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
