package qg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ci.a7;
import ci.b6;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.pm0;
public final class a1 extends pm0 {
    public final Context f46176c;
    public final ma d;
    public final a7 f46177e;
    public final boolean f46178f;
    public final b6 h;

    public a1(b6 b6Var, Context context, ma maVar, a7 a7Var, boolean z10) {
        this.h = b6Var;
        this.f46176c = context;
        this.d = maVar;
        this.f46177e = a7Var;
        this.f46178f = z10;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.h.f46231s0.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList arrayList = this.h.f46231s0;
        return ((MessageObject) arrayList.get((arrayList.size() - 1) - i10)).contentType;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        boolean z11;
        MessageObject.GroupedMessagePosition position;
        boolean z12;
        b6 b6Var = this.h;
        ArrayList arrayList = b6Var.f46231s0;
        MessageObject messageObject = (MessageObject) arrayList.get((arrayList.size() - 1) - i10);
        View view = d1Var.f47658a;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            MessageObject.GroupedMessages groupedMessages = b6Var.f46232t0;
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
            MessageObject.GroupedMessages groupedMessages2 = b6Var.f46232t0;
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
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        com.google.firebase.messaging.n nVar = this.h.D0;
        Context context = this.f46176c;
        if (i10 == 1) {
            return new s4.d1(new y0(this, context, nVar));
        }
        z0 z0Var = new z0(this, context, UserConfig.selectedAccount, nVar);
        z0Var.N7 = true;
        return new s4.d1(z0Var);
    }
}
