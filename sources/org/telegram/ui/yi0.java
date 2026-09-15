package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class yi0 extends g.p {
    public final bj0 f39918c;

    public yi0(bj0 bj0Var) {
        this.f39918c = bj0Var;
    }

    @Override
    public final int i(int i10) {
        bj0 bj0Var = this.f39918c;
        ArrayList arrayList = bj0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = bj0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
