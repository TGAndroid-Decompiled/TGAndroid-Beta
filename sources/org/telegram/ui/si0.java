package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class si0 extends g.p {
    public final vi0 f37801c;

    public si0(vi0 vi0Var) {
        this.f37801c = vi0Var;
    }

    @Override
    public final int i(int i10) {
        vi0 vi0Var = this.f37801c;
        ArrayList arrayList = vi0Var.N;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l4 = vi0Var.l(messageObject);
        if (l4 != null) {
            return l4.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
