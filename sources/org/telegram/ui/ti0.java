package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ti0 extends g.p {
    public final wi0 f37698c;

    public ti0(wi0 wi0Var) {
        this.f37698c = wi0Var;
    }

    @Override
    public final int i(int i10) {
        wi0 wi0Var = this.f37698c;
        ArrayList arrayList = wi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = wi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
