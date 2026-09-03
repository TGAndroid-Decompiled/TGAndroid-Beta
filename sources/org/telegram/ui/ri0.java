package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class ri0 extends f2.v {
    public final ui0 f37871c;

    public ri0(ui0 ui0Var) {
        this.f37871c = ui0Var;
    }

    @Override
    public final int i(int i10) {
        ui0 ui0Var = this.f37871c;
        ArrayList arrayList = ui0Var.K;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        MessageObject.GroupedMessages l10 = ui0Var.l(messageObject);
        if (l10 != null) {
            return l10.getPosition(messageObject).spanSize;
        }
        return 1000;
    }
}
