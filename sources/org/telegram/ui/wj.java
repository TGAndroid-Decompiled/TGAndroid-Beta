package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wj extends g.p {
    public final yn f42511c;

    public wj(yn ynVar) {
        this.f42511c = ynVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages Y8;
        yn ynVar = this.f42511c;
        jm jmVar = ynVar.f43572y0;
        int i12 = jmVar.J;
        if (i10 >= i12 && i10 < jmVar.K && (i11 = i10 - i12) >= 0 && i11 < jmVar.L().size() && (Y8 = ynVar.Y8((messageObject = (MessageObject) ynVar.f43572y0.L().get(i11)))) != null) {
            return Y8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
