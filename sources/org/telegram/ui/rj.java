package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class rj extends g.o {
    public final qn f41222c;

    public rj(qn qnVar) {
        this.f41222c = qnVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        qn qnVar = this.f41222c;
        dm dmVar = qnVar.A0;
        int i12 = dmVar.J;
        if (i10 >= i12 && i10 < dmVar.K && (i11 = i10 - i12) >= 0 && i11 < dmVar.L().size() && (c92 = qnVar.c9((messageObject = (MessageObject) qnVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
