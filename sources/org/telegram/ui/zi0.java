package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class zi0 extends g.p {
    public final cj0 f43446c;

    public zi0(cj0 cj0Var) {
        this.f43446c = cj0Var;
    }

    @Override
    public final int i(int i10) {
        cj0 cj0Var = this.f43446c;
        ArrayList arrayList = cj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = cj0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
