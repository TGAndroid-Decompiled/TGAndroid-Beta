package yf;

import android.view.View;
import java.util.ArrayList;
import kh.s5;
import org.telegram.messenger.MessageObject;
public final class b1 extends f2.z {
    public final s5 S;

    public b1(s5 s5Var) {
        super(true);
        this.S = s5Var;
    }

    @Override
    public final boolean B1(int i9) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        s5 s5Var = this.S;
        ArrayList arrayList = s5Var.f49794o0;
        int size = (arrayList.size() - 1) - i9;
        MessageObject.GroupedMessages groupedMessages = s5Var.f49795p0;
        if (groupedMessages != null && size >= 0 && size < arrayList.size() && (position = groupedMessages.getPosition((MessageObject) arrayList.get(size))) != null && position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
            int size2 = groupedMessages.posArray.size();
            for (int i10 = 0; i10 < size2; i10++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.posArray.get(i10);
                if (groupedMessagePosition != position) {
                    byte b11 = groupedMessagePosition.minY;
                    byte b12 = position.minY;
                    if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            return !((org.telegram.ui.Cells.t1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
