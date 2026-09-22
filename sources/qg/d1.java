package qg;

import ci.c6;
import org.telegram.messenger.MessageObject;
public final class d1 extends g.p {
    public final c6 f41648c;

    public d1(c6 c6Var) {
        this.f41648c = c6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        c6 c6Var = this.f41648c;
        int size = (c6Var.f41666s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = c6Var.f41667t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
