package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class uj extends f2.v {
    public final xn f38954c;

    public uj(xn xnVar) {
        this.f38954c = xnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        xn xnVar = this.f38954c;
        jm jmVar = xnVar.f40234x0;
        int i12 = jmVar.G;
        if (i10 >= i12 && i10 < jmVar.H && (i11 = i10 - i12) >= 0 && i11 < jmVar.L().size() && (X8 = xnVar.X8((messageObject = (MessageObject) xnVar.f40234x0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
