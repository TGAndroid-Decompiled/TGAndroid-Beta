package pg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import bi.b7;
import bi.d8;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.ul0;
public final class a1 extends ul0 {
    public final Context f39932c;
    public final ia d;
    public final d8 e;
    public final boolean f39933f;
    public final b7 h;

    public a1(b7 b7Var, Context context, ia iaVar, d8 d8Var, boolean z10) {
        this.h = b7Var;
        this.f39932c = context;
        this.d = iaVar;
        this.e = d8Var;
        this.f39933f = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f39984s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f39984s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        b7 b7Var = this.h;
        ArrayList arrayList = b7Var.f39984s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            MessageObject.GroupedMessages groupedMessages = b7Var.f39985t0;
            if (groupedMessages != null && (position = groupedMessages.getPosition(messageObject)) != null) {
                if (position.minY != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z10 = z12;
            } else {
                z10 = false;
            }
            MessageObject.GroupedMessages groupedMessages2 = b7Var.f39985t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            t1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.f39932c;
        if (i10 == 1) {
            return new s4.c1(new y0(this, context, nVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, nVar);
        z0Var.N7 = true;
        return new s4.c1(z0Var);
    }
}
