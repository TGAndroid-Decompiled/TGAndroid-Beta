package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class sj extends g.o {
    public final un f43526c;

    public sj(un unVar) {
        this.f43526c = unVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages h92;
        un unVar = this.f43526c;
        fm fmVar = unVar.A0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (h92 = unVar.h9((messageObject = (MessageObject) unVar.A0.L().get(i11)))) != null) {
            return h92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
