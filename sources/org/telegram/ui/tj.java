package org.telegram.ui;

import org.telegram.messenger.MessageObject;
public final class tj extends g.o {
    public final sn f41759c;

    public tj(sn snVar) {
        this.f41759c = snVar;
    }

    @Override
    public final int i(int i10) {
        int i11;
        MessageObject messageObject;
        MessageObject.GroupedMessages c92;
        sn snVar = this.f41759c;
        fm fmVar = snVar.A0;
        int i12 = fmVar.J;
        if (i10 >= i12 && i10 < fmVar.K && (i11 = i10 - i12) >= 0 && i11 < fmVar.L().size() && (c92 = snVar.c9((messageObject = (MessageObject) snVar.A0.L().get(i11)))) != null) {
            return c92.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
