package zf;

import lh.r5;
import org.telegram.messenger.MessageObject;

public final class c1 extends f2.w {

    public final r5 f50359c;

    public c1(r5 r5Var) {
        this.f50359c = r5Var;
    }

    @Override
    public final int i(int i10) {
        MessageObject.GroupedMessagePosition position;
        r5 r5Var = this.f50359c;
        int size = (r5Var.f50389o0.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = r5Var.f50390p0;
        if (groupedMessages == null || size < 0 || size >= groupedMessages.messages.size() || (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) == null) {
            return 1000;
        }
        return position.spanSize;
    }
}
