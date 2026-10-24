package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class rj extends g.o {
    public final sn f41171c;

    public rj(sn snVar) {
        this.f41171c = snVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        sn snVar = this.f41171c;
        em emVar = snVar.A0;
        int i12 = emVar.J;
        if (i10 >= i12 && i10 < emVar.K && (i11 = i10 - i12) >= 0 && i11 < emVar.L().size() && (c92 = snVar.c9((messageObject = (MessageObject) snVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
