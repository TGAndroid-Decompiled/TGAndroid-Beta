package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class yj extends g.p {
    public final bo f39892c;

    public yj(bo boVar) {
        this.f39892c = boVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        bo boVar = this.f39892c;
        nm nmVar = boVar.A0;
        int i12 = nmVar.J;
        if (i10 >= i12 && i10 < nmVar.K && (i11 = i10 - i12) >= 0 && i11 < nmVar.L().size() && (X8 = boVar.X8((messageObject = (MessageObject) boVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
