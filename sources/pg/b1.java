package pg;

import android.view.View;
import bi.b7;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class b1 extends s4.t {
    public final b7 S;

    public b1(b7 b7Var) {
        super(true);
        this.S = b7Var;
    }

    @Override
    public final boolean B1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        b7 b7Var = this.S;
        ArrayList arrayList = b7Var.f39984s0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = b7Var.f39985t0;
        if (groupedMessages != null && size >= 0 && size < arrayList.size() && (position = groupedMessages.getPosition((MessageObject) arrayList.get(size))) != null && position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
            int size2 = groupedMessages.posArray.size();
            for (int i11 = 0; i11 < size2; i11++) {
                MessageObject.GroupedMessagePosition groupedMessagePosition = groupedMessages.posArray.get(i11);
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
