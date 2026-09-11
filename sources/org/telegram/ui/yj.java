package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class yj extends g.p {
    public final co f43160c;

    public yj(co coVar) {
        this.f43160c = coVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        co coVar = this.f43160c;
        om omVar = coVar.A0;
        int i12 = omVar.J;
        if (i10 >= i12 && i10 < omVar.K && (i11 = i10 - i12) >= 0 && i11 < omVar.L().size() && (X8 = coVar.X8((messageObject = (MessageObject) coVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
