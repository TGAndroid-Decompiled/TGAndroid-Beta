package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class wi0 extends g.p {
    public final zi0 f42509c;

    public wi0(zi0 zi0Var) {
        this.f42509c = zi0Var;
    }

    @Override
    public final int i(int i10) {
        zi0 zi0Var = this.f42509c;
        ArrayList arrayList = zi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = zi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
