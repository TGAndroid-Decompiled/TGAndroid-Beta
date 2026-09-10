package pg;

import bi.b7;
import org.telegram.messenger.MessageObject;
public final class c1 extends g.p {
    public final b7 f39964c;

    public c1(b7 b7Var) {
        this.f39964c = b7Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        b7 b7Var = this.f39964c;
        int size = (b7Var.f39984s0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b7Var.f39985t0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
