package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
public final class ri0 extends s4.t {
    public final vi0 S;

    public ri0(vi0 vi0Var) {
        super(true);
        this.S = vi0Var;
    }

    @Override
    public final boolean B1(int i10) {
        byte b10;
        vi0 vi0Var = this.S;
        MessageObject messageObject = (MessageObject) vi0Var.N.get((B() - 1) - i10);
        MessageObject.GroupedMessages l4 = vi0Var.l(messageObject);
        if (l4 != null) {
            MessageObject.GroupedMessagePosition position = l4.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = l4.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = l4.posArray.get(i11);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final boolean C1(View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            return !((org.telegram.ui.Cells.u1) view).getMessageObject().isOutOwner();
        }
        return false;
    }

    @Override
    public final int j(s4.z0 z0Var) {
        return B0(z0Var);
    }

    @Override
    public final int k(s4.z0 z0Var) {
        return C0(z0Var);
    }

    @Override
    public final int l(s4.z0 z0Var) {
        return D0(z0Var);
    }

    @Override
    public final boolean y0() {
        return true;
    }
}
