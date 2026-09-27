package qg;

import ci.b6;
import org.telegram.messenger.MessageObject;
public final class c1 extends g.p {
    public final b6 f41636c;

    public c1(b6 b6Var) {
        this.f41636c = b6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        b6 b6Var = this.f41636c;
        int size = (b6Var.f41656s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b6Var.f41657t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
