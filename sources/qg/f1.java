package qg;

import ci.c6;
import org.telegram.messenger.MessageObject;
public final class f1 extends g.p {
    public final c6 f41353c;

    public f1(c6 c6Var) {
        this.f41353c = c6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        c6 c6Var = this.f41353c;
        int size = (c6Var.f41368s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = c6Var.f41369t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
