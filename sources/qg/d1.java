package qg;

import ci.b6;
import org.telegram.messenger.MessageObject;
public final class d1 extends g.p {
    public final b6 f41613c;

    public d1(b6 b6Var) {
        this.f41613c = b6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        b6 b6Var = this.f41613c;
        int size = (b6Var.f41631s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b6Var.f41632t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
