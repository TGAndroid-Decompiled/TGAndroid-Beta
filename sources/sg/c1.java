package sg;

import android.view.View;
import fi.q5;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class c1 extends s4.u {
    public final q5 S;

    public c1(q5 q5Var) {
        super(true);
        this.S = q5Var;
    }

    @Override
    public final boolean C1(int i10) {
        MessageObject.GroupedMessagePosition position;
        byte b10;
        q5 q5Var = this.S;
        ArrayList arrayList = q5Var.f48211s0;
        int size = (arrayList.size() - 1) - i10;
        MessageObject.GroupedMessages groupedMessages = q5Var.f48212t0;
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
    public final boolean D1(View view) {
        if (view instanceof org.telegram.ui.Cells.s1) {
            return !((org.telegram.ui.Cells.s1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final boolean y0() {
        return false;
    }
}
