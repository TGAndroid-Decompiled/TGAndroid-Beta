package rg;

import di.a6;
import org.telegram.messenger.MessageObject;
public final class e1 extends g.o {
    public final a6 f44002c;

    public e1(a6 a6Var) {
        this.f44002c = a6Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        a6 a6Var = this.f44002c;
        int size = (a6Var.f44019s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = a6Var.f44020t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
