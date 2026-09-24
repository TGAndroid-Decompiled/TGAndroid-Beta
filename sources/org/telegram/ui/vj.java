package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class vj extends g.p {
    public final wn f38746c;

    public vj(wn wnVar) {
        this.f38746c = wnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        wn wnVar = this.f38746c;
        jm jmVar = wnVar.A0;
        int i12 = jmVar.J;
        if (i10 >= i12 && i10 < jmVar.K && (i11 = i10 - i12) >= 0 && i11 < jmVar.L().size() && (X8 = wnVar.X8((messageObject = (MessageObject) wnVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
