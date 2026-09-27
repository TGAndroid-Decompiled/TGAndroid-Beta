package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class vi0 extends g.p {
    public final yi0 f38620c;

    public vi0(yi0 yi0Var) {
        this.f38620c = yi0Var;
    }

    @Override
    public final int i(int i10) {
        yi0 yi0Var = this.f38620c;
        ArrayList arrayList = yi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = yi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
