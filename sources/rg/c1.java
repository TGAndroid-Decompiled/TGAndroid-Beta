package rg;

import ei.r5;
import org.telegram.messenger.MessageObject;
public final class c1 extends g.o {
    public final r5 f45312c;

    public c1(r5 r5Var) {
        this.f45312c = r5Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        r5 r5Var = this.f45312c;
        int size = (r5Var.f45339s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = r5Var.f45340t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
