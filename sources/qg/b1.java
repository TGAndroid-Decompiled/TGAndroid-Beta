package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.c6;
import ci.c7;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.xl0;
public final class b1 extends xl0 {
    public final Context f41621c;
    public final ia d;
    public final c7 e;
    public final boolean f41622f;
    public final c6 h;

    public b1(c6 c6Var, Context context, ia iaVar, c7 c7Var, boolean z10) {
        this.h = c6Var;
        this.f41621c = context;
        this.d = iaVar;
        this.e = c7Var;
        this.f41622f = z10;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f41666s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f41666s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        c6 c6Var = this.h;
        ArrayList arrayList = c6Var.f41666s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = c1Var.f42995a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject.GroupedMessages groupedMessages = c6Var.f41667t0;
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
            MessageObject.GroupedMessages groupedMessages2 = c6Var.f41667t0;
            if (groupedMessages2 != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            u1Var.X3(messageObject, groupedMessages2, z11, z10, false, false);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setMessageObject(messageObject);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.f41621c;
        if (i10 == 1) {
            return new s4.c1(new z0(this, context, nVar));
        }
        a1 a1Var = new a1(this, context, UserConfig.selectedAccount, nVar);
        a1Var.N7 = true;
        return new s4.c1(a1Var);
    }
}
