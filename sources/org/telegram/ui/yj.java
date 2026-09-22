package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class yj extends g.p {
    public final zn f39971c;

    public yj(zn znVar) {
        this.f39971c = znVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        zn znVar = this.f39971c;
        lm lmVar = znVar.A0;
        int i12 = lmVar.J;
        if (i10 >= i12 && i10 < lmVar.K && (i11 = i10 - i12) >= 0 && i11 < lmVar.L().size() && (X8 = znVar.X8((messageObject = (MessageObject) znVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
