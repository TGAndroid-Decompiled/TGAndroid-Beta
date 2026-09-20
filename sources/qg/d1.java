package qg;

import ci.c6;
import org.telegram.messenger.MessageObject;
public final class d1 extends g.p {
    public final c6 f41627c;

    public d1(c6 c6Var) {
        this.f41627c = c6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        c6 c6Var = this.f41627c;
        int size = (c6Var.f41645s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = c6Var.f41646t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
