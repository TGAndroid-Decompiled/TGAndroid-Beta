package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class wj extends f2.v {
    public final zn f39713c;

    public wj(zn znVar) {
        this.f39713c = znVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        zn znVar = this.f39713c;
        lm lmVar = znVar.f40800x0;
        int i12 = lmVar.G;
        if (i10 >= i12 && i10 < lmVar.H && (i11 = i10 - i12) >= 0 && i11 < lmVar.L().size() && (X8 = znVar.X8((messageObject = (MessageObject) znVar.f40800x0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
