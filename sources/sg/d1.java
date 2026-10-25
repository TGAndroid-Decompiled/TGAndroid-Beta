package sg;

import fi.q5;
import org.telegram.messenger.MessageObject;
public final class d1 extends g.o {
    public final q5 f48176c;

    public d1(q5 q5Var) {
        this.f48176c = q5Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        q5 q5Var = this.f48176c;
        int size = (q5Var.f48211s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = q5Var.f48212t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
