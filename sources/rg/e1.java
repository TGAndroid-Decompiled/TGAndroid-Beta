package rg;

import di.c6;
import org.telegram.messenger.MessageObject;
public final class e1 extends g.p {
    public final c6 f45172c;

    public e1(c6 c6Var) {
        this.f45172c = c6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        c6 c6Var = this.f45172c;
        int size = (c6Var.f45191s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = c6Var.f45192t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
