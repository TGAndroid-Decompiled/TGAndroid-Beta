package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class xj extends g.p {
    public final xn f39668c;

    public xj(xn xnVar) {
        this.f39668c = xnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages X8;
        xn xnVar = this.f39668c;
        km kmVar = xnVar.A0;
        int i12 = kmVar.J;
        if (i10 >= i12 && i10 < kmVar.K && (i11 = i10 - i12) >= 0 && i11 < kmVar.L().size() && (X8 = xnVar.X8((messageObject = (MessageObject) xnVar.A0.L().get(i11)))) != null) {
            return X8.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
