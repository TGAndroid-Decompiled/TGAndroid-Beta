package qg;

import ci.b6;
import org.telegram.messenger.MessageObject;
public final class c1 extends g.p {
    public final b6 f44987c;

    public c1(b6 b6Var) {
        this.f44987c = b6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        b6 b6Var = this.f44987c;
        int size = (b6Var.f45008s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b6Var.f45009t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
