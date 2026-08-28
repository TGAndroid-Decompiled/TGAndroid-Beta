package yf;

import kh.s5;
import org.telegram.messenger.MessageObject;
public final class c1 extends f2.x {
    public final s5 f49774c;

    public c1(s5 s5Var) {
        this.f49774c = s5Var;
    }

    @Override
    public final int i(int i9) {
        MessageObject.GroupedMessagePosition position;
        s5 s5Var = this.f49774c;
        int size = (s5Var.f49794o0.size() - 1) - i9;
        MessageObject.GroupedMessages groupedMessages = s5Var.f49795p0;
        if (groupedMessages != null && size >= 0 && size < groupedMessages.messages.size() && (position = groupedMessages.getPosition(groupedMessages.messages.get(size))) != null) {
            return position.spanSize;
        }
        return 1000;
    }
}
