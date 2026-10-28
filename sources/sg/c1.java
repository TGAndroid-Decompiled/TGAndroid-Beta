package sg;

import fi.q5;
import org.telegram.messenger.MessageObject;
public final class c1 extends g.o {
    public final q5 f48203c;

    public c1(q5 q5Var) {
        this.f48203c = q5Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        q5 q5Var = this.f48203c;
        int size = (q5Var.f48240s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = q5Var.f48241t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
